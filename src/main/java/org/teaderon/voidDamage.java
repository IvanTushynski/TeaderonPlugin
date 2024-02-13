package org.teaderon;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
public class voidDamage implements Listener {

    public voidDamage() {
    }

    @EventHandler(
            priority = EventPriority.HIGHEST
    )
    public void onEntityDamageEvent(EntityDamageEvent e) {
        if (e.getEntity() instanceof Player) {
            Player p = (Player)e.getEntity();

            if (e.getCause() == EntityDamageEvent.DamageCause.VOID) {
                double damage = p.getHealth() / 100.0 * 50.0;
                p.setHealth(damage);
            }
        }

    }

}
