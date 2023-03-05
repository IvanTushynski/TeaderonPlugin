package com.mainclass.teaderon;

import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Sound;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.plugin.RegisteredServiceProvider;

public class Lottery implements CommandExecutor {
    public static Economy eco;

    public Lottery() {
    }

    private void executeCommand(Player p, boolean console, String cmd) {
        CommandSender sender = p;
        if (console) {
            sender = Bukkit.getServer().getConsoleSender();
        }

        Bukkit.getServer().dispatchCommand((CommandSender)sender, ChatColor.translateAlternateColorCodes('&', cmd.replaceAll("%player%", p.getName())));
    }

    public static void init() {
        RegisteredServiceProvider<Economy> reg = Bukkit.getServicesManager().getRegistration(Economy.class);
        if (reg != null) {
            eco = (Economy)reg.getProvider();
        }

    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (eco == null) {
                Bukkit.getLogger().info(ChatColor.DARK_RED + "Connect To Vault Failed!!!");
                return true;
            }

            Player player = (Player)sender;
            int[] exp = new int[100];
            int check = (int)Math.floor(Math.random() * (double)exp.length);
            if (check >= 0 && check <= 46) {
                player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 1.0F, 1.0F);
                player.sendTitle(ChatColor.RED + "Не Повезло....", ChatColor.RED + "Попробуйте Ещё", 2, 30, 2);
            } else {
                Firework firework;
                FireworkMeta data;
                if (check >= 47 && check <= 69) {
                    this.executeCommand(player, true, "mi give MISCELLANEOUS SILVER_COIN %player% 1");
                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.GOLD + "Ваш Выигрыш - Серебрянная Монета!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check >= 70 && check <= 76) {
                    this.executeCommand(player, true, "mi give CONSUMABLE XP_DROP_LOTTERY %player% 1");
                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.GOLD + "Ваш Выигрыш - Капсула на 1600 Очков Опыта!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check >= 77 && check <= 85) {
                    this.executeCommand(player, true, "mi give MISCELLANEOUS TAVERNCOIN %player% 1");
                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.GOLD + "Ваш Выигрыш - Монета Фреавеллской Таверны!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check >= 86 && check <= 91) {
                    this.executeCommand(player, true, "mi give MISCELLANEOUS TEADERONCOIN %player% 1");
                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.GOLD + "Ваш Выигрыш - Бадж Теадерона!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check >= 92 && check <= 96) {
                    this.executeCommand(player, true, "mi give CONSUMABLE XP_DROP_LOTTERY_TWO %player% 1");
                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.GOLD + "Ваш Выигрыш - Капсула на 3800 Очков Опыта!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check >= 97 && check <= 98) {
                    this.executeCommand(player, true, "mi give MISCELLANEOUS GOLD_COIN1 %player% 1");
                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.GOLD + "Ваш Выигрыш - Золотая Монета!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check == 99) {
                    this.executeCommand(player, true, "mi give MATERIAL SUMMONCAT1 %player% 1");
                    player.playSound(player.getLocation(), Sound.MUSIC_DRAGON, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.DARK_RED + "!!!Джекпот - Питомец!!!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check == 100) {
                    this.executeCommand(player, true, "give %player% diamond 64");
                    player.playSound(player.getLocation(), Sound.MUSIC_DRAGON, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.DARK_RED + "!!!Джекпот - 64 Алмазов!!!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                }
            }
        }

        return true;
    }
}
