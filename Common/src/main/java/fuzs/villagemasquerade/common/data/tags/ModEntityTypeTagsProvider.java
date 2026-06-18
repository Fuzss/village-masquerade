package fuzs.villagemasquerade.common.data.tags;

import fuzs.puzzleslib.common.api.data.v2.core.DataProviderContext;
import fuzs.puzzleslib.common.api.data.v2.tags.AbstractTagProvider;
import fuzs.villagemasquerade.common.init.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityTypeIds;

public class ModEntityTypeTagsProvider extends AbstractTagProvider<EntityType<?>> {

    public ModEntityTypeTagsProvider(DataProviderContext context) {
        super(Registries.ENTITY_TYPE, context);
    }

    @Override
    public void addTags(HolderLookup.Provider registries) {
        this.tag(ModTags.FASHIONABLE_ENTITY_TYPE_TAG)
                .add(EntityTypeIds.ARMOR_STAND,
                        EntityTypeIds.BOGGED,
                        EntityTypeIds.DROWNED,
                        EntityTypeIds.HUSK,
                        EntityTypeIds.PIGLIN,
                        EntityTypeIds.PIGLIN_BRUTE,
                        EntityTypeIds.PLAYER,
                        EntityTypeIds.STRAY,
                        EntityTypeIds.SKELETON,
                        EntityTypeIds.WITHER_SKELETON,
                        EntityTypeIds.ZOMBIE,
                        EntityTypeIds.ZOMBIFIED_PIGLIN);
    }
}
