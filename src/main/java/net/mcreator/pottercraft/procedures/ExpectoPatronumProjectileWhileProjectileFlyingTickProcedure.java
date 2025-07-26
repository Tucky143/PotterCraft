package net.mcreator.pottercraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.pottercraft.PottercraftMod;

public class ExpectoPatronumProjectileWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		PottercraftMod.queueServerWork(200, () -> {
			if (entity != null) {
				if (!entity.level().isClientSide())
					entity.discard();
			}
		});
	}
}