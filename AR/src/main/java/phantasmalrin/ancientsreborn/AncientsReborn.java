package phantasmalrin.ancientsreborn;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class AncientsReborn extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Ancients Reborn Online");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
