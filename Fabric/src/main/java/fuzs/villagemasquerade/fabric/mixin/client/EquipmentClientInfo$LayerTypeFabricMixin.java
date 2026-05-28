package fuzs.villagemasquerade.fabric.mixin.client;

import net.minecraft.client.resources.model.EquipmentClientInfo;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(EquipmentClientInfo.LayerType.class)
enum EquipmentClientInfo$LayerTypeFabricMixin {
    VILLAGEMASQUERADE_CLOTHING("villagemasquerade/clothing"),
    VILLAGEMASQUERADE_WITCH_HAT("villagemasquerade/witch_hat"),
    VILLAGEMASQUERADE_SANTA_HAT("villagemasquerade/santa_hat");

    @Shadow
    EquipmentClientInfo$LayerTypeFabricMixin(String id) {
        throw new RuntimeException();
    }
}
