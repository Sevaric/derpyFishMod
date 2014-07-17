package com.sevaric.df.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityFBomb extends EntityThrowable {

	public EntityFBomb(World par1World, EntityLivingBase par2EntityLivingBase) {
		super(par1World, par2EntityLivingBase);
	}

	public EntityFBomb(World world) {
		super(world);
	}

	@Override
	protected void onImpact(MovingObjectPosition var1) {
		if (!this.worldObj.isRemote) {
			this.worldObj.newExplosion(this, this.posX, this.posY, this.posZ,
					3.0F, false, true);
			this.setDead();
		}
	}

}
