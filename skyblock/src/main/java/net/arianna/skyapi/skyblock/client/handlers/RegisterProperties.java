package net.arianna.skyapi.skyblock.client.handlers;

import net.arianna.skyapi.skyblock.Properties;
import net.arianna.skyapi.skyblock.utils.UtilColor;

public class RegisterProperties {

    public RegisterProperties() {
        Properties.setPrefix(UtilColor.AQUA + "SkyAPI> ");
        Properties.setDefaultTextColor(UtilColor.GRAY);

        Properties.setServerRestartMessage("§r§c[Important] §r§eThis server will restart soon: §r§bScheduled Reboot§r");
        Properties.setLimboMessage("§cYou were spawned in Limbo.§r");

        Properties.setCommandUnknown("Unknown command. Try /help for a list of commands");

        Properties.setModId("skyapibeta");
        Properties.setModVersion("1.0");
    }
}
