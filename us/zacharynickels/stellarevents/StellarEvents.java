package us.zacharynickels.stellarevents;

import org.bukkit.plugin.java.JavaPlugin;
import us.zacharynickels.stellarevents.util.ConfigUtil;

public class StellarEvents extends JavaPlugin {
    public static StellarEvents plugin;

    public StellarEvents() {
        plugin=this;
    }

    @Override
    public void onEnable() {
        saveDefaultConfig();
        ConfigUtil.createEventsConfig();

        System.out.println("StellarEvents - Enabled successfully.");
        this.getCommand("event").setExecutor(new EventCMD());
    }

    @Override
    public void onDisable() {

    }
}
