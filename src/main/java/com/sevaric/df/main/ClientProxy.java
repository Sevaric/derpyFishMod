package com.sevaric.df.main;

import net.minecraft.client.renderer.entity.RenderSnowball;

import com.sevaric.df.entity.EntityFBomb;
import com.sevaric.df.entity.FishPassive;
import com.sevaric.df.item.ItemManager;
import com.sevaric.df.model.Fish;
import com.sevaric.df.render.RenderFish;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy {

	public void registerRenderThings() {
		RenderingRegistry.registerEntityRenderingHandler(FishPassive.class,
				new RenderFish(new Fish(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityFBomb.class,
				new RenderSnowball(ItemManager.FishBomb));
	}

}
