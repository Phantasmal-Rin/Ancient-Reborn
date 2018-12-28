package phantasmalrin.ancientsreborn.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class events implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        boolean hasjoined = player.hasPlayedBefore();

        if (!hasjoined) {
            player.sendMessage(ChatColor.GOLD + "Oranis Requires Optifne for a full experience");
        } else {
            player.sendMessage(ChatColor.GOLD + "Please Enable Optifine");
        }
    }
}

