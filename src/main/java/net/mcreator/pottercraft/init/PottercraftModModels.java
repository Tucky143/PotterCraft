/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pottercraft.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.pottercraft.client.model.ModelExpectoPatronum;
import net.mcreator.pottercraft.client.model.ModelDementor;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PottercraftModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelExpectoPatronum.LAYER_LOCATION, ModelExpectoPatronum::createBodyLayer);
		event.registerLayerDefinition(ModelDementor.LAYER_LOCATION, ModelDementor::createBodyLayer);
	}
}