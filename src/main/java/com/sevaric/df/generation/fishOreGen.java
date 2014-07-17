package com.sevaric.df.generation;

import java.util.Random;

import com.sevaric.df.block.BlockManager;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class fishOreGen implements IWorldGenerator {

	public fishOreGen() {
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.dimensionId == 0) {
			this.generateSurface(world, random, chunkX << 4, chunkZ << 4);
		}
	}

	public void generateSurface(World par1World, Random par2Random, int chunkX,
			int chunkZ) {
		String s = par1World.getBiomeGenForCoords(chunkX + 8, chunkZ + 8).biomeName;
		if (s.startsWith("Ocean")) {
			int rarity = 5;
			int veinSize = 10;
			int height = 20;
			for (int i = 0; i < rarity; ++i) {
				int randomPosX = chunkX + par2Random.nextInt(16);
				int randomPosY = par2Random.nextInt(height);
				int randomPosZ = chunkZ + par2Random.nextInt(16);
				(new WorldGenMinable(BlockManager.fishOre, veinSize)).generate(
						par1World, par2Random, randomPosX, randomPosY,
						randomPosZ);
			}
		}
	}
}
