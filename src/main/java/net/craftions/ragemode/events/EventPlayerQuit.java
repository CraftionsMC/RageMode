/**
 * @copyright (c) 2021 Ben Siebert. All rights resered.
 * @author Ben Siebert
 */
package net.craftions.ragemode.events;

import net.craftions.ragemode.RageMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class EventPlayerQuit implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent e){
        e.setQuitMessage(RageMode.prefix + "§c" + e.getPlayer().getName() + " §7left the game");
    }
}
