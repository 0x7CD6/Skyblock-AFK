package net.arianna.skyapi.skyblock.client.commands;


import net.minecraft.command.ICommandSender;
import net.skyapi.skyblock.client.events.AfkListener;
import net.skyapi.skyblock.utils.CommandUtil;
import net.skyapi.skyblock.utils.TextUtils;

public class SendTestCommand extends CommandUtil {


    public SendTestCommand(String commandName, String commandUsage, String... commandAliases) {
        super(commandName, commandUsage, commandAliases);
    }

    @Override
    public void processCommand(ICommandSender executor, String[] args) {
        if (args == null) TextUtils.sendMessage("/" + getCmdN() + " (restart/limbo)");
        else if (args.length == 0) TextUtils.sendMessage("/" + getCmdN() + " (restart/limbo)");
        else if (args[0].equalsIgnoreCase("restart")) AfkListener.instanceRestart(5, 5);
        else if (args[0].equalsIgnoreCase("limbo")) AfkListener.limbo(5, 5);
        else TextUtils.sendMessage("Invalid Arguments provided.");
    }
}

