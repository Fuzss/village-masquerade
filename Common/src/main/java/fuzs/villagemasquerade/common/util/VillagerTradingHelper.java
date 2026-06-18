package fuzs.villagemasquerade.common.util;

import fuzs.villagemasquerade.common.init.ModRegistry;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponentPatch;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.npc.villager.Villager;
import net.minecraft.world.entity.npc.villager.VillagerData;
import net.minecraft.world.entity.npc.villager.VillagerProfession;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.item.trading.TradeCost;
import net.minecraft.world.item.trading.VillagerTrade;

import java.util.List;
import java.util.Optional;

public class VillagerTradingHelper {

    public static VillagerTrade createVillagerTrade(Holder<Item> item, EquipmentSlot equipmentSlot) {
        return createTrade(item, equipmentSlot, 30, 0.2F);
    }

    public static VillagerTrade createWanderingTraderTrade(Holder<Item> item, EquipmentSlot equipmentSlot) {
        return createTrade(item, equipmentSlot, 1, 0.05F);
    }

    private static VillagerTrade createTrade(Holder<Item> item, EquipmentSlot equipmentSlot, int villagerXp, float priceMultiplier) {
        int priceForPiece = getPriceForPiece(equipmentSlot);
        return new VillagerTrade(new TradeCost(Items.EMERALD, priceForPiece),
                new ItemStackTemplate(item, 1, DataComponentPatch.EMPTY),
                1,
                villagerXp,
                priceMultiplier,
                Optional.empty(),
                List.of());
    }

    private static int getPriceForPiece(EquipmentSlot equipmentSlot) {
        return switch (equipmentSlot) {
            case FEET, HEAD -> 8;
            case CHEST -> 16;
            case LEGS -> 12;
            default -> throw new IllegalArgumentException();
        };
    }

    public static void updateSpecialPrices(Villager villager, Player player) {
        int equippedArmorForProfession = getEquippedArmorForProfession(player, villager.getVillagerData());
        if (equippedArmorForProfession > 0) {
            // same as hero of the village effect, but does stack with it
            for (MerchantOffer merchantOffer : villager.getOffers()) {
                double priceMultiplier = 0.3 + 0.0625 * equippedArmorForProfession;
                int newPriceInItems = (int) Math.floor(priceMultiplier * merchantOffer.getBaseCostA().getCount());
                merchantOffer.addToSpecialPriceDiff(-Math.max(newPriceInItems, 1));
            }
        }
    }

    private static int getEquippedArmorForProfession(Player player, VillagerData villagerData) {
        int equippedArmorForProfession = 0;
        for (EquipmentSlot equipmentSlot : EquipmentSlotGroup.ARMOR) {
            if (equipmentSlot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR) {
                ItemStack itemStack = player.getItemBySlot(equipmentSlot);
                ResourceKey<VillagerProfession> resourceKey = itemStack.get(ModRegistry.VILLAGER_PROFESSION_DATA_COMPONENT_TYPE.value());
                if (resourceKey != null && villagerData.profession().is(resourceKey)) {
                    equippedArmorForProfession++;
                }
            }
        }

        return equippedArmorForProfession;
    }
}
