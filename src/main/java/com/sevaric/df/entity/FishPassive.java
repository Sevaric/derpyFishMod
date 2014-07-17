package com.sevaric.df.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.world.World;

public class FishPassive extends EntitySquid {

	public FishPassive(World par1World) {
		super(par1World);

	}

	public FishPassive(World world, EntityLivingBase player) {
		super(world);
	}

	@Override
	public void dropFewItems(boolean recentlyHit, int lootLevel) {
		int quantity = this.rand.nextInt(4) + 1;

		for (int i = 0; i < quantity; i++) {
			if (this.isBurning()) {
				// this.dropItem(ItemManager.customItem, 1);
			} else {
				// Item drop = Item.getItemFromBlock(BlockManager.customBlock);
				// this.dropItem(drop, 1);
			}
		}

	}

	// public FishPassive(World par1World) {
	// super(par1World);
	// this.setSize(1.0F, 1.0F);
	// this.tasks.addTask(0, new EntityAISwimming(this));
	// this.tasks.addTask(0, new EntityAIWander(this, 0.5D));
	// this.tasks.addTask(1, new EntityAITempt(this, 1.0d, Items.nether_star,
	// false));
	// this.tasks.addTask(2, new EntityAIPanic(this, 0.7d));
	// this.tasks.addTask(3, new EntityAIWander(this, 0.3d));

	// }

	// public FishPassive createChild(EntityAgeable var1) {
	//
	// return new FishPassive(worldObj);
	// }
	//
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth)
				.setBaseValue(5.0D);
		// this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.0D);
		// this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(3.0D);
	}

	// public boolean isAIEnabled() {
	// return true;
	// }

}
