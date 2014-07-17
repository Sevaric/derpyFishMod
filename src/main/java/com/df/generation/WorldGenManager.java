package com.df.generation;

import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGenManager {

	public static void mainRegistry() {
		GameRegistry.registerWorldGenerator(new fishOreGen(), 0);
	}

}
