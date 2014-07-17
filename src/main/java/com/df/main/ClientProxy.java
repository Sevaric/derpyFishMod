package com.df.main;

import net.minecraft.client.renderer.entity.RenderSnowball;

import com.df.entity.EntityFBomb;
import com.df.entity.FishPassive;
import com.df.item.ItemManager;
import com.df.model.Fish;
import com.df.render.RenderFish;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy {

	public void registerRenderThings() {
		RenderingRegistry.registerEntityRenderingHandler(FishPassive.class,
				new RenderFish(new Fish(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityFBomb.class,
				new RenderSnowball(ItemManager.FishBomb));
	}

}
