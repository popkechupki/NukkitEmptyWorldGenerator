package net.comorevi.nukkitplugin;

import cn.nukkit.level.ChunkManager;
import cn.nukkit.level.generator.Generator;
import cn.nukkit.math.NukkitRandom;
import cn.nukkit.math.Vector3;

import java.util.HashMap;
import java.util.Map;

public class EmptyGenerator extends Generator {
    private ChunkManager level;

    public EmptyGenerator(Map<String, Object> options) {
        //
    }

    @Override
    public int getId() {
        return 99;
    }

    @Override
    public void init(ChunkManager chunkManager, NukkitRandom nukkitRandom) {
        this.level = chunkManager;
    }

    @Override
    public void generateChunk(int chunkX, int chunkZ) {
        //
    }

    @Override
    public void populateChunk(int chunkX, int chunkZ) {
        //
    }

    @Override
    public Map<String, Object> getSettings() {
        return new HashMap<>();
    }

    @Override
    public String getName() {
        return "EmptyWorld";
    }

    @Override
    public Vector3 getSpawn() {
        return new Vector3(0.5, 256, 0.5);
    }

    @Override
    public ChunkManager getChunkManager() {
        return level;
    }
}
