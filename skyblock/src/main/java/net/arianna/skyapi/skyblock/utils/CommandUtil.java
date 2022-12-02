package net.arianna.skyapi.skyblock.utils;

import lombok.Getter;
import lombok.Setter;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

import java.util.Arrays;
import java.util.List;

public abstract class CommandUtil extends CommandBase {

    @Getter@Setter private String cmdN;
    @Getter@Setter private String cmdU;
    @Getter@Setter private List<String> cmdA;

    public CommandUtil(String commandName, String commandUsage, String... commandAlises) {
        setCmdN(commandName);
        setCmdU(commandUsage);
        setCmdA(Arrays.asList(commandAlises));
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

    @Override
    public String getCommandName() {
        return getCmdN();
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return getCmdU();
    }

    @Override
    public List<String> getCommandAliases() {
        return getCmdA();
    }

    @Override
    public void processCommand(ICommandSender executor, String[] args) {

    }

}
