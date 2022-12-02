package net.arianna.skyapi.skyblock;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.skyapi.skyblock.client.handlers.RegisterModules;

@Mod(modid = "skyapibeta", version = "1.0", clientSideOnly = true)
public class SkyAPI {

    @EventHandler
    public void init(FMLInitializationEvent event) {
//        File configFile = new File(Loader.instance().getConfigDir() + "/../", "eula.txt");

//        System.out.println(configFile.getPath());
//        if (configFile.isFile()) Properties.setClient(false);
//        else Properties.setClient(true);

        Properties.setClient(true);
        if (Properties.getClient()) new RegisterModules();
        else System.out.println("This is a client-only mod, not a server mod, please check that you have the correct mod, Thank you.");
    }
}
