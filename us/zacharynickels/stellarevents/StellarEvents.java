package us.zacharynickels.stellarevents;

import org.bukkit.plugin.java.JavaPlugin;

public class StellarEvents extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("StellarEvents - Enabled successfully.");
        this.getCommand("event").setExecutor(new EventCMD());
    }

    @Override
    public void onDisable() {

    }
}
