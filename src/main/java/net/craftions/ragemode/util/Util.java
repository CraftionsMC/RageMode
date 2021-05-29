/**
 * @copyright (c) 2021 Ben Siebert. All rights resered.
 * @author Ben Siebert
 */
package net.craftions.ragemode.util;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Util {

    public static void resetPlayerInventory(Player p) {
        Inventory inv = Bukkit.createInventory(null, InventoryType.PLAYER);
        ItemStack arrow = new ItemStack(Material.ARROW);
        ItemStack bow = new ItemStack(Material.BOW);
        ItemStack sword = new ItemStack(Material.IRON_SWORD);

        bow.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);
        bow.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 1000);
        sword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1000);

        inv.setItem(0, bow);
        inv.setItem(1, sword);
        inv.setItem(9, arrow);
    }
}
