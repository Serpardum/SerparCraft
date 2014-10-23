package com.serpardia.serparcraft.client.handler;

import com.serpardia.serparcraft.client.settings.KeyBindings;
import com.serpardia.serparcraft.reference.Key;
import com.serpardia.serparcraft.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

/**
 * Created by serpardum on 10/11/14.
 */
public class KeyInputEventHandler {

    private static Key getPressedKeyBinding() {

        if (KeyBindings.charge.isPressed() ) {
            return Key.CHARGE;
        } else if ( KeyBindings.release.isPressed() ) {
            return Key.RELEASE;
        }

        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent( InputEvent.KeyInputEvent event ) {

        Key pressedKey = getPressedKeyBinding();
        if ( pressedKey == Key.CHARGE ) {
            LogHelper.info( "Charging." );
        } else if ( pressedKey == Key.RELEASE ) {
            LogHelper.info( "Released." );
        }
    }
}
