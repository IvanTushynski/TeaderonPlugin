package com.mainclass.teaderon;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class TeaderonPlugin extends JavaPlugin {
    public TeaderonPlugin() {
    }

    @Override
    public void onEnable() {
        this.getServer().clearRecipes();
        Bukkit.getPluginManager().registerEvents(new fallDamage(), this);
        Bukkit.getPluginManager().registerEvents(new AirLevel(), this);
        Bukkit.getPluginManager().registerEvents(new FoodLevel(), this);
        Bukkit.getPluginManager().registerEvents(new JoinEvent(), this);
        this.getCommand("teaderonlottery").setExecutor(new Lottery());
        Lottery.init();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
