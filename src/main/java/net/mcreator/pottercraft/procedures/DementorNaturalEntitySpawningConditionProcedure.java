package net.mcreator.pottercraft.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

public class DementorNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean Condition1 = false;
		boolean Condition2 = false;
		boolean Condition3 = false;
		boolean Condition4 = false;
		boolean Condition5 = false;
		Condition1 = world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) <= 5;
		Condition2 = !(world instanceof Level _lvl1 && _lvl1.isDay());
		Condition3 = world.getLevelData().isThundering() || world.getLevelData().isRaining();
		Condition4 = world.isEmptyBlock(BlockPos.containing(x, y, z));
		Condition5 = !world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(450 / 2d), e -> true).isEmpty();
		return true == (Condition1 && Condition2 && Condition3 && Condition4 && Condition5 && true);
	}
}