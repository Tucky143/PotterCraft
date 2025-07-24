/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pottercraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.pottercraft.PottercraftMod;

public class PottercraftModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(PottercraftMod.MODID);
	public static final DeferredItem<Item> DEMENTOR_SPAWN_EGG = REGISTRY.register("dementor_spawn_egg", () -> new DeferredSpawnEggItem(PottercraftModEntities.DEMENTOR, -16777216, -16053493, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}