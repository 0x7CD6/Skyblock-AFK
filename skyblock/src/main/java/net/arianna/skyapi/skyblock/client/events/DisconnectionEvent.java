package net.arianna.skyapi.skyblock.client.events;

import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;

public class DisconnectionEvent {

    /**
     * idk.
     */
    @SubscribeEvent
    public void onJoin(EntityJoinWorldEvent event) {

    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void AfkListener(FMLNetworkEvent.ClientDisconnectionFromServerEvent event) {

    }


}
