package us.zacharynickels.stellarevents;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class EventCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {

        switch (args[0]) {
            case "create":
                Event.createEvent(args);
                break;
            case "remove":
                break;
            case "start":
                break;
            case "stop":
                break;
            case "list":
                break;
        }
        return false;
    }
}
