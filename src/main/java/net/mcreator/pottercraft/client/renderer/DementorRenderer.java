package net.mcreator.pottercraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.pottercraft.entity.DementorEntity;
import net.mcreator.pottercraft.client.model.animations.DementorAnimation;
import net.mcreator.pottercraft.client.model.ModelDementor;

import com.mojang.blaze3d.vertex.PoseStack;

public class DementorRenderer extends MobRenderer<DementorEntity, ModelDementor<DementorEntity>> {
	public DementorRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelDementor.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(DementorEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.5f, 1.5f, 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DementorEntity entity) {
		return ResourceLocation.parse("pottercraft:textures/entities/dementor.png");
	}

	private static final class AnimatedModel extends ModelDementor<DementorEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<DementorEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(DementorEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, DementorAnimation.idle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(DementorEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}