/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.ragemode.events;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class EventPlayerItemDrop implements Listener {

    @EventHandler
    public void onPlayerItemDrop(PlayerDropItemEvent e){
        if(!e.getPlayer().getGameMode().equals(GameMode.CREATIVE)){
            e.setCancelled(true);
        }
    }
}
