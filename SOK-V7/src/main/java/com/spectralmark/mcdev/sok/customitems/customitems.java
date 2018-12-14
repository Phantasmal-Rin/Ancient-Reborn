package com.spectralmark.mcdev.sok.customitems;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class customitems implements Listener {

    public void giveItems(Player player){
        ItemStack item = new ItemStack(Material.WOOD_HOE,1);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.AQUA + "Excalibur");
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GOLD + "Sword of the King");
        meta.setLore(lore);
        item.setItemMeta(meta);

        player.getInventory().addItem(item);
    }
}
