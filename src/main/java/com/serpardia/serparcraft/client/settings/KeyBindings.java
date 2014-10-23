package com.serpardia.serparcraft.client.settings;

import com.serpardia.serparcraft.reference.Names;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

/**
 * Created by serpardum on 10/11/14.
 */
public class KeyBindings {

    public static KeyBinding charge = new KeyBinding( Names.Keys.CHARGE, Keyboard.KEY_C, Names.Keys.CATEGORY );
    public static KeyBinding release = new KeyBinding( Names.Keys.RELEASE, Keyboard.KEY_R, Names.Keys.CATEGORY );
}
