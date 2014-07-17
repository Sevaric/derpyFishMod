package com.sevaric.df.entity;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import com.sevaric.df.main.MainRegistry;

import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityManager {

	public static void mainRegistry() {
		registerEntity();
		spawnEntity();
	}

	public static void addSpawn(Class entityClass, int probability, int min,
			int max, EnumCreatureType type) {
		for (int i = 0; i < BiomeGenBase.getBiomeGenArray().length; i++) {
			if (BiomeGenBase.getBiomeGenArray()[i] != null) {
				EntityRegistry.addSpawn(entityClass, probability, min, max,
						type, BiomeGenBase.getBiomeGenArray()[i]);
			}
		}
	}

	public static void spawnEntity() {
		addSpawn(FishPassive.class, 20, 1, 5, EnumCreatureType.waterCreature);
	}

	public static void registerEntity() {
		createEntity(FishPassive.class, "FishMob", 0xF2B022, 0xF5F50C);
		createEntity(EntityFBomb.class, "FishBomb");
	}

	public static void createEntity(Class entityClass, String entityName,
			int solidColor, int spotColor) {
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry
				.registerGlobalEntityID(entityClass, entityName, entityId);
		EntityList.entityEggs.put(Integer.valueOf(entityId),
				new EntityList.EntityEggInfo(entityId, solidColor, spotColor));
	}

	public static void createEntity(Class entityClass, String entityName) {
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerModEntity(entityClass, entityName, entityId,
				MainRegistry.modInstance, 64, 1, true);
	}

}
