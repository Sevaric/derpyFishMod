package com.df.item;

import net.minecraft.item.Item;

import com.df.creativetabs.CreativeTabsManager;
import com.df.lib.StringLibrary;

public class Fish extends Item {

	public Fish() {
		this.setUnlocalizedName("Fish");
		this.setCreativeTab(CreativeTabsManager.tabFish);
		this.setMaxDamage(64);
		this.setMaxStackSize(8);
		this.setTextureName(StringLibrary.MODID + ":fish");
	}

}
