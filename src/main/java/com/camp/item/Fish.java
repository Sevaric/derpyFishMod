package com.camp.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class Fish extends Item {

	public Fish() {
		this.setUnlocalizedName("Fish");
		this.setCreativeTab(CreativeTabsManager.tabFish);
		this.setMaxDamage(64);
		this.setMaxStackSize(8);
		this.setTextureName(StringLibrary.MODID + ":fish");
	}

}
