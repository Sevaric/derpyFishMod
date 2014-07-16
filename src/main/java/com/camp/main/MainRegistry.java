package com.camp.main;

import com.camp.block.BlockManager;
import com.camp.creativetabs.CreativeTabsManager;
import com.camp.entity.EntityManager;
import com.camp.generation.WorldGenManager;
import com.camp.item.ItemManager;
import com.camp.lib.StringLibrary;
import com.camp.recipe.RecipeManager;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = StringLibrary.MODID, name = StringLibrary.name, version = StringLibrary.version)
public class MainRegistry {

	@SidedProxy(clientSide = "com.camp.main.ClientProxy", serverSide = "com.camp.main.ServerProxy")
	public static ClientProxy proxy;

	@Instance(value = StringLibrary.MODID)
	public static MainRegistry modInstance;

	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent) {
		WorldGenManager.mainRegistry();
		CreativeTabsManager.mainRegistry();
		ItemManager.mainRegistry();
		BlockManager.mainRegistry();
		RecipeManager.mainRegistry();
		EntityManager.mainRegistry();
		proxy.registerRenderThings();
	}

	@EventHandler
	public static void Load(FMLInitializationEvent Event) {

	}

	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent) {

	}

}
