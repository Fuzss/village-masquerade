package fuzs.villagemasquerade.common;

import fuzs.puzzleslib.common.api.core.v1.ModConstructor;
import fuzs.puzzleslib.common.api.event.v1.AddBlockEntityTypeBlocksCallback;
import fuzs.puzzleslib.common.api.event.v1.entity.ServerEntityEvents;
import fuzs.puzzleslib.common.api.event.v1.entity.living.CalculateLivingVisibilityCallback;
import fuzs.puzzleslib.common.api.event.v1.entity.living.LivingDropsCallback;
import fuzs.puzzleslib.common.api.event.v1.entity.living.MobEffectEvents;
import fuzs.puzzleslib.common.api.event.v1.server.LootTableLoadCallback;
import fuzs.villagemasquerade.common.handler.ClothingEquipmentHandler;
import fuzs.villagemasquerade.common.init.ModBlocks;
import fuzs.villagemasquerade.common.init.ModLootTables;
import fuzs.villagemasquerade.common.init.ModRegistry;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VillageMasquerade implements ModConstructor {
    public static final String MOD_ID = "villagemasquerade";
    public static final String MOD_NAME = "Village Masquerade";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    @Override
    public void onConstructMod() {
        ModRegistry.bootstrap();
        registerEventHandlers();
    }

    private static void registerEventHandlers() {
        AddBlockEntityTypeBlocksCallback.EVENT.register(ModBlocks::onAddBlockEntityTypeBlocks);
        LivingDropsCallback.EVENT.register(ClothingEquipmentHandler::onLivingDrops);
        LootTableLoadCallback.EVENT.register(ModLootTables::onLootTableLoad);
        ServerEntityEvents.JOIN.register(ClothingEquipmentHandler::onEntityJoin);
        MobEffectEvents.AFFECTS.register(ClothingEquipmentHandler::onMobEffectAffects);
        CalculateLivingVisibilityCallback.EVENT.register(ClothingEquipmentHandler::onCalculateLivingVisibility);
    }

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}
