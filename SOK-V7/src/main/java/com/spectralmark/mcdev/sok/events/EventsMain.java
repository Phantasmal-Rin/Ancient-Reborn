package com.spectralmark.mcdev.sok.events;

import com.spectralmark.mcdev.sok.Sok;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventsMain implements Listener {

    public EventsMain(Sok sok) {
    }

    @EventHandler
    public void OnJoin(PlayerJoinEvent event){
        Player player = (Player)event.getPlayer();

        if (player.hasPlayedBefore() == false){
            player.sendMessage(ChatColor.GOLD + "Oranis Requires Optifine for a full experience, For installation click here");
            //^^ sends message to first time joiners


        }
        if (player.hasPlayedBefore() == true){
            player.sendMessage(ChatColor.GRAY + "Make sure Optifine is enabled for a optimal experience");
            //^^ sends message to reoccurring joiners
        }
    }

}
