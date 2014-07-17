package com.sevaric.df.creativetabs;

import com.sevaric.df.item.ItemManager;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemTab extends CreativeTabs {

	public ItemTab(String lable) {
		super(lable);
		
	}

	@Override
	public Item getTabIconItem() {
		
		return ItemManager.Fishbowl;
	}

}
