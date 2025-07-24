package net.mcreator.pottercraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class DementorEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, DamageSource damagesource, Entity entity, Entity sourceentity) {
		if (damagesource == null || entity == null || sourceentity == null)
			return;
		if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("pottercraft:expecto_patronum")))) {
			entity.push((sourceentity.getLookAngle().x * 25), (sourceentity.getLookAngle().y * 25), (sourceentity.getLookAngle().z * 25));
			entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.MAGIC)), 10);
		}
	}
}