package com.sevaric.df.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.sevaric.df.creativetabs.CreativeTabsManager;
import com.sevaric.df.item.ItemManager;
import com.sevaric.df.lib.StringLibrary;

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
