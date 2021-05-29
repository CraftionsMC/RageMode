package net.craftions.ragemode;

import net.craftions.ragemode.config.Config;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public final class RageMode extends JavaPlugin {

    public static Config config = null;
    protected static RageMode instance;

    @Override
    public void onEnable() {
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
