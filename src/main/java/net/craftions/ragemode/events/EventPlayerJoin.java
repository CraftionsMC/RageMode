/**
 * @copyright (c) 2021 Ben Siebert. All rights resered.
 * @author Ben Siebert
 */
package net.craftions.ragemode.events;

import net.craftions.ragemode.RageMode;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventPlayerJoin implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        if(RageMode.config.get("spawn") != null){
            e.getPlayer().teleport((Location) RageMode.config.get("spawn"));
        }else {
            e.getPlayer().sendMessage(RageMode.prefix + "The spawn was §cnot §7set. Set it using §c/setspawn");
        }
    }
}
