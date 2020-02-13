package net.comorevi.nukkitplugin;

import cn.nukkit.block.Block;
import cn.nukkit.command.*;
import cn.nukkit.level.generator.Generator;
import cn.nukkit.plugin.PluginBase;

import java.util.Random;

public class EmptyWorld extends PluginBase {

    @Override
    public void onLoad() {
        Generator.addGenerator(EmptyGenerator.class, "EmptyWorld", 99);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        switch (command.getName()) {
            case "void":
                generateLevel("void");
                getServer().getLevelByName("void").setBlock(getServer().getLevelByName("void").getSafeSpawn(), Block.get(Block.STONE));
                break;
        }
        return true;
    }

    private void generateLevel(String levelName) {
        Long seed = new Random().nextLong();
        Class<? extends Generator> generator = Generator.getGenerator(99);
        getServer().generateLevel(levelName, seed, generator);
    }
}
