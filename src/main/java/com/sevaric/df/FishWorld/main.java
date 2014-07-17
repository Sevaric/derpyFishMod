package com.sevaric.df.FishWorld;

import net.minecraft.world.WorldType;

public class main {
	public static final WorldType Fishy = new generator(3, "Fishy");// our new
																	// world
																	// type

	public String getVersion()// the version
	{
		return "1.7.2";
	}

	public void load() {
	}// leave it empty it dos'nt matter
}