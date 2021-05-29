/**
 * @copyright (c) 2021 Ben Siebert. All rights resered.
 * @author Ben Siebert
 */
package net.craftions.ragemode.events;

import net.craftions.ragemode.RageMode;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

import static net.craftions.ragemode.util.Util.resetPlayerInventory;

public class EventPlayerRespawn implements Listener {

    @EventHandler
    public void onRespawn(PlayerRespawnEvent e){
        if(RageMode.config.get("spawn") != null){
            e.setRespawnLocation((Location) RageMode.config.get("spawn"));
        }else {
            e.getPlayer().sendMessage(RageMode.prefix + "The spawn was §cnot §7set. Set it using §c/setspawn");
        }
        resetPlayerInventory(e.getPlayer());
    }
}
