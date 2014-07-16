package com.camp.recipe;
 
import com.camp.item.ItemManager;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
 
public class RecipeManager{
 
    public static void mainRegistry(){
        addCraftingRecipes();
        addSmeltingRecipes();
 
    }//end mainRegistry
  
 
    public static void addCraftingRecipes() {
 
        //Shapeless Recipes
 
    	ItemStack fishStack = new ItemStack(ItemManager.Fish);
    	ItemStack gunpowderStack = new ItemStack(Items.gunpowder);
    	 
        //GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 64), Blocks.dirt);
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.FishBomb, 4), fishStack, fishStack, fishStack, fishStack, gunpowderStack);
    	
        //Shaped Recipes
 
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.Fishbowl, 1), " f ", "gwg", " g ", 'g', Blocks.glass, 'w', Items.water_bucket, 'f', ItemManager.Fish);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.FishAxe, 1), "ff ", "fs ", " s ", 'f', ItemManager.Fish, 's', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.FishHoe, 1), "ff ", " s ", " s ", 'f', ItemManager.Fish, 's', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.FishPickaxe, 1), "fff", " s ", " s ", 'f', ItemManager.Fish, 's', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.FishSpade, 1), " f ", " s ", " s ", 'f', ItemManager.Fish, 's', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.FishSword, 1), " f ", " f ", " s ", 'f', ItemManager.Fish, 's', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemManager.FishHammer, 1), "fff", "fsf", " s ", 'f', ItemManager.Fish, 's', Items.stick);
    	
    }//end addCraftingRecipes    
  
 
    public static void addSmeltingRecipes() {    
 
    }//end addSmeltingRecipes
 
}//end class