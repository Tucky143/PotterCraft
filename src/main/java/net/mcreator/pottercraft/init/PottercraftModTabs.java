/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pottercraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.pottercraft.PottercraftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class PottercraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PottercraftMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> POTTER_CRAFT_TAB = REGISTRY.register("potter_craft_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.pottercraft.potter_craft_tab")).icon(() -> new ItemStack(PottercraftModItems.OAK_WAND.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PottercraftModItems.OAK_WAND.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(PottercraftModItems.DEMENTOR_SPAWN_EGG.get());
		}
	}
}