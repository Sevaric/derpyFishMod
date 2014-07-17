package com.df.item;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.df.creativetabs.CreativeTabsManager;
import com.df.lib.StringLibrary;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemManager {

    public static void mainRegistry() {
        initializeItem();
        registerItem();
    }

    public static Item FishHammer;
    public static Item FishBomb;
    public static Item Fishbowl;
    public static Item Fish;
    public static Item FishPickaxe;
    public static Item FishAxe;
    public static Item FishHoe;
    public static Item FishSpade;
    public static Item FishSword;
    public static ToolMaterial FishFossil = EnumHelper.addToolMaterial("Fish",
            0, 40, 2.0F, 0.0F, 0);
    ;

    public static void initializeItem() {
        Fishbowl = new Fishbowl();
        Fish = new Fish();
        FishAxe = new FishAxe(FishFossil).setUnlocalizedName("FishAxe")
                .setCreativeTab(CreativeTabsManager.tabFish)
                .setTextureName("df:fish_axe");
        ;
        FishPickaxe = new FishPickaxe(FishFossil)
                .setUnlocalizedName("FishPickaxe")
                .setCreativeTab(CreativeTabsManager.tabFish)
                .setTextureName("df:fish_pickaxe");
        ;
        FishHoe = new FishHoe(FishFossil).setUnlocalizedName("FishHoe")
                .setCreativeTab(CreativeTabsManager.tabFish)
                .setTextureName("df:fish_hoe");
        ;
        FishSpade = new FishSpade(FishFossil).setUnlocalizedName("FishSpade")
                .setCreativeTab(CreativeTabsManager.tabFish)
                .setTextureName("df:fish_spade");
        ;
        FishSword = new FishSword(FishFossil).setUnlocalizedName("FishSword")
                .setCreativeTab(CreativeTabsManager.tabFish)
                .setTextureName("df:fish_sword");
        ;
        FishHammer = new FishHammer()
                .setCreativeTab(CreativeTabsManager.tabFish)
                .setUnlocalizedName("FishHammer")
                .setTextureName(StringLibrary.MODID + ":fish_hammer");

        FishBomb = new FishBomb().setCreativeTab(CreativeTabsManager.tabFish)
                .setUnlocalizedName("FishBomb")
                .setTextureName(StringLibrary.MODID + ":fish_bomb");

    }

    public static void registerItem() {
        GameRegistry.registerItem(Fishbowl, Fishbowl.getUnlocalizedName());
        GameRegistry.registerItem(Fish, Fish.getUnlocalizedName());
        GameRegistry
                .registerItem(FishPickaxe, FishPickaxe.getUnlocalizedName());
        GameRegistry.registerItem(FishAxe, FishAxe.getUnlocalizedName());
        GameRegistry.registerItem(FishHoe, FishHoe.getUnlocalizedName());
        GameRegistry.registerItem(FishSpade, FishSpade.getUnlocalizedName());
        GameRegistry.registerItem(FishSword, FishSword.getUnlocalizedName());
        GameRegistry.registerItem(FishHammer, FishHammer.getUnlocalizedName());
        GameRegistry.registerItem(FishBomb, FishBomb.getUnlocalizedName());

    }
}
