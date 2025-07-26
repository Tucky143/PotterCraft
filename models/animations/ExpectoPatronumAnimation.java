// Save this class in your mod and generate all required imports

/**
 * Made with Blockbench 4.12.5 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author Author
 */
public class ExpectoPatronumAnimation {
	public static final AnimationDefinition L3 = AnimationDefinition.Builder.withLength(1.0F).looping()
			.addAnimation("bone",
					new AnimationChannel(AnimationChannel.Targets.SCALE,
							new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.0F, KeyframeAnimations.scaleVec(5.0F, 5.0F, 5.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.build();

	public static final AnimationDefinition L2 = AnimationDefinition.Builder.withLength(1.0F).looping()
			.addAnimation("bone",
					new AnimationChannel(AnimationChannel.Targets.SCALE,
							new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.0F, KeyframeAnimations.scaleVec(3.5F, 3.5F, 3.5F),
									AnimationChannel.Interpolations.LINEAR)))
			.build();

	public static final AnimationDefinition L1 = AnimationDefinition.Builder.withLength(1.0F).looping()
			.addAnimation("bone",
					new AnimationChannel(AnimationChannel.Targets.SCALE,
							new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.0F, KeyframeAnimations.scaleVec(2.0F, 2.0F, 2.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.build();
}