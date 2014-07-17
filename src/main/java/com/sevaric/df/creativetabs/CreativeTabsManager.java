package com.sevaric.df.creativetabs;

import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabsManager {

	public static void mainRegistry() {
		initializeTabs();
	}

	public static CreativeTabs tabFish;

	public static void initializeTabs() {
		tabFish = new ItemTab("FishItemTab");
	}

}
