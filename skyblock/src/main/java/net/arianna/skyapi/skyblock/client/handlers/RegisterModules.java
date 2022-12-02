package net.arianna.skyapi.skyblock.client.handlers;

import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.skyapi.skyblock.client.commands.SendTestCommand;
import net.skyapi.skyblock.client.commands.ToggleAFK;
import net.skyapi.skyblock.client.events.AfkListener;
import net.skyapi.skyblock.client.events.DisableCommandUnknownEvent;
import net.skyapi.skyblock.client.events.RegisterUser;

public class RegisterModules {
    public RegisterModules() {
        System.out.println("Loading client");
        new RegisterProperties();
        ClientCommandHandler.instance.registerCommand(new ToggleAFK("toggleafk", "Toggles AFK"));
        ClientCommandHandler.instance.registerCommand(new SendTestCommand("test", "Tests AFK Features"));
        MinecraftForge.EVENT_BUS.register(new AfkListener());
        MinecraftForge.EVENT_BUS.register(new RegisterUser());
        MinecraftForge.EVENT_BUS.register(new DisableCommandUnknownEvent());
    }
}