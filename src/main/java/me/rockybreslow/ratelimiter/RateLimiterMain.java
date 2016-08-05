package me.rockybreslow.ratelimiter;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Rocky Breslow on 7/29/2016.
 */
public class RateLimiterMain extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerMoveListener(), this);
    }

    @Override
    public void onDisable(){

    }
}
