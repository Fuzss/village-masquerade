package fuzs.villagemasquerade.common.data.tags;

import fuzs.puzzleslib.common.api.data.v2.core.DataProviderContext;
import fuzs.puzzleslib.common.api.data.v2.tags.AbstractTagProvider;
import fuzs.villagemasquerade.common.init.ModVillagerTraders;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.VillagerTradeTags;
import net.minecraft.world.item.trading.VillagerTrade;

public class ModVillagerTradeTagsProvider extends AbstractTagProvider<VillagerTrade> {

    public ModVillagerTradeTagsProvider(DataProviderContext context) {
        super(Registries.VILLAGER_TRADE, context);
    }

    @Override
    public void addTags(HolderLookup.Provider registries) {
        this.tag(VillagerTradeTags.ARMORER_LEVEL_5)
                .addKey(ModVillagerTraders.ARMORER_5_EMERALD_ARMORER_GOGGLES)
                .addKey(ModVillagerTraders.ARMORER_5_EMERALD_ARMORER_APRON);
        this.tag(VillagerTradeTags.BUTCHER_LEVEL_5)
                .addKey(ModVillagerTraders.BUTCHER_5_EMERALD_BUTCHER_HEADBAND)
                .addKey(ModVillagerTraders.BUTCHER_5_EMERALD_BUTCHER_APRON);
        this.tag(VillagerTradeTags.CARTOGRAPHER_LEVEL_5)
                .addKey(ModVillagerTraders.CARTOGRAPHER_5_EMERALD_CARTOGRAPHER_MONOCLE)
                .addKey(ModVillagerTraders.CARTOGRAPHER_5_EMERALD_CARTOGRAPHER_HARNESS);
        this.tag(VillagerTradeTags.CLERIC_LEVEL_5)
                .addKey(ModVillagerTraders.CLERIC_5_EMERALD_CLERIC_COLLAR)
                .addKey(ModVillagerTraders.CLERIC_5_EMERALD_CLERIC_ROBE);
        this.tag(VillagerTradeTags.FARMER_LEVEL_5)
                .addKey(ModVillagerTraders.FARMER_5_EMERALD_FARMER_HAT)
                .addKey(ModVillagerTraders.FARMER_5_EMERALD_FARMER_BELT);
        this.tag(VillagerTradeTags.FISHERMAN_LEVEL_5)
                .addKey(ModVillagerTraders.FISHERMAN_5_EMERALD_FISHERMAN_HAT)
                .addKey(ModVillagerTraders.FISHERMAN_5_EMERALD_FISHERMAN_VEST)
                .addKey(ModVillagerTraders.FISHERMAN_5_EMERALD_FISHERMAN_LEGGINGS);
        this.tag(VillagerTradeTags.FLETCHER_LEVEL_5)
                .addKey(ModVillagerTraders.FLETCHER_5_EMERALD_FLETCHER_HAT)
                .addKey(ModVillagerTraders.FLETCHER_5_EMERALD_FLETCHER_BELT);
        this.tag(VillagerTradeTags.LEATHERWORKER_LEVEL_5)
                .addKey(ModVillagerTraders.LEATHERWORKER_5_EMERALD_LEATHERWORKER_APRON);
        this.tag(VillagerTradeTags.LIBRARIAN_LEVEL_5)
                .addKey(ModVillagerTraders.LIBRARIAN_5_EMERALD_LIBRARIAN_HEADWEAR)
                .addKey(ModVillagerTraders.LIBRARIAN_5_EMERALD_LIBRARIAN_TOGA);
        this.tag(VillagerTradeTags.MASON_LEVEL_5).addKey(ModVillagerTraders.MASON_5_EMERALD_MASON_APRON);
        this.tag(VillagerTradeTags.SHEPHERD_LEVEL_5)
                .addKey(ModVillagerTraders.SHEPHERD_5_EMERALD_SHEPHERD_HAT)
                .addKey(ModVillagerTraders.SHEPHERD_5_EMERALD_SHEPHERD_VEST);
        this.tag(VillagerTradeTags.TOOLSMITH_LEVEL_5).addKey(ModVillagerTraders.TOOLSMITH_5_EMERALD_TOOLSMITH_APRON);
        this.tag(VillagerTradeTags.WEAPONSMITH_LEVEL_5)
                .addKey(ModVillagerTraders.WEAPONSMITH_5_EMERALD_WEAPONSMITH_EYEPATCH)
                .addKey(ModVillagerTraders.WEAPONSMITH_5_EMERALD_WEAPONSMITH_APRON);
        this.tag(VillagerTradeTags.WANDERING_TRADER_UNCOMMON)
                .addKey(ModVillagerTraders.WANDERING_TRADER_EMERALD_WANDERING_TRADER_HOOD)
                .addKey(ModVillagerTraders.WANDERING_TRADER_EMERALD_WANDERING_TRADER_ROBE)
                .addKey(ModVillagerTraders.WANDERING_TRADER_EMERALD_WANDERING_TRADER_LEGGINGS);
    }
}
