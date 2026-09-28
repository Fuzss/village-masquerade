package fuzs.villagemasquerade.common.data.client;

import fuzs.puzzleslib.common.api.client.data.v3.language.AbstractLanguageProvider;
import fuzs.puzzleslib.common.api.data.v3.core.DataProviderContext;
import fuzs.villagemasquerade.common.VillageMasquerade;
import fuzs.villagemasquerade.common.client.VillageMasqueradeClient;
import fuzs.villagemasquerade.common.init.ModBlocks;
import fuzs.villagemasquerade.common.init.ModItems;
import fuzs.villagemasquerade.common.init.ModRegistry;

public class ModLanguageProvider extends AbstractLanguageProvider {

    public ModLanguageProvider(DataProviderContext context) {
        super(context);
    }

    @Override
    public void addTranslations() {
        this.addCreativeModeTab(ModRegistry.CREATIVE_MODE_TAB, VillageMasquerade.MOD_NAME);
        this.add(VillageMasqueradeClient.VILLAGER_CLOTHING_DESCRIPTION_KEY,
                "Get discounts for trading with: %s");
        this.add(VillageMasqueradeClient.ENEMY_CLOTHING_DESCRIPTION_KEY,
                "Become friends with illagers, but watch out for iron golems.");
        this.add(VillageMasqueradeClient.WANDERING_TRADER_CLOTHING_DESCRIPTION_KEY,
                "Easily hide from enemies during the night.");
        this.addBlock(ModBlocks.VILLAGER_HEAD_BLOCK, "Villager Head");
        this.addBlock(ModBlocks.IRON_GOLEM_HEAD_BLOCK, "Iron Golem Head");
        this.addBlock(ModBlocks.ILLAGER_HEAD_BLOCK, "Illager Head");
        this.addItem(ModItems.ARMORER_GOGGLES_ITEM, "Armorer Goggles");
        this.addItem(ModItems.ARMORER_APRON_ITEM, "Armorer Apron");
        this.addItem(ModItems.BUTCHER_HEADBAND_ITEM, "Butcher Headband");
        this.addItem(ModItems.BUTCHER_APRON_ITEM, "Butcher Apron");
        this.addItem(ModItems.CARTOGRAPHER_MONOCLE_ITEM, "Cartographer Monocle");
        this.addItem(ModItems.CARTOGRAPHER_HARNESS_ITEM, "Cartographer Harness");
        this.addItem(ModItems.CLERIC_COLLAR_ITEM, "Cleric Collar");
        this.addItem(ModItems.CLERIC_ROBE_ITEM, "Cleric Robe");
        this.addItem(ModItems.FARMER_HAT_ITEM, "Farmer Hat");
        this.addItem(ModItems.FARMER_BELT_ITEM, "Farmer Belt");
        this.addItem(ModItems.FISHERMAN_HAT_ITEM, "Fisherman Hat");
        this.addItem(ModItems.FISHERMAN_VEST_ITEM, "Fisherman Vest");
        this.addItem(ModItems.FISHERMAN_LEGGINGS_ITEM, "Fisherman Leggings");
        this.addItem(ModItems.FLETCHER_HAT_ITEM, "Fletcher Hat");
        this.addItem(ModItems.FLETCHER_BELT_ITEM, "Fletcher Belt");
        this.addItem(ModItems.LEATHERWORKER_APRON_ITEM, "Leatherworker Apron");
        this.addItem(ModItems.LIBRARIAN_HEADWEAR_ITEM, "Librarian Headwear");
        this.addItem(ModItems.LIBRARIAN_TOGA_ITEM, "Librarian Toga");
        this.addItem(ModItems.MASON_APRON_ITEM, "Mason Apron");
        this.addItem(ModItems.NITWIT_ROBE_ITEM, "Nitwit Robe");
        this.addItem(ModItems.NITWIT_LEGGINGS_ITEM, "Nitwit Leggings");
        this.addItem(ModItems.SHEPHERD_HAT_ITEM, "Shepherd Hat");
        this.addItem(ModItems.SHEPHERD_VEST_ITEM, "Shepherd Vest");
        this.addItem(ModItems.TOOLSMITH_APRON_ITEM, "Toolsmith Apron");
        this.addItem(ModItems.WEAPONSMITH_EYEPATCH_ITEM, "Weaponsmith Eyepatch");
        this.addItem(ModItems.WEAPONSMITH_APRON_ITEM, "Weaponsmith Apron");
        this.addItem(ModItems.LEGACY_FARMER_ROBE_ITEM, "Legacy Farmer Robe");
        this.addItem(ModItems.LEGACY_FARMER_LEGGINGS_ITEM, "Legacy Farmer Leggings");
        this.addItem(ModItems.LEGACY_LIBRARIAN_ROBE_ITEM, "Legacy Librarian Robe");
        this.addItem(ModItems.LEGACY_LIBRARIAN_LEGGINGS_ITEM, "Legacy Librarian Leggings");
        this.addItem(ModItems.LEGACY_NITWIT_ROBE_ITEM, "Legacy Nitwit Robe");
        this.addItem(ModItems.LEGACY_NITWIT_LEGGINGS_ITEM, "Legacy Nitwit Leggings");
        this.addItem(ModItems.LEGACY_PRIEST_ROBE_ITEM, "Legacy Priest Robe");
        this.addItem(ModItems.LEGACY_PRIEST_LEGGINGS_ITEM, "Legacy Priest Leggings");
        this.addItem(ModItems.WANDERING_TRADER_HOOD_ITEM, "Wandering Trader Hood");
        this.addItem(ModItems.WANDERING_TRADER_ROBE_ITEM, "Wandering Trader Robe");
        this.addItem(ModItems.WANDERING_TRADER_LEGGINGS_ITEM, "Wandering Trader Leggings");
        this.addItem(ModItems.IRON_GOLEM_ROBE_ITEM, "Iron Golem Chestplate");
        this.addItem(ModItems.IRON_GOLEM_LEGGINGS_ITEM, "Iron Golem Leggings");
        this.addItem(ModItems.EVOKER_ROBE_ITEM, "Evoker Robe");
        this.addItem(ModItems.EVOKER_LEGGINGS_ITEM, "Evoker Leggings");
        this.addItem(ModItems.PILLAGER_JACKET_ITEM, "Pillager Jacket");
        this.addItem(ModItems.PILLAGER_LEGGINGS_ITEM, "Pillager Leggings");
        this.addItem(ModItems.VINDICATOR_JACKET_ITEM, "Vindicator Jacket");
        this.addItem(ModItems.VINDICATOR_LEGGINGS_ITEM, "Vindicator Leggings");
        this.addItem(ModItems.WITCH_HAT_ITEM, "Witch Hat");
        this.addItem(ModItems.WITCH_ROBE_ITEM, "Witch Robe");
        this.addItem(ModItems.WITCH_LEGGINGS_ITEM, "Witch Leggings");
        this.addItem(ModItems.SANTA_HAT_ITEM, "Santa Hat");
        this.addItem(ModItems.SANTA_COAT_ITEM, "Santa Coat");
        this.addItem(ModItems.SANTA_LEGGINGS_ITEM, "Santa Leggings");
    }
}
