package com.df.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.df.entity.EntityFBomb;

public class FishBomb extends Item {

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world,
			EntityPlayer player) {
		if (!player.capabilities.isCreativeMode) {
			--stack.stackSize;
		}

		if (!world.isRemote) {
			world.spawnEntityInWorld(new EntityFBomb(world, player));
		}

		return stack;
	}

}
