package org.teaderon;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class fallDamage implements Listener {

    public fallDamage() {
    }

    @EventHandler(
            priority = EventPriority.HIGHEST
    )
    public void onEntityDamageEvent(EntityDamageEvent e) {
        if (e.getEntity() instanceof Player) {
            Player p = (Player)e.getEntity();

            if (e.getCause() == EntityDamageEvent.DamageCause.FALL) {
                Entity entity = e.getEntity();
                double fallDistance = entity.getFallDistance();

                if (fallDistance >= 4.0 && fallDistance <= 5.9){
                    double damage = p.getHealth() / 100.0 * 99.0;
                    p.setHealth(damage);
                }
                else if (fallDistance >= 6.0 && fallDistance <=7.9) {
                    double damage = p.getHealth() / 100.0 * 90.0;
                    p.setHealth(damage);
                }
                else if (fallDistance >= 8.0 && fallDistance <= 9.9) {
                    double damage = p.getHealth() / 100.0 * 80.0;
                    p.setHealth(damage);
                }
                else if (fallDistance >= 10.0 && fallDistance <= 10.9) {
                    double damage = p.getHealth() / 100.0 * 60.0;
                    p.setHealth(damage);
                }
                else if (fallDistance >= 11.0 && fallDistance <= 12.9) {
                    double damage = p.getHealth() / 100.0 * 40.0;
                    p.setHealth(damage);
                }
                else if (fallDistance >= 13.0 && fallDistance <= 14.9) {
                    double damage = p.getHealth() / 100.0 * 20.0;
                    p.setHealth(damage);
                }
                else if (fallDistance >= 15.0) {
                    double damage = p.getHealth() / 100.0 * 0.0;
                    p.setHealth(damage);
                }
            }
        }

    }

}
