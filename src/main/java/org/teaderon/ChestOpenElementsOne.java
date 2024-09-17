package org.teaderon;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChestOpenElementsOne implements CommandExecutor {

    public ChestOpenElementsOne() {
    }

    private void executeCommand5(Player p, boolean console, String cmd) {
        CommandSender sender = p;
        if (console) {
            sender = Bukkit.getServer().getConsoleSender();
        }

        Bukkit.getServer().dispatchCommand((CommandSender)sender, ChatColor.translateAlternateColorCodes('&', cmd.replaceAll("%player%", p.getName())));
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player)sender;
            int[] exp = new int[210];
            int check = (int)Math.floor(Math.random() * (double)exp.length);
            if (check >= 0 && check <= 10) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORFIREELEMENT1 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 1 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 11 && check <= 20) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORICEELEMENT1 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 1 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 21 && check <= 30) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMOREARTHELEMENT1 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 1 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 31 && check <= 40) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORWINDELEMENT1 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 1 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 41 && check <= 45) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORLIGHTNESSELEMENT1 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 1 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 46 && check <= 50) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORDARKNESSELEMENT1 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 1 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 51 && check <= 60) {
                this.executeCommand5(player, true, "mi give GEM_STONE FIREELEMENT1 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 1 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 61 && check <= 70) {
                this.executeCommand5(player, true, "mi give GEM_STONE ICEELEMENT1 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 1 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 71 && check <= 80) {
                this.executeCommand5(player, true, "mi give GEM_STONE EARTHELEMENT1 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 1 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 81 && check <= 90) {
                this.executeCommand5(player, true, "mi give GEM_STONE WINDELEMENT1 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 1 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 91 && check <= 95) {
                this.executeCommand5(player, true, "mi give GEM_STONE LIGHTNESSELEMENT1 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 1 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 96 && check <= 100) {
                this.executeCommand5(player, true, "mi give GEM_STONE DARKNESSELEMENT1 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 1 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 101 && check <= 110) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORFIREELEMENT2 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 2 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 111 && check <= 120) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORICEELEMENT2 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 2 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 121 && check <= 130) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMOREARTHELEMENT2 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 2 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 131 && check <= 140) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORWINDELEMENT2 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 2 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 141 && check <= 145) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORLIGHTNESSELEMENT2 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 2 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 146 && check <= 150) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORDARKNESSELEMENT2 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 2 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 151 && check <= 160) {
                this.executeCommand5(player, true, "mi give GEM_STONE FIREELEMENT2 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 2 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 161 && check <= 170) {
                this.executeCommand5(player, true, "mi give GEM_STONE ICEELEMENT2 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 2 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 171 && check <= 180) {
                this.executeCommand5(player, true, "mi give GEM_STONE EARTHELEMENT2 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 2 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 181 && check <= 190) {
                this.executeCommand5(player, true, "mi give GEM_STONE WINDELEMENT2 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 2 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 191 && check <= 195) {
                this.executeCommand5(player, true, "mi give GEM_STONE LIGHTNESSELEMENT2 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 2 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 196 && check <= 200) {
                this.executeCommand5(player, true, "mi give GEM_STONE DARKNESSELEMENT2 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 2 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 201 && check <= 210) {
                this.executeCommand5(player, true, "mi give TOME BOOK_ELEMENTS_WORLD %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Глава III - Стихии!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            }
        }
        return false;
    }

}
