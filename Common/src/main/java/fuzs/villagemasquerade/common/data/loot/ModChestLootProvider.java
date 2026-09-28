package fuzs.villagemasquerade.common.data.loot;

import fuzs.puzzleslib.common.api.data.v3.loot.AbstractLootSubProvider;
import fuzs.villagemasquerade.common.init.ModItems;
import fuzs.villagemasquerade.common.init.ModLootTables;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.EmptyLootItem;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;

public class ModChestLootProvider extends AbstractLootSubProvider {

    public ModChestLootProvider(LootTableSubProvider.Context output) {
        super(output);
    }

    @Override
    public void generate() {
        this.output.accept(ModLootTables.VILLAGE_PLAINS_HOUSE_INJECTION, this.villageHouse());
        this.output.accept(ModLootTables.VILLAGE_DESERT_HOUSE_INJECTION, this.villageHouse());
        this.output.accept(ModLootTables.VILLAGE_SNOWY_HOUSE_INJECTION, this.villageHouse());
        this.output.accept(ModLootTables.VILLAGE_TAIGA_HOUSE_INJECTION, this.villageHouse());
        this.output.accept(ModLootTables.VILLAGE_SAVANNA_HOUSE_INJECTION, this.villageHouse());
        this.output.accept(ModLootTables.IGLOO_CHEST_INJECTION,
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ContextIntProviders.exactly(1))
                                .add(LootItem.lootTableItem(ModItems.SANTA_HAT_ITEM.value()))
                                .add(LootItem.lootTableItem(ModItems.SANTA_COAT_ITEM.value()))
                                .add(LootItem.lootTableItem(ModItems.SANTA_LEGGINGS_ITEM.value()))
                                .add(EmptyLootItem.emptyItem().setWeight(3))));
    }

    public final LootTable.Builder villageHouse() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ContextIntProviders.exactly(1))
                        .add(LootItem.lootTableItem(ModItems.LEGACY_FARMER_ROBE_ITEM.value()))
                        .add(LootItem.lootTableItem(ModItems.LEGACY_LIBRARIAN_ROBE_ITEM.value()))
                        .add(LootItem.lootTableItem(ModItems.LEGACY_PRIEST_ROBE_ITEM.value()))
                        .add(LootItem.lootTableItem(ModItems.LEGACY_NITWIT_ROBE_ITEM.value()))
                        .add(EmptyLootItem.emptyItem().setWeight(4)))
                .withPool(LootPool.lootPool()
                        .setRolls(ContextIntProviders.exactly(1))
                        .add(LootItem.lootTableItem(ModItems.LEGACY_FARMER_LEGGINGS_ITEM.value()))
                        .add(LootItem.lootTableItem(ModItems.LEGACY_LIBRARIAN_LEGGINGS_ITEM.value()))
                        .add(LootItem.lootTableItem(ModItems.LEGACY_PRIEST_LEGGINGS_ITEM.value()))
                        .add(LootItem.lootTableItem(ModItems.LEGACY_NITWIT_LEGGINGS_ITEM.value()))
                        .add(EmptyLootItem.emptyItem().setWeight(4)));
    }
}
