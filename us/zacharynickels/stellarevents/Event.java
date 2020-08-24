package us.zacharynickels.stellarevents;

import us.zacharynickels.stellarevents.util.Validator;

import java.time.LocalTime;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class Event {

    String name;
    String broadcast;
    LocalDateTime startDateTime;
    LocalDateTime endDateTime;
    LocalTime loopWindow;
    boolean repeat;
    ArrayList<String> cmds;

    Event(String[] args) {
        if (true/*args.length == 8||args.length == 9*/) {
            //Ensure all fields are valid
            if (Validator.isValidEvent(args)) {
                //Parse
                name=args[1];
                startDateTime = Validator.parseDateTime(args[2]+" "+args[3]);
                endDateTime = Validator.parseDateTime(args[4]+" "+args[5]);
                loopWindow = Validator.parseTime(args[6]);
                repeat = Boolean.parseBoolean(args[7]);

                //De-limit commands with commas into an array
                String[] argCmds = args[8].split(",[ ]*");
                cmds = new ArrayList<>();
                for (String c : argCmds) cmds.add(c);

                //Register all fields to file

                if (args.length==9) {
                    broadcast = args[9];
                    //Register field to file
                }
            }
        } else {
            //Error
        }
    }
}
