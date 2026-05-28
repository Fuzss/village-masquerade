package fuzs.villagemasquerade.fabric.client;

import fuzs.villagemasquerade.common.VillageMasquerade;
import fuzs.villagemasquerade.common.client.VillageMasqueradeClient;
import fuzs.puzzleslib.common.api.client.core.v1.ClientModConstructor;
import net.fabricmc.api.ClientModInitializer;

public class VillageMasqueradeFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ClientModConstructor.construct(VillageMasquerade.MOD_ID, VillageMasqueradeClient::new);
    }
}
