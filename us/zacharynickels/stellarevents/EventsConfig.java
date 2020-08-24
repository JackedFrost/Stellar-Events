package us.zacharynickels.stellarevents;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class EventsConfig extends YamlConfiguration {
    private static final StellarEvents plugin = StellarEvents.plugin;

    private final File eventsConfigFile;
    private final FileConfiguration eventsConfig;

    EventsConfig() {
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

    public void addEvent(String name, LocalDateTime startDateTime, LocalDateTime endDateTime) {
        eventsConfig.set(name+".start-date-time",startDateTime.toString());
        eventsConfig.set(name+".end-date-time",endDateTime.toString());
    }

    public static void addEvent(String name, LocalDateTime startDateTime, LocalDateTime endDateTime, LocalTime loopWindow) {

    }

    public void saveEventsConfig() {
        try {
            eventsConfig.save(eventsConfigFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public EventsConfig getEventsConfig() {
        return this;
    }
}
