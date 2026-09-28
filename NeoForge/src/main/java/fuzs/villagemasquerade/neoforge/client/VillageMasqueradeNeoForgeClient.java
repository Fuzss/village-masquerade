package fuzs.villagemasquerade.neoforge.client;

import fuzs.puzzleslib.common.api.client.core.v1.ClientModConstructor;
import fuzs.puzzleslib.neoforge.api.data.v3.core.DataProviderBuilder;
import fuzs.villagemasquerade.common.VillageMasquerade;
import fuzs.villagemasquerade.common.client.VillageMasqueradeClient;
import fuzs.villagemasquerade.common.data.client.ModLanguageProvider;
import fuzs.villagemasquerade.common.data.client.ModModelProvider;
import fuzs.villagemasquerade.common.data.client.ModEquipmentProvider;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;

@Mod(value = VillageMasquerade.MOD_ID, dist = Dist.CLIENT)
public class VillageMasqueradeNeoForgeClient {

    public VillageMasqueradeNeoForgeClient() {
        ClientModConstructor.construct(VillageMasquerade.MOD_ID, VillageMasqueradeClient::new);
        DataProviderBuilder.of(VillageMasquerade.MOD_ID)
                .addProvider(ModLanguageProvider::new,
                        ModModelProvider::new,
                        ModEquipmentProvider::new);
    }
}
