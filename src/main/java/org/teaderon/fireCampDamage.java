package org.teaderon;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
public class fireCampDamage implements Listener {

    public fireCampDamage() {
    }

    @EventHandler(
            priority = EventPriority.HIGHEST
    )
    public void onEntityDamageEvent(EntityDamageEvent e) {
        if (e.getEntity() instanceof Player) {
            Player p = (Player)e.getEntity();
            if (e.getCause() == EntityDamageEvent.DamageCause.FIRE) {
                double damage = p.getHealth() / 100.0 * 95.0;
                p.setHealth(damage);
            }
        }

    }

}
