package us.zacharynickels.stellarevents;

import org.bukkit.plugin.java.JavaPlugin;
import us.zacharynickels.stellarevents.util.Validator;

public class StellarEvents extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("StellarEvents - Enabled successfully.");
        this.getCommand("event").setExecutor(new EventCMD());
        String tDate = "01/02/2020 05:30:45";
        String tTime = "05:03:30";
        Validator.isValidDateTime(tDate);
        Validator.isValidTime(tTime);
    }

    @Override
    public void onDisable() {

    }
}
