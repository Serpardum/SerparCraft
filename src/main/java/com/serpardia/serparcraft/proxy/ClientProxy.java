package com.serpardia.serparcraft.proxy;

import com.serpardia.serparcraft.client.settings.KeyBindings;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerKeyBindings() {

        ClientRegistry.registerKeyBinding(KeyBindings.charge );
        ClientRegistry.registerKeyBinding(KeyBindings.release );
    }
}
