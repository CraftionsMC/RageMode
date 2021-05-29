/**
 * @copyright (c) 2021 Ben Siebert. All rights resered.
 * @author Ben Siebert
 */
package net.craftions.ragemode.commands;

import net.craftions.ragemode.RageMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandSetSpawn implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            RageMode.config.set("spawn", ((Player) sender).getLocation());
            RageMode.config.reload(true);
            sender.sendMessage(RageMode.prefix + "The spawn was §asuccessfully §7set.");
        }else {
            sender.sendMessage(RageMode.prefix + "You need to be a §cplayer §7in order to run this command.");
        }
        return true;
    }
}
