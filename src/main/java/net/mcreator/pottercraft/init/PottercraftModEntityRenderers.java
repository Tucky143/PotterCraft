/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pottercraft.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.pottercraft.client.renderer.ExpectoPatronumProjectileRenderer;
import net.mcreator.pottercraft.client.renderer.DementorRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PottercraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PottercraftModEntities.DEMENTOR.get(), DementorRenderer::new);
		event.registerEntityRenderer(PottercraftModEntities.EXPECTO_PATRONUM_PROJECTILE.get(), ExpectoPatronumProjectileRenderer::new);
	}
}