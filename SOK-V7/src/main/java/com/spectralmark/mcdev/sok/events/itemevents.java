package com.spectralmark.mcdev.sok.events;

import com.spectralmark.mcdev.sok.customitems.customitems;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class itemevents implements Listener {
    private customitems ci = new customitems();

    @EventHandler
    public void OnPunch(PlayerInteractEvent event){
        Player player = event.getPlayer();
        ci.giveItems(player);
    }
    
    @EventHandler
    OnPlayerJoin(PlayerJoinEvent event){
    Player player =event.getplayer(); 
    player.sendmessage.chatcolor.PURPLE("Oranis Requires optifine for a full experance, please download it. If you wish to know how or why click here.")

}

