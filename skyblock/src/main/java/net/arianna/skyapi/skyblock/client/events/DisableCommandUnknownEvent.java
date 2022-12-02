package net.arianna.skyapi.skyblock.client.events;

import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.skyapi.skyblock.Properties;
import net.skyapi.skyblock.utils.TextUtils;

public class DisableCommandUnknownEvent {

    /**
     * Made a much prettier version of a command unknown event.
     */
    @SubscribeEvent
    public void disableCommand(ClientChatReceivedEvent event) {
        String message = event.message.getUnformattedTextForChat();
        if (message.equalsIgnoreCase(Properties.getCommandUnknown())) {
            TextUtils.sendErrorMessage("It seems like that command doesn't seem to exist.");
            event.setCanceled(true);
        }
    }
}
