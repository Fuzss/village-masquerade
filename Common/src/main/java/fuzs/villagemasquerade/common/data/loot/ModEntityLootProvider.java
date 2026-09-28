package fuzs.villagemasquerade.common.data.loot;

import fuzs.puzzleslib.common.api.data.v3.loot.AbstractLootSubProvider;
import fuzs.villagemasquerade.common.init.ModItems;
import fuzs.villagemasquerade.common.init.ModLootTables;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LootItemKilledByPlayerCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceWithEnchantedBonusCondition;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;

public class ModEntityLootProvider extends AbstractLootSubProvider {

    public ModEntityLootProvider(LootTableSubProvider.Context output) {
        super(output);
    }

    @Override
    public void generate() {
        HolderGetter<Enchantment> enchantments = this.output.lookup(Registries.ENCHANTMENT);
        this.output.accept(ModLootTables.EVOKER_INJECTION,
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ContextIntProviders.exactly(1))
                                .add(LootItem.lootTableItem(ModItems.EVOKER_ROBE_ITEM.value()))
                                .add(LootItem.lootTableItem(ModItems.EVOKER_LEGGINGS_ITEM.value()))
                                .when(LootItemKilledByPlayerCondition.killedByPlayer())
                                .when(LootItemRandomChanceWithEnchantedBonusCondition.randomChanceAndLootingBoost(enchantments,
                                        0.025F,
                                        0.01F))));
        this.output.accept(ModLootTables.VINDICATOR_INJECTION,
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ContextIntProviders.exactly(1))
                                .add(LootItem.lootTableItem(ModItems.VINDICATOR_JACKET_ITEM.value()))
                                .add(LootItem.lootTableItem(ModItems.VINDICATOR_LEGGINGS_ITEM.value()))
                                .when(LootItemKilledByPlayerCondition.killedByPlayer())
                                .when(LootItemRandomChanceWithEnchantedBonusCondition.randomChanceAndLootingBoost(enchantments,
                                        0.025F,
                                        0.01F))));
        this.output.accept(ModLootTables.PILLAGER_INJECTION,
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ContextIntProviders.exactly(1))
                                .add(LootItem.lootTableItem(ModItems.PILLAGER_JACKET_ITEM.value()))
                                .add(LootItem.lootTableItem(ModItems.PILLAGER_LEGGINGS_ITEM.value()))
                                .when(LootItemKilledByPlayerCondition.killedByPlayer())
                                .when(LootItemRandomChanceWithEnchantedBonusCondition.randomChanceAndLootingBoost(enchantments,
                                        0.025F,
                                        0.01F))));
        this.output.accept(ModLootTables.WITCH_INJECTION,
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ContextIntProviders.exactly(1))
                                .add(LootItem.lootTableItem(ModItems.WITCH_HAT_ITEM.value()))
                                .add(LootItem.lootTableItem(ModItems.WITCH_ROBE_ITEM.value()))
                                .add(LootItem.lootTableItem(ModItems.WITCH_LEGGINGS_ITEM.value()))
                                .when(LootItemKilledByPlayerCondition.killedByPlayer())
                                .when(LootItemRandomChanceWithEnchantedBonusCondition.randomChanceAndLootingBoost(enchantments,
                                        0.025F,
                                        0.01F))));
        this.output.accept(ModLootTables.IRON_GOLEM_INJECTION,
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ContextIntProviders.exactly(1))
                                .add(LootItem.lootTableItem(ModItems.IRON_GOLEM_ROBE_ITEM.value()))
                                .add(LootItem.lootTableItem(ModItems.IRON_GOLEM_LEGGINGS_ITEM.value()))
                                .when(LootItemKilledByPlayerCondition.killedByPlayer())
                                .when(LootItemRandomChanceWithEnchantedBonusCondition.randomChanceAndLootingBoost(enchantments,
                                        0.025F,
                                        0.01F))));
    }
}
