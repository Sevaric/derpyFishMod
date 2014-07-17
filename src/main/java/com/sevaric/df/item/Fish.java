package com.sevaric.df.item;

import net.minecraft.item.Item;

import com.sevaric.df.creativetabs.CreativeTabsManager;
import com.sevaric.df.lib.StringLibrary;

public class Fish extends Item {

	public Fish() {
		this.setUnlocalizedName("Fish");
		this.setCreativeTab(CreativeTabsManager.tabFish);
		this.setMaxDamage(64);
		this.setMaxStackSize(8);
		this.setTextureName(StringLibrary.MODID + ":fish");
	}

}
