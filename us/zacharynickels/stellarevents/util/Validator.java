package us.zacharynickels.stellarevents.util;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Validator {

    public static boolean isValidDateTime(String s) {
        return false;
    }

    public static boolean isValidTime(String s) {
        return false;
    }

    public static boolean isValidBoolean(String s) {
        if (s.equalsIgnoreCase("true"))
            return true;
        else
            return false;
    }

    public static LocalDateTime parseDateTime(String s) {
        return LocalDateTime.now();
    }

    public static LocalTime parseTime(String s) {
        return LocalTime.now();
    }
}
