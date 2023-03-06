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
        p.sendMessage(ChatColor.DARK_AQUA + "---Сообщество в VK---");
        p.sendMessage(ChatColor.WHITE + "https://vk.com/teaderon");
        p.sendMessage(ChatColor.BLUE + "---T",ChatColor.BLACK + "ikT",ChatColor.RED + "ok---");
        p.sendMessage(ChatColor.WHITE + "https://www.tiktok.com/@teaderon.minecraft");
        p.sendMessage(ChatColor.BLUE + "---Дискорд Сервер---");
        p.sendMessage(ChatColor.WHITE + "https://discord.gg/e7hFthYUjd");
    }
}
