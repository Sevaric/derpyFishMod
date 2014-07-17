package com.sevaric.df.render;

import com.sevaric.df.lib.StringLibrary;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderFish extends RenderLiving {

	public RenderFish(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		
		return new ResourceLocation(StringLibrary.MODID + ":textures/entity/fish_texture.png");
	}

}
