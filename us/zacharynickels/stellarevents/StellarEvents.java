package us.zacharynickels.stellarevents;

import org.bukkit.plugin.java.JavaPlugin;

public class StellarEvents extends JavaPlugin {
    public static StellarEvents plugin;
    public EventsConfig eventsConfig;

    public StellarEvents() {
        plugin=this;
    }

    @Override
    public void onEnable() {
        saveDefaultConfig();
        EventsConfig eventsConfig = new EventsConfig();

        System.out.println("StellarEvents - Enabled successfully.");
        this.getCommand("event").setExecutor(new EventCMD());
    }

    @Override
    public void onDisable() {

    }

    public EventsConfig getEventsConfig() {
        return eventsConfig;
    }
}
