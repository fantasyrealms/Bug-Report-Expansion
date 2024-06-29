package net.fantasyrealms.bugreportexpansion;

import org.bukkit.plugin.java.JavaPlugin;

public final class BugReportExpansionPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        new BugExpansion().register();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        new BugExpansion().unregister();
    }
}
