package me.lucyn.itemdisabler.listeners;

import me.lucyn.itemdisabler.ItemDisabler;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityResurrectEvent;

public class TotemListener implements Listener {

    private final ItemDisabler plugin;

    public TotemListener(ItemDisabler plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onTotemUse(EntityResurrectEvent event) {
        if(plugin.getConfig().getBoolean("totem")) {
            event.setCancelled(true);
        }
    }


}
