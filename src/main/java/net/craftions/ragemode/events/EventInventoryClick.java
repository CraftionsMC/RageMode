/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.ragemode.events;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class EventInventoryClick implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e){
        if(!e.getWhoClicked().getGameMode().equals(GameMode.CREATIVE)){
            e.setCancelled(true);
        }
    }
}
