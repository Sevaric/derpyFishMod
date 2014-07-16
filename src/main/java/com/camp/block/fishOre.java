package com.camp.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.item.ItemManager;
import com.camp.lib.StringLibrary;

public class fishOre extends Block {

	protected fishOre(Material p_i45394_1_) {
		super(p_i45394_1_);

		this.setBlockName("fishOre");
		this.setCreativeTab(CreativeTabsManager.tabFish);
		this.setBlockTextureName(StringLibrary.MODID + ":fish_ore");
		this.setHardness(15.0F);
		this.setResistance(1500.0F);
		this.setLightLevel(0.6F);
	}

	@Override
	public int quantityDropped(Random rand) {
		return rand.nextInt(2);
	}

	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_,
			int p_149650_3_) {
		return ItemManager.Fish;
	}

}
