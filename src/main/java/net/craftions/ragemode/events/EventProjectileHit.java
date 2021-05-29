/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.ragemode.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class EventProjectileHit implements Listener {

    @EventHandler
    public void onHit(ProjectileHitEvent e){
        if(e.getEntity().getShooter() instanceof Player){
            if(e.getHitBlock() != null){
                e.getHitBlock().getLocation().getWorld().createExplosion(
                        e.getHitBlock().getLocation().getX(),
                        e.getHitBlock().getLocation().getY(),
                        e.getHitBlock().getLocation().getZ(),
                        5,
                        false,
                        false
                );
            }
        }
    }
}
