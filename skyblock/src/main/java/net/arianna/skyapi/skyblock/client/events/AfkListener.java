package net.arianna.skyapi.skyblock.client.events;

import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.skyapi.skyblock.Properties;
import net.skyapi.skyblock.utils.F;
import net.skyapi.skyblock.utils.MessageTemplates;
import net.skyapi.skyblock.utils.TextUtils;

import java.util.Timer;
import java.util.TimerTask;

public class AfkListener  {

    @SubscribeEvent
    public void AfkListener(ClientChatReceivedEvent event) {
        String message = event.message.getUnformattedTextForChat();

        if (message.contains(Properties.getServerRestartMessage())) {
            if (Properties.getServerRestart()) instanceRestart(25, 25);
        } else if (message.contains(Properties.getLimboMessage()))
            if (Properties.getLimbo()) limbo(25, 25);

    }

    public static void instanceRestart(Integer t1, final Integer t2) {
        TextUtils.sendMessage(MessageTemplates.AFK.fallbackProtocolRestart);
        final Timer timer = new Timer("Timer");
        final Timer timer2 = new Timer("Timer2");
        timer.schedule(new TimerTask() {
            public void run() {
                TextUtils.sendMessage(MessageTemplates.AFK.sendingSkyblockHub);
                TextUtils.sendMessage("Executing command: " + F.itemC("/hub"));
                Properties.getPlayer().sendChatMessage("/hub");
                timer2.schedule(new TimerTask() {
                    public void run() {
                        TextUtils.sendMessage(MessageTemplates.AFK.sendingIsland);
                        TextUtils.sendMessage("Executing command: " + F.itemC("/is"));
                        Properties.getPlayer().sendChatMessage("/is");
                    }
                }, t2 * 1000);
            }
        }, t1 * 1000);
    }

    public static void limbo(Integer t1, final Integer t2) {
        TextUtils.sendMessage(MessageTemplates.AFK.fallbackProtocolLimbo);
        final Timer timer = new Timer("Timer");
        final Timer timer2 = new Timer("Timer2");
        timer.schedule(new TimerTask() {
            public void run() {
                TextUtils.sendMessage(MessageTemplates.AFK.sendingLobby);
                TextUtils.sendMessage("Executing command: " + F.itemC("/lobby"));
                Properties.getPlayer().sendChatMessage("/lobby");
                timer2.schedule(new TimerTask() {
                    public void run() {
                        TextUtils.sendMessage(MessageTemplates.AFK.sendingIsland);
                        TextUtils.sendMessage("Executing command: " + F.itemC("/skyblock"));
                        Properties.getPlayer().sendChatMessage("/skyblock");
                    }
                }, t2 * 1000);
            }
        }, t1 * 1000);
    }
}
