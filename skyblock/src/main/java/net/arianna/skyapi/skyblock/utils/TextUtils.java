package net.arianna.skyapi.skyblock.utils;

import net.minecraft.util.ChatComponentText;
import net.skyapi.skyblock.Properties;

public class TextUtils {

    public static void sendMessage(String message) {
        Properties.getPlayer().addChatMessage(new ChatComponentText(F.formatMessage(message)));
    }

    public static void sendErrorMessage(String message) {
        Properties.getPlayer().addChatMessage(new ChatComponentText(F.formatErrorMessage(message)));
    }

    public static void sendRawMessage(String message) {
        Properties.getPlayer().addChatMessage(new ChatComponentText(message));
    }
}
