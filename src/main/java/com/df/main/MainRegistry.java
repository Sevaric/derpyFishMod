package com.df.main;

import com.df.block.BlockManager;
import com.df.creativetabs.CreativeTabsManager;
import com.df.entity.EntityManager;
import com.df.generation.WorldGenManager;
import com.df.item.ItemManager;
import com.df.lib.StringLibrary;
import com.df.recipe.RecipeManager;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = StringLibrary.MODID, name = StringLibrary.name, version = StringLibrary.version)
public class MainRegistry {

	@SidedProxy(clientSide = "com.df.main.ClientProxy", serverSide = "com.df.main.ServerProxy")
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
