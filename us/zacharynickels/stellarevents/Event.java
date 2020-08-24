package us.zacharynickels.stellarevents;

import us.zacharynickels.stellarevents.util.Validator;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Event {
    public static void createEvent(String[] args) {
        if (args.length == 5||args.length == 6) {
            String eventName=args[0];
            //Ensure all fields are valid
            if (isValidEvent(args)) {
                //Parse
                LocalDateTime startTime = Validator.parseDateTime(args[2]);
                LocalDateTime endTime = Validator.parseDateTime(args[3]);
                LocalTime loopWindow = Validator.parseTime(args[4]);
                boolean eventRepeat=Boolean.parseBoolean(args[5]);

                //De-limit commands with commas into an array
                String[] argCmds = args[6].split(",[ ]*");
                ArrayList<String> cmds = new ArrayList<String>();
                for (String c : argCmds) cmds.add(c);

                //Register all fields to file

                if (args.length==7) {
                    String broadcast = args[7];
                    //Register field to file
                }
            }
        } else {
            //Error
        }
    }

    private static boolean isValidEvent(String[] args) {
        if (Validator.isValidDateTime(args[2])&&
                Validator.isValidDateTime(args[3])&&
                Validator.isValidTime(args[4])&&
                Validator.isValidBoolean(args[5]))
            return true;
        else
            return false;
    }
}
