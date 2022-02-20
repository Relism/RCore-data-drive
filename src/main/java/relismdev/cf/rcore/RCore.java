package relismdev.cf.rcore;

import org.bukkit.plugin.java.JavaPlugin;
import relismdev.cf.rcore.eventListeners.blockBreaking;
import relismdev.cf.rcore.eventListeners.blockPlacing;
import relismdev.cf.rcore.eventListeners.joinLeaveListener;
import relismdev.cf.rcore.eventListeners.mobDamaging;

public final class RCore extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Initialized RTest!");
        getServer().getPluginManager().registerEvents(new blockPlacing(), this);
        getServer().getPluginManager().registerEvents(new blockBreaking(), this);
        getServer().getPluginManager().registerEvents(new mobDamaging(), this);
        getServer().getPluginManager().registerEvents(new joinLeaveListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Stopping RTest, See you soon!!");
    }
}
