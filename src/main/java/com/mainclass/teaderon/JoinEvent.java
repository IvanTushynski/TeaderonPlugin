package com.mainclass.teaderon;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {
    public JoinEvent() {
    }

    @EventHandler
    public void onJoinEvent(PlayerJoinEvent pj) {
        Player p = pj.getPlayer();
        p.sendMessage(ChatColor.BLUE + "---Группа в FB---");
        p.sendMessage(ChatColor.WHITE + "https://vk.com/teaderon");
        p.sendMessage(ChatColor.BLUE + "---Дискорд Сервер---");
        p.sendMessage(ChatColor.WHITE + "https://discord.gg/e7hFthYUjd");
    }
}
