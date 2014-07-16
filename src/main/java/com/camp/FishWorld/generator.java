package com.camp.FishWorld;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.biome.WorldChunkManagerHell;

public class generator extends WorldType {


	public generator(int i, String string) {
		super(null);
	}

	public String getTranslateName()// the name that appears on the screen
	{
		return "Fishy World";
	}

	public WorldChunkManager getChunkManager(World var1) {
		return new WorldChunkManagerHell(BiomeGenBase.ocean, 0.5F);
	}
}