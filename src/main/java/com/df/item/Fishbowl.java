package com.df.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.df.creativetabs.CreativeTabsManager;
import com.df.entity.FishPassive;
import com.df.lib.StringLibrary;

public class Fishbowl extends Item {

	public Fishbowl() {
		this.setUnlocalizedName("FishBowl");
		this.setCreativeTab(CreativeTabsManager.tabFish);
		this.setMaxDamage(64);
		this.setMaxStackSize(1);
		this.setTextureName(StringLibrary.MODID + ":fish_bowl");
	}

	public boolean onItemUse(ItemStack item, EntityPlayer player, World world,
			int x, int y, int z, int side, float xOffset, float yOffset,
			float zOffSet) {
		if (!world.isRemote) {

			if (world.getBlock(x, y, z) == Blocks.water
					|| (world.getBlock(x, y + 1, z) == Blocks.water && (world
							.getBlock(x, y, z) == Blocks.stone
							|| world.getBlock(x, y, z) == Blocks.sand
							|| world.getBlock(x, y, z) == Blocks.dirt || world
							.getBlock(x, y, z) == Blocks.sandstone))) {
				FishPassive ent = new FishPassive(world); // change to whatever
															// entity you're
															// trying to spawn
				ent.setLocationAndAngles(x, y + 1, z, MathHelper
						.wrapAngleTo180_float(world.rand.nextFloat() * 360.0F),
						0.0F);
				world.spawnEntityInWorld(ent);
			}
			return true;
		}
		return bFull3D;

	}
}
