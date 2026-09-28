package fuzs.villagemasquerade.common.data.loot;

import fuzs.puzzleslib.common.api.data.v3.loot.AbstractBlockLootSubProvider;
import fuzs.villagemasquerade.common.init.ModBlocks;
import net.minecraft.data.loot.LootTableSubProvider;

public class ModBlockLootProvider extends AbstractBlockLootSubProvider {

    public ModBlockLootProvider(LootTableSubProvider.Context output) {
        super(output);
    }

    @Override
    public void generate() {
        this.add(ModBlocks.VILLAGER_HEAD_BLOCK.value(), this::createHeadDrop);
        this.add(ModBlocks.IRON_GOLEM_HEAD_BLOCK.value(), this::createHeadDrop);
        this.add(ModBlocks.ILLAGER_HEAD_BLOCK.value(), this::createHeadDrop);
    }
}
