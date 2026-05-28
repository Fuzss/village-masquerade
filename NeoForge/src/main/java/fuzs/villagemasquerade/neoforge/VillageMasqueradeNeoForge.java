package fuzs.villagemasquerade.neoforge;

import fuzs.puzzleslib.common.api.core.v1.ModConstructor;
import fuzs.puzzleslib.neoforge.api.data.v2.core.DataProviderHelper;
import fuzs.villagemasquerade.common.VillageMasquerade;
import fuzs.villagemasquerade.common.data.loot.ModBlockLootProvider;
import fuzs.villagemasquerade.common.data.loot.ModChestLootProvider;
import fuzs.villagemasquerade.common.data.loot.ModEntityLootProvider;
import fuzs.villagemasquerade.common.data.tags.ModEntityTypeTagsProvider;
import fuzs.villagemasquerade.common.data.tags.ModItemTagsProvider;
import fuzs.villagemasquerade.common.data.tags.ModMobEffectTagsProvider;
import fuzs.villagemasquerade.common.data.tags.ModVillagerTradeTagsProvider;
import fuzs.villagemasquerade.common.init.ModRegistry;
import net.neoforged.fml.common.Mod;

@Mod(VillageMasquerade.MOD_ID)
public class VillageMasqueradeNeoForge {

    public VillageMasqueradeNeoForge() {
        ModConstructor.construct(VillageMasquerade.MOD_ID, VillageMasquerade::new);
        DataProviderHelper.registerDataProviders(VillageMasquerade.MOD_ID,
                ModRegistry.REGISTRY_SET_BUILDER,
                ModBlockLootProvider::new,
                ModChestLootProvider::new,
                ModEntityLootProvider::new,
                ModEntityTypeTagsProvider::new,
                ModItemTagsProvider::new,
                ModMobEffectTagsProvider::new,
                ModVillagerTradeTagsProvider::new);
    }
}
