package me.rockybreslow.ratelimiter;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

/**
 * Created by Rocky Breslow on 7/29/2016.
 */
public class PlayerMoveListener implements Listener {
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        if(event.getPlayer().isGliding()) {
            Vector x = event.getTo().toVector();
            Vector y = event.getFrom().toVector();

            Vector z = x.subtract(y);
            if((Math.abs(z.getX()) > 1 || Math.abs(z.getZ()) > 1) && z.getY() == 0) {
                event.setCancelled(true);
            }
        }
    }
}
