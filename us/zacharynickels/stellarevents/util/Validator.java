package us.zacharynickels.stellarevents.util;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Locale;

public class Validator {

    private static final DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss",Locale.ENGLISH);
    private static final DateTimeFormatter tFormatter = DateTimeFormatter.ofPattern("HH:mm:ss",Locale.ENGLISH);

    public static boolean isValidDateTime(String s) {

        try {
            dtFormatter.parse(s);
            System.out.println("valid DT");
            return true;
        } catch (DateTimeParseException e) {
            System.out.println("Invalid DT");
            return false;
        }
    }

    public static boolean isValidTime(String s) {

        try {
            tFormatter.parse(s);
            System.out.println("valid T");
            return true;
        } catch (DateTimeParseException e) {
            System.out.println("Invalid T");
            return false;
        }
    }

    public static boolean isValidBoolean(String s) {

        if (s.equalsIgnoreCase("true")) {
            System.out.println("valid bool");
            return true;
        }
        else {
            System.out.println("Invalid bool");
            return false;
        }
    }

    public static LocalDateTime parseDateTime(String s) {
        return LocalDateTime.parse(s, dtFormatter);
    }

    public static LocalTime parseTime(String s) {
        return LocalTime.parse(s, tFormatter);
    }

    public static boolean isValidEvent(String[] args) {
        if (Validator.isValidDateTime(args[2]+" "+args[3])&&
                Validator.isValidDateTime(args[4]+" "+args[5])&&
                Validator.isValidTime(args[6])&&
                Validator.isValidBoolean(args[7]))
            return true;
        else {
            System.out.println("Invalid event");
            return false;
        }
    }
}
