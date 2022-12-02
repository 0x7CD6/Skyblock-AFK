package net.arianna.skyapi.skyblock.utils;

import net.skyapi.skyblock.Properties;

public class F {

    public static String prefix() { return Properties.getPrefix(); }

    public static String formatMessage(String message) {
        return prefix() + UtilColor.GRAY + message + Properties.getDefaultTextColor();
    }

    public static String formatErrorMessage(String message) {
        return prefix().replace(UtilColor.AQUA, UtilColor.RED) + UtilColor.GRAY + message + Properties.getDefaultTextColor();
    }

    public static String b(Boolean value) {
        if (value) return UtilColor.GREEN + "Enabled" + Properties.getDefaultTextColor();
        else return UtilColor.RED + "Disabled" + Properties.getDefaultTextColor();
    }

    public static String itemC(String text) {
        return UtilColor.RED + text + Properties.getDefaultTextColor();
    }

    public static String item(String text) {
        return UtilColor.AQUA + "[" + UtilColor.GREEN + text + UtilColor.AQUA + "]" + Properties.getDefaultTextColor();
    }


    public static String itemW(String text) {
        return UtilColor.AQUA + text + Properties.getDefaultTextColor();
    }
}
