package org.teaderon;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityAirChangeEvent;

public class AirLevel implements Listener{
    public AirLevel() {
    }

    @EventHandler
    public void onAirEvent(EntityAirChangeEvent i) {
        if (i.getEntity() instanceof Player) {
            Player p = (Player)i.getEntity();
            p.getRemainingAir();
            if (p.getRemainingAir() == 80) {
                p.sendTitle(ChatColor.RED + "Мой Воздух Заканчивается!!!", ChatColor.RED + "Нужно Срочно Всплывать!!!", 2, 40, 2);
            } else if (p.getRemainingAir() == 0) {
                p.setHealth(0.0);
            }
        }

    }
}
