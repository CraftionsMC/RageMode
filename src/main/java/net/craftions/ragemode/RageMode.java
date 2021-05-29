package net.craftions.ragemode;

import net.craftions.ragemode.commands.CommandSetSpawn;
import net.craftions.ragemode.config.Config;
import net.craftions.ragemode.events.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public final class RageMode extends JavaPlugin {

    public static Config config = null;
    public static String prefix = "§7[§cRageMode§7] ";
    protected static RageMode instance;

    @Override
    public void onEnable() {
        getCommand("setspawn").setExecutor(new CommandSetSpawn());
        Bukkit.getPluginManager().registerEvents(new EventPlayerJoin(), this);
        Bukkit.getPluginManager().registerEvents(new EventPlayerDeath(), this);
        Bukkit.getPluginManager().registerEvents(new EventPlayerRespawn(), this);
        Bukkit.getPluginManager().registerEvents(new EventPlayerQuit(), this);
        Bukkit.getPluginManager().registerEvents(new EventBlockPlace(), this);
        Bukkit.getPluginManager().registerEvents(new EventBlockBreak(), this);
        Bukkit.getPluginManager().registerEvents(new EventPlayerItemDrop(), this);
        Bukkit.getPluginManager().registerEvents(new EventInventoryClick(), this);
        Bukkit.getPluginManager().registerEvents(new EventProjectileHit(), this);


        instance = this;
        File rootDir = new File("plugins/RageMode");
        if(!rootDir.exists()){
            rootDir.mkdirs();
        }
        File configFile = new File("plugins/RageMode/config.yml");
        if(!configFile.exists()){
            try {
                configFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        config = new Config(configFile, "cfg");
        System.out.println("RageMode v" + this.getDescription().getVersion() + " was loaded successfully.");
    }

    public static RageMode getInstance() {
        return instance;
    }
}
