plugins {
    id("fuzs.multiloader.multiloader-convention-plugins-fabric")
}

dependencies {
    modApi(sharedLibs.fabricapi.fabric)
    modApi(sharedLibs.puzzleslib.fabric)
    modImplementation(sharedLibs.fabricasm.fabric)
    include(sharedLibs.fabricasm.fabric)
}

multiloader {
    modFile {
        json {
            entrypoint(
                "mm:early_risers",
                "${project.group}.${project.name.lowercase()}.asm.VillageMasqueradeFabricCore"
            )
        }
    }
}
