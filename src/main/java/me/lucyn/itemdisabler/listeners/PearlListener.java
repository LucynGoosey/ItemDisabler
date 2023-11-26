package me.lucyn.itemdisabler.listeners;

import me.lucyn.itemdisabler.ItemDisabler;

import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;



public class PearlListener implements Listener {
    private final ItemDisabler plugin;
    public PearlListener(ItemDisabler plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPearlThrown(ProjectileLaunchEvent event) {
        if(plugin.getConfig().getBoolean("pearl") && event.getEntity() instanceof EnderPearl && event.getEntity().getShooter() instanceof Player) {
            event.setCancelled(true);

        }
    }

}
