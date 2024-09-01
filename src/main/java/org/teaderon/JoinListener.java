package org.teaderon;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {


    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        Player p = event.getPlayer();
        p.sendMessage(ChatColor.GOLD + "MMO " + ChatColor.DARK_RED + "R" + ChatColor.GOLD + "OLE " + ChatColor.DARK_RED + "P" + ChatColor.GOLD + "LAY " + ChatColor.DARK_RED + "G" + ChatColor.GOLD + "AME " + ChatColor.GOLD + "СЕРВЕР "+ ChatColor.DARK_RED + "ТЕАДЕРОН");
        p.sendMessage(ChatColor.WHITE + "Попытка воплотить мечту в реальность...");
        p.sendMessage(ChatColor.GRAY + "Версия Сервера: " + ChatColor.RED + "3.0");
        p.sendMessage(ChatColor.GRAY + "Версия Клиента: " + ChatColor.RED + "1.16.5");
        p.sendMessage(ChatColor.WHITE + "Для получения дополнительных ссылок");
        p.sendMessage( ChatColor.WHITE + "подходите к " + ChatColor.RED + "Проводникам Теадерона...");
    }

}
