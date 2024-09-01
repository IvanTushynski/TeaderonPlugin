package org.teaderon;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Teaderon extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new fallDamage(), this);
        Bukkit.getPluginManager().registerEvents(new fireDamage(), this);
        Bukkit.getPluginManager().registerEvents(new fireCampDamage(), this);
        Bukkit.getPluginManager().registerEvents(new magmaBlockDamage(), this);
        Bukkit.getPluginManager().registerEvents(new lavaDamage(), this);
        Bukkit.getPluginManager().registerEvents(new poisonDamage(), this);
        Bukkit.getPluginManager().registerEvents(new witherDamage(), this);
        Bukkit.getPluginManager().registerEvents(new voidDamage(), this);
        Bukkit.getPluginManager().registerEvents(new contactDamage(), this);
        Bukkit.getPluginManager().registerEvents(new AirLevel(), this);
        Bukkit.getPluginManager().registerEvents(new FoodLevel(), this);
        getServer().getPluginManager().registerEvents(this, this);
        Bukkit.getPluginManager().registerEvents(new JoinListener(), this);
        this.getCommand("teaderonlottery").setExecutor(new Lottery());
        this.getCommand("chestopenfreavell").setExecutor(new ChestOpenFreavell());
        this.getCommand("chestopenromenna").setExecutor(new ChestOpenRomenna());
        this.getCommand("chestopenlinhir").setExecutor(new ChestOpenLinhir());
        this.getCommand("chestopentrakling").setExecutor(new ChestOpenTrakling());
        this.getCommand("chestopendolamrot").setExecutor(new ChestOpenDolamrot());
        this.getCommand("chestopenzelfard").setExecutor(new ChestOpenZelfard());
        this.getCommand("chestopenelementsone").setExecutor(new ChestOpenElementsOne());
        this.getCommand("chestopenelementstwo").setExecutor(new ChestOpenElementsTwo());
        this.getCommand("chestopenelementsthree").setExecutor(new ChestOpenElementsThree());
        this.getCommand("chestopenelementsfour").setExecutor(new ChestOpenElementsFour());
        this.getCommand("chestopenelementsfive").setExecutor(new ChestOpenElementsFive());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
