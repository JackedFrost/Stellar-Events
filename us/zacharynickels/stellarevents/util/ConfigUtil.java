package us.zacharynickels.stellarevents.util;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import us.zacharynickels.stellarevents.StellarEvents;

import java.io.File;
import java.io.IOException;

public class ConfigUtil {
    private static final StellarEvents plugin = StellarEvents.plugin;

    private static File eventsConfigFile;
    private static FileConfiguration eventsConfig;

    public static void createEventsConfig() {
        eventsConfigFile = new File(plugin.getDataFolder(), "events.yml");

        if (!eventsConfigFile.exists()) {
            eventsConfigFile.getParentFile().mkdirs();
            plugin.saveResource("events.yml", false);
        }

        eventsConfig = new YamlConfiguration();
        try {
            eventsConfig.load(eventsConfigFile);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }
}
