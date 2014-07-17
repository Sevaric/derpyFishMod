package com.df.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockManager {

	public static void mainRegistry() {
		initializeBlock();
		registerBlock();
	}
	
	public static Block fishOre;

	public static void initializeBlock() {
		fishOre = new fishOre(Material.rock);
	}

	public static void registerBlock() {
		GameRegistry.registerBlock(fishOre, fishOre.getUnlocalizedName());
	}
	
	public void generateSurface(World world, Random random, int a, int c) {
		for (int rarity = 0; rarity < 100; rarity++)
													
		{
			int veinSize = 10;// replace with size of vein
			int x = a + random.nextInt(16);
			int y = random.nextInt(128);
			int z = c + random.nextInt(16);

			if (world.getBiomeGenForCoords(a, c) == BiomeGenBase.ocean)
				new WorldGenMinable(BlockManager.fishOre, veinSize)
						.generate(world, random, x, y, z);
		}
	}

}