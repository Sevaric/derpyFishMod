package com.camp.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FishHammer extends Item {

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target,
			EntityLivingBase owner) {
		Entity bolt = new EntityLightningBolt(owner.worldObj, target.posX,
				target.posY, target.posZ);
		owner.worldObj.addWeatherEffect(bolt);
		return true;
	}
}
