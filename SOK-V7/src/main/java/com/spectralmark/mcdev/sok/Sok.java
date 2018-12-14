package com.spectralmark.mcdev.sok;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Sok extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Swords of Kings; ENABLED");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
