package net.arianna.skyapi.skyblock.client.events;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;

import java.util.TimerTask;

public class ClaimMinions extends TimerTask {

    private final GameSettings gameSettings;
    private final long period;
    private final long walkingTime;

    /**
     * Didn't get this to work, but it's a good idea.
     */
    public ClaimMinions(Minecraft minecraft, long period, long walkingTime) {
        this.gameSettings = minecraft.gameSettings;
        this.period = period;
        this.walkingTime = walkingTime;
    }

    @Override
    public void run() {
        int forward = gameSettings.keyBindForward.getKeyCode();
        int right = gameSettings.keyBindRight.getKeyCode();
        int back = gameSettings.keyBindBack.getKeyCode();
        int left = gameSettings.keyBindLeft.getKeyCode();
        int[] keyCodes = {forward, right, back, left};

        long oldTime = System.currentTimeMillis();

        while (System.currentTimeMillis() - oldTime < walkingTime) KeyBinding.setKeyBindState(keyCodes[0], true);


        KeyBinding.setKeyBindState(keyCodes[0], false);

        try {
            Thread.sleep(period);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}