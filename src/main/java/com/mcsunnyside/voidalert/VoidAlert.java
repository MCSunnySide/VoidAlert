package com.mcsunnyside.voidalert;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public final class VoidAlert extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        new BukkitRunnable(){
            @Override
            public void run() {
                Bukkit.getOnlinePlayers().forEach((p)->{
                    if(p.getLocation().getY() > 0){
                        return;
                    }
                    p.sendTitle(ChatColor.RED+"危",ChatColor.YELLOW+"↑ 抬升 高度过低 抬升 ↑",0,10,0);
                });
            }
        }.runTaskTimerAsynchronously(this,0,5);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
