package org.teaderon;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChestOpenElementsThree implements CommandExecutor {

    public ChestOpenElementsThree() {
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
            int[] exp = new int[436];
            int check = (int)Math.floor(Math.random() * (double)exp.length);
            if (check >= 0 && check <= 20) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORFIREELEMENT5 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 5 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 21 && check <= 30) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORFIREELEMENT6 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 6 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 31 && check <= 40) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORFIREELEMENT7 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 7 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 41 && check <= 50) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORICEELEMENT5 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 5 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 51 && check <= 60) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORICEELEMENT6 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 6 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 61 && check <= 70) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORICEELEMENT7 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 7 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 71 && check <= 80) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMOREARTHELEMENT5 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 5 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 81 && check <= 90) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMOREARTHELEMENT6 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 6 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 91 && check <= 100) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMOREARTHELEMENT7 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 7 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 101 && check <= 110) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORWINDELEMENT5 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 5 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 111 && check <= 120) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORWINDELEMENT6 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 6 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 121 && check <= 130) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORWINDELEMENT7 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 7 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 131 && check <= 140) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORLIGHTNESSELEMENT5 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 5 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 141 && check <= 150) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORLIGHTNESSELEMENT6 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 6 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 151 && check <= 160) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORLIGHTNESSELEMENT7 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 7 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 161 && check <= 170) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORDARKNESSELEMENT5 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 5 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 171 && check <= 180) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORDARKNESSELEMENT6 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 6 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 426 && check <= 436) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORDARKNESSELEMENT7 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 7 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 181 && check <= 190) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORFIREELEMENT10 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 10 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 191 && check <= 195) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORICEELEMENT10 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 10 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 196 && check <= 200) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMOREARTHELEMENT10 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 10 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 201 && check <= 205) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORWINDELEMENT10 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 10 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 206 && check <= 210) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORLIGHTNESSELEMENT10 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 10 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 211 && check <= 215) {
                this.executeCommand5(player, true, "mi give GEM_STONE ARMORDARKNESSELEMENT10 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 10 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 221 && check <= 230) {
                this.executeCommand5(player, true, "mi give GEM_STONE FIREELEMENT5 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 5 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 231 && check <= 240) {
                this.executeCommand5(player, true, "mi give GEM_STONE FIREELEMENT6 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 6 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 241 && check <= 250) {
                this.executeCommand5(player, true, "mi give GEM_STONE FIREELEMENT7 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 7 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 251 && check <= 260) {
                this.executeCommand5(player, true, "mi give GEM_STONE ICEELEMENT5 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 5 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 261 && check <= 270) {
                this.executeCommand5(player, true, "mi give GEM_STONE ICEELEMENT6 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 6 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 271 && check <= 280) {
                this.executeCommand5(player, true, "mi give GEM_STONE ICEELEMENT7 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 7 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 281 && check <= 290) {
                this.executeCommand5(player, true, "mi give GEM_STONE EARTHELEMENT5 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 5 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 291 && check <= 300) {
                this.executeCommand5(player, true, "mi give GEM_STONE EARTHELEMENT6 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 6 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 301 && check <= 310) {
                this.executeCommand5(player, true, "mi give GEM_STONE EARTHELEMENT7 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 7 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 311 && check <= 320) {
                this.executeCommand5(player, true, "mi give GEM_STONE WINDELEMENT5 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 5 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 321 && check <= 330) {
                this.executeCommand5(player, true, "mi give GEM_STONE WINDELEMENT6 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 6 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 331 && check <= 340) {
                this.executeCommand5(player, true, "mi give GEM_STONE WINDELEMENT7 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 7 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 341 && check <= 350) {
                this.executeCommand5(player, true, "mi give GEM_STONE LIGHTNESSELEMENT5 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 5 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 351 && check <= 360) {
                this.executeCommand5(player, true, "mi give GEM_STONE LIGHTNESSELEMENT6 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 6 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 361 && check <= 370) {
                this.executeCommand5(player, true, "mi give GEM_STONE LIGHTNESSELEMENT7 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 7 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 371 && check <= 380) {
                this.executeCommand5(player, true, "mi give GEM_STONE DARKNESSELEMENT5 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 5 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 381 && check <= 390) {
                this.executeCommand5(player, true, "mi give GEM_STONE DARKNESSELEMENT6 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 6 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 391 && check <= 400) {
                this.executeCommand5(player, true, "mi give GEM_STONE DARKNESSELEMENT7 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Стихийный Самоцвет 7 Уровня!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 401 && check <= 405) {
                this.executeCommand5(player, true, "mi give GEM_STONE FIREELEMENT10 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 10 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 406 && check <= 410) {
                this.executeCommand5(player, true, "mi give GEM_STONE ICEELEMENT10 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 10 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 411 && check <= 415) {
                this.executeCommand5(player, true, "mi give GEM_STONE EARTHELEMENT10 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 10 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 416 && check <= 420) {
                this.executeCommand5(player, true, "mi give GEM_STONE WINDELEMENT10 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 10 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 421 && check <= 425) {
                this.executeCommand5(player, true, "mi give GEM_STONE LIGHTNESSELEMENT10 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 10 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            } else if (check >= 216 && check <= 220) {
                this.executeCommand5(player, true, "mi give GEM_STONE DARKNESSELEMENT10 %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.DARK_RED + "Стихийный Самоцвет 10 Уровня!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
            }
        }

        return false;
    }

}
