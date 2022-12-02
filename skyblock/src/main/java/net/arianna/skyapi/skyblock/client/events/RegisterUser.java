package net.arianna.skyapi.skyblock.client.events;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;
import net.skyapi.skyblock.Properties;

import java.util.Timer;
import java.util.TimerTask;

public class RegisterUser {

    @SubscribeEvent
    public void worldConnection(PlayerEvent.PlayerLoggedInEvent event) {
        if (event.player.getEntityWorld().isRemote) Properties.setPlayer(Minecraft.getMinecraft().thePlayer);
    }

    @SubscribeEvent
    public void connectionServer(FMLNetworkEvent.ClientConnectedToServerEvent event) {
        if(event.isLocal) {
            System.out.println("===[ Sys Acc (Local) ]===");
            final Timer timer = new Timer("Timer");
            timer.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                    System.out.println("Loading account...");
                    if (Minecraft.getMinecraft().thePlayer == null) return;
                    else {
                        Properties.setPlayer(Minecraft.getMinecraft().thePlayer);
                        System.out.println("Found user, attaching now.");
                        timer.cancel();
                        System.out.println("===[ End Sys Acc (Local) ]===");
                    }
                }
            }, 0, 1000);
        }
        else {
            System.out.println("===[ Sys Acc ]===");
            final Timer timer = new Timer("Timer");
            timer.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                    System.out.println("Loading account...");
                    if (Minecraft.getMinecraft().thePlayer == null) return;
                    else {
                        Properties.setPlayer(Minecraft.getMinecraft().thePlayer);
                        System.out.println("Found user, attaching now.");
                        timer.cancel();
                        System.out.println("===[ End Sys Acc ]===");
                    }
                }
            }, 0, 1000);
        }
    }

    @SubscribeEvent
    public void disconnectsServer(FMLNetworkEvent.ClientDisconnectionFromServerEvent event) {
        Properties.setPlayer(null);
        System.out.println("User has been removed");
    }
}
