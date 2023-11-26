package me.lucyn.itemdisabler;

import me.lucyn.itemdisabler.listeners.PearlListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class ItemDisabler extends JavaPlugin {

    @Override
    public void onEnable() {

        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new PearlListener(this), this);

        if(getConfig().getBoolean("pearl")) {
            getServer().broadcastMessage("Ender Pearls Disabled");
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
