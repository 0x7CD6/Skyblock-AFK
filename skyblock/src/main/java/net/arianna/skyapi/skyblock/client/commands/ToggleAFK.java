package net.arianna.skyapi.skyblock.client.commands;


import net.minecraft.command.ICommandSender;
import net.skyapi.skyblock.Properties;
import net.skyapi.skyblock.utils.CommandUtil;
import net.skyapi.skyblock.utils.F;
import net.skyapi.skyblock.utils.TextUtils;
import net.skyapi.skyblock.utils.UtilColor;

public class ToggleAFK extends CommandUtil {

    public ToggleAFK(String commandName, String commandUsage, String... commandAliases) {
        super(commandName, commandUsage, commandAliases);
    }

    @Override
    public void processCommand(ICommandSender executor, String[] args) {
        if (args == null) toggleAll();
        if (args.length == 0 || args.length == 2) toggleAll();
        else {
            if (args[0].equalsIgnoreCase("limbo")) toggleLimbo();
            else if (args[0].equalsIgnoreCase("restart")) toggleRestart();
        }
    }

    public void toggleAll() {
        toggleLimbo();
        toggleRestart();
        changeUserFlight();
    }

    public void toggleRestart() {
        if (Properties.getServerRestart()) {
            Properties.setServerRestart(false);
            TextUtils.sendMessage(F.itemC(UtilColor.GOLD + "Server Restart") + " fallback: " + F.b(Properties.getServerRestart()) + ".");
        } else {
            Properties.setServerRestart(true);
            TextUtils.sendMessage(F.itemC(UtilColor.GOLD + "Server Restart") + " fallback: " + F.b(Properties.getServerRestart()) + ".");
        }
    }

    public void toggleLimbo() {
        if (Properties.getLimbo()) {
            Properties.setLimbo(false);
            TextUtils.sendMessage(F.itemC(UtilColor.GOLD + "Limbo") + " fallback: " + F.b(Properties.getLimbo()) + ".");
        } else {
            Properties.setLimbo(true);
            TextUtils.sendMessage(F.itemC(UtilColor.GOLD + "Limbo") + " fallback: " + F.b(Properties.getLimbo()) + ".");
        }
    }

    public void changeUserFlight() {
        if (Properties.getPlayer().capabilities.allowFlying) TextUtils.sendMessage(F.itemC(UtilColor.GOLD + "User Flight") + " fallback: " + F.b(Properties.getPlayer().capabilities.allowFlying) + ".");
        else TextUtils.sendMessage(F.itemC(UtilColor.GOLD + "User Flight") + " fallback: " + F.b(Properties.getPlayer().capabilities.allowFlying) + ".");
    }
}

