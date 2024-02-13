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
        p.sendMessage(ChatColor.WHITE + " ");
        p.sendMessage(ChatColor.GOLD + "⬇" + ChatColor.WHITE + "ССЫЛКИ" + ChatColor.GOLD + "⬇");
        p.sendMessage(ChatColor.WHITE + "---------" + ChatColor.BLUE + " DISCORD " + ChatColor.WHITE + "---------");
        p.sendMessage(ChatColor.BLACK + "https://discord.gg/e7hFthYUjd");
        p.sendMessage(ChatColor.WHITE + " ");
        p.sendMessage(ChatColor.GOLD + "⬇" + ChatColor.WHITE + "ТЕКСТУРПАКИ" + ChatColor.GOLD + "⬇");
        p.sendMessage(ChatColor.WHITE + "---------" + ChatColor.BLUE + ChatColor.DARK_RED + " HD " + ChatColor.WHITE + "---------");
        p.sendMessage(ChatColor.BLACK + "https://www.dropbox.com/scl/fi/ykwfxx7lcy9e3n5cvujbc/TEADERON.zip?rlkey=zf5w2psr9jfex4i2g5wwybzso&dl=0");
        p.sendMessage(ChatColor.WHITE + "---------" + ChatColor.BLUE + ChatColor.DARK_GREEN + " SD " + ChatColor.WHITE + "---------");
        p.sendMessage(ChatColor.BLACK + "https://www.dropbox.com/scl/fi/q7z3bqfwy7suciqu88zov/TEADERONLOW.zip?rlkey=omni19oglber05pbtypqg6ynr&dl=0");
        p.sendMessage(ChatColor.WHITE + " ");
        p.sendMessage(ChatColor.WHITE + "Версия Сервера: " + ChatColor.RED + "2.0     " + ChatColor.WHITE + "Версия Клиента: " + ChatColor.RED + "1.16.5+");
    }

}
