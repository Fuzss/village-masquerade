package fuzs.villagemasquerade.neoforge;

import fuzs.puzzleslib.common.api.core.v1.ModConstructor;
import fuzs.puzzleslib.neoforge.api.data.v3.core.DataProviderBuilder;
import fuzs.villagemasquerade.common.VillageMasquerade;
import fuzs.villagemasquerade.common.data.loot.ModBlockLootProvider;
import fuzs.villagemasquerade.common.data.loot.ModChestLootProvider;
import fuzs.villagemasquerade.common.data.loot.ModEntityLootProvider;
import fuzs.villagemasquerade.common.data.tags.ModEntityTypeTagsProvider;
import fuzs.villagemasquerade.common.data.tags.ModItemTagsProvider;
import fuzs.villagemasquerade.common.data.tags.ModMobEffectTagsProvider;
import fuzs.villagemasquerade.common.data.tags.ModVillagerTradeTagsProvider;
import fuzs.villagemasquerade.common.init.ModVillagerTraders;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.fml.common.Mod;

@Mod(VillageMasquerade.MOD_ID)
public class VillageMasqueradeNeoForge {

    public VillageMasqueradeNeoForge() {
        ModConstructor.construct(VillageMasquerade.MOD_ID, VillageMasquerade::new);
        DataProviderBuilder.of(VillageMasquerade.MOD_ID)
                .addWorldBootstrap(Registries.VILLAGER_TRADE, ModVillagerTraders::bootstrap)
                .addProvider(ModEntityTypeTagsProvider::new,
                        ModItemTagsProvider::new,
                        ModMobEffectTagsProvider::new,
                        ModVillagerTradeTagsProvider::new)
                .addLootProvider(ModBlockLootProvider::new, LootContextParamSets.BLOCK)
                .addLootProvider(ModChestLootProvider::new, LootContextParamSets.CHEST)
                .addLootProvider(ModEntityLootProvider::new, LootContextParamSets.ENTITY);
    }
}
