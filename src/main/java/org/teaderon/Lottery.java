package org.teaderon;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.FireworkMeta;

public class Lottery  implements CommandExecutor {

    public Lottery() {
    }

    private void executeCommand(Player p, boolean console, String cmd) {
        CommandSender sender = p;
        if (console) {
            sender = Bukkit.getServer().getConsoleSender();
        }

        Bukkit.getServer().dispatchCommand((CommandSender)sender, ChatColor.translateAlternateColorCodes('&', cmd.replaceAll("%player%", p.getName())));
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player)sender;
            int[] exp = new int[230];
            int check = (int)Math.floor(Math.random() * (double)exp.length);
            if (check >= 0 && check <= 46) {
                player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 1.0F, 1.0F);
                player.sendTitle(ChatColor.RED + "Не Повезло....", ChatColor.RED + "Попробуйте Ещё", 2, 30, 2);
            } else {
                Firework firework;
                FireworkMeta data;
                if (check >= 47 && check <= 50) {
                    this.executeCommand(player, true, "mi give CONSUMABLE DEFAULT7_GROUP %player% 1");
                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.GOLD + "Ваш Выигрыш - Титул Стиляга!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(FireworkEffect.Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                }

                if (check >= 51 && check <= 54) {
                    this.executeCommand(player, true, "mi give CONSUMABLE DEFAULT9_GROUP %player% 1");
                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.GOLD + "Ваш Выигрыш - Титул Чудеса!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(FireworkEffect.Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                }

                if (check >= 55 && check <= 69) {
                    this.executeCommand(player, true, "mi give MISCELLANEOUS SILVER_COIN %player% 1");
                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.GOLD + "Ваш Выигрыш - Серебрянная Монета!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(FireworkEffect.Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check >= 70 && check <= 76) {
                    this.executeCommand(player, true, "mi give CONSUMABLE XP_DROP_LOTTERY %player% 1");
                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.GOLD + "Ваш Выигрыш - Капсула на 1600 Очков Опыта!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(FireworkEffect.Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check >= 77 && check <= 85) {
                    this.executeCommand(player, true, "mi give MISCELLANEOUS TAVERNCOIN %player% 1");
                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.GOLD + "Ваш Выигрыш - Монета Фреавеллской Таверны!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(FireworkEffect.Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check >= 86 && check <= 91) {
                    this.executeCommand(player, true, "mi give MISCELLANEOUS TEADERONCOIN %player% 1");
                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.GOLD + "Ваш Выигрыш - Бадж Теадерона!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(FireworkEffect.Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check >= 92 && check <= 96) {
                    this.executeCommand(player, true, "mi give CONSUMABLE XP_DROP_LOTTERY_TWO %player% 1");
                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.GOLD + "Ваш Выигрыш - Капсула на 3800 Очков Опыта!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(FireworkEffect.Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check >= 97 && check <= 98) {
                    this.executeCommand(player, true, "mi give MISCELLANEOUS GOLD_COIN1 %player% 1");
                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.GOLD + "Ваш Выигрыш - Золотая Монета!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(FireworkEffect.Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check == 99) {
                    this.executeCommand(player, true, "mi give MATERIAL SUMMONGLAD1 %player% 1");
                    player.playSound(player.getLocation(), Sound.MUSIC_DRAGON, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.DARK_RED + "!!!Джекпот - Питомец!!!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(FireworkEffect.Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check == 100) {
                    this.executeCommand(player, true, "give %player% diamond 32");
                    player.playSound(player.getLocation(), Sound.MUSIC_DRAGON, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.DARK_RED + "!!!Джекпот - 32 Алмаза!!!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(FireworkEffect.Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check >= 101 && check <= 110) {
                    this.executeCommand(player, true, "mi give CONSUMABLE ATTR_POINTS_ACHIVEMENTS %player% 1");
                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.GOLD + "Ваш Выигрыш - Очко Атрибута!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(FireworkEffect.Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check >= 111 && check <= 120) {
                    player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.RED + "Не Повезло....", ChatColor.RED + "Попробуйте Ещё", 2, 30, 2);
                } else if (check >= 121 && check <= 125) {
                    this.executeCommand(player, true, "mi give CONSUMABLE XP_BOOSTER %player% 1");
                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.GOLD + "Ваш Выигрыш - Банка Опыта Приключений!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(FireworkEffect.Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check >= 126 && check <= 132) {
                    this.executeCommand(player, true, "mi give CONSUMABLE XP_BOOSTER3 %player% 1");
                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.GOLD + "Ваш Выигрыш - Банка Опыта Ювелира!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(FireworkEffect.Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check >= 133 && check <= 138) {
                    this.executeCommand(player, true, "mi give CONSUMABLE XP_BOOSTER2 %player% 1");
                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.GOLD + "Ваш Выигрыш - Банка Опыта Ремесленника!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(FireworkEffect.Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check >= 139 && check <= 144) {
                    this.executeCommand(player, true, "mi give CONSUMABLE XP_BOOSTER4 %player% 1");
                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.GOLD + "Ваш Выигрыш - Банка Опыта Таверны!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(FireworkEffect.Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check >= 145 && check <= 155) {
                    this.executeCommand(player, true, "mi give CONSUMABLE LOTTERY_TICKET %player% 1");
                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.GOLD + "Ваш Выигрыш - Лотерейный Билет!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(FireworkEffect.Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check >= 156 && check <= 161) {
                    this.executeCommand(player, true, "mi give MATERIAL SVERTOKPROSTRANSTVA %player% 20");
                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.GOLD + "Ваш Выигрыш - Сверток Пространства 20шт.!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(FireworkEffect.Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check >= 162 && check <= 198) {
                    this.executeCommand(player, true, "mi give MISCELLANEOUS SILVER_COIN %player% 1");
                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.GOLD + "Ваш Выигрыш - Серебрянная Монета!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(FireworkEffect.Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check >= 199 && check <= 200) {
                    this.executeCommand(player, true, "mi give MATERIAL CARD1 %player% 1");
                    player.playSound(player.getLocation(), Sound.MUSIC_DRAGON, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.DARK_RED + "!!!Джекпот - Печать Защитника!!!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(FireworkEffect.Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check >= 201 && check <= 210) {
                    this.executeCommand(player, true, "mi give CONSUMABLE FREAVELL_FARM_ON %player% 1");
                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.GOLD + "Ваш Выигрыш - Билет в Пещеру ресурсов Фреавелла!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(FireworkEffect.Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check == 211) {
                    this.executeCommand(player, true, "mi give MATERIAL SUMMONFIR1 %player% 1");
                    player.playSound(player.getLocation(), Sound.MUSIC_DRAGON, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.DARK_RED + "!!!Джекпот - Питомец!!!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(FireworkEffect.Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check == 212) {
                    this.executeCommand(player, true, "mi give MATERIAL SUMMONICE1 %player% 1");
                    player.playSound(player.getLocation(), Sound.MUSIC_DRAGON, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.DARK_RED + "!!!Джекпот - Питомец!!!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(FireworkEffect.Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                } else if (check >= 213 && check <= 220) {
                    this.executeCommand(player, true, "mi give MATERIAL CARD7ZELFARD %player% 1");
                    player.playSound(player.getLocation(), Sound.MUSIC_DRAGON, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.GOLD + "Ваш Выигрыш - Печать Зелфарда!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(FireworkEffect.Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                }
                else if (check >= 221 && check <= 230) {
                    this.executeCommand(player, true, "mi give CONSUMABLE ELEMENTS_CHEST %player% 1");
                    player.playSound(player.getLocation(), Sound.MUSIC_DRAGON, 1.0F, 1.0F);
                    player.sendTitle(ChatColor.GOLD + "Ваш Выигрыш - Ящик со Стихиями!", ChatColor.GOLD + "Поздравляем", 2, 30, 2);
                    firework = (Firework)player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
                    data = firework.getFireworkMeta();
                    data.addEffects(new FireworkEffect[]{FireworkEffect.builder().withColor(Color.RED).withColor(Color.ORANGE).with(FireworkEffect.Type.BURST).withFlicker().build()});
                    data.setPower(0);
                    firework.setFireworkMeta(data);
                }
            }
        }

        return true;
    }

}
