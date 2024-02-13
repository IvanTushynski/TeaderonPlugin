package org.teaderon;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class FoodLevel implements Listener {

    public FoodLevel() {
    }

    @EventHandler
    public void onFoodEvent(FoodLevelChangeEvent y) {
        if (y.getEntity() instanceof Player) {
            Player p = (Player)y.getEntity();
            p.getFoodLevel();
            if (p.getFoodLevel() <= 6) {
                p.sendTitle(ChatColor.RED + "Я Чувствую Сильный Голод!!!", ChatColor.RED + "Нужно Подкрепиться!!!", 2, 40, 2);
            } else if (p.getFoodLevel() == 0) {
                p.setHealth(0.0);
            }
        }

    }

}
