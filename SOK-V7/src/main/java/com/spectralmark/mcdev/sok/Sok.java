package com.spectralmark.mcdev.sok;

import com.spectralmark.mcdev.sok.events.EventsMain;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Sok extends JavaPlugin{

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Swords of Kings; ENABLED");
        //enables join event "optifine reminder"
        new EventsMain (this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
