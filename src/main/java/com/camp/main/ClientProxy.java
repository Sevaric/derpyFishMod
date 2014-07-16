package com.camp.main;

import net.minecraft.client.renderer.entity.RenderSnowball;

import com.camp.entity.EntityFBomb;
import com.camp.entity.FishPassive;
import com.camp.item.ItemManager;
import com.camp.model.Fish;
import com.camp.render.RenderFish;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy {

	public void registerRenderThings() {
		RenderingRegistry.registerEntityRenderingHandler(FishPassive.class,
				new RenderFish(new Fish(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityFBomb.class,
				new RenderSnowball(ItemManager.FishBomb));
	}

}
