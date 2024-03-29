package com.skw359.clearinventory;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("\033[36;1mClearInventory >> \033[32;1;2mLoading data...\033[0m");
        System.out.println("\033[36;1mClearInventory >> \033[32;1;2mWelcome to ClearInventory, \033[34;1;2mby Wizz\033[0m");
        System.out.println("\033[36;1mClearInventory >> \033[36;1;2mReport any issues on GitHub or Discord: Wizz#0607\033[0m");
        getServer().getPluginCommand("clear").setExecutor(new ClearCommand(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("\033[36;1mClearInventory >> \033[32;1;2mClearInventory disabled!\033[0m");
    }
}
