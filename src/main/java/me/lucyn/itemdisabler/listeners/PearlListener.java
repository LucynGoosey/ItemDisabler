package me.lucyn.itemdisabler.listeners;

import me.lucyn.itemdisabler.ItemDisabler;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;


public class PearlListener implements Listener {
    private final ItemDisabler plugin;
    public PearlListener(ItemDisabler plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPearlThrown(PlayerItemConsumeEvent event) {
        if(plugin.getConfig().getBoolean("pearl") && event.getItem().getType() == Material.ENDER_PEARL) {
            event.setCancelled(true);

        }
    }

}
