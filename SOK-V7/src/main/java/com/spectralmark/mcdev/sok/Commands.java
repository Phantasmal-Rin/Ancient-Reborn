package com.spectralmark.mcdev.sok;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            if(command.getName().equalsIgnoreCase("healme")){
                if(sender instanceof Player){
                    Player player = (Player) sender;

                }else{
                    sender.sendMessage(ChatColor.YELLOW + "Only Players can use this command.");
                }
            }
        return true;
    }
}
