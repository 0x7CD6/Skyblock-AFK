package net.arianna.skyapi.skyblock;

import lombok.Getter;
import lombok.Setter;
import net.minecraft.client.entity.EntityPlayerSP;

public class Properties {
    @Getter@Setter private static String prefix;
    @Getter@Setter private static Boolean client = true;
    @Getter@Setter private static String defaultTextColor;
    @Getter@Setter private static String modId = "skyapibeta";
    @Getter@Setter private static String modVersion = "1.0";

    @Getter@Setter private static String limboMessage;
    @Getter@Setter private static Boolean limbo = false;

    @Getter@Setter private static Boolean serverRestart = false;
    @Getter@Setter private static String serverRestartMessage;

    @Getter@Setter private static String commandUnknown;

    @Getter@Setter private static EntityPlayerSP player;
}
