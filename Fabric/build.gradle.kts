plugins {
    id("fuzs.multiloader.multiloader-convention-plugins-fabric")
}

dependencies {
    modApi(sharedLibs.fabricapi.fabric)
    modApi(sharedLibs.puzzleslib.fabric)
}

multiloader {
    mixins {
        clientMixin("EquipmentClientInfo\u0024LayerTypeFabricMixin")
    }
}
