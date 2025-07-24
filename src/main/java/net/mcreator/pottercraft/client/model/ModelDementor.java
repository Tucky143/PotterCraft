package net.mcreator.pottercraft.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelDementor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pottercraft", "model_dementor"), "main");
	public final ModelPart bone2;
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart left_arm;
	public final ModelPart right_arm;
	public final ModelPart bone;

	public ModelDementor(ModelPart root) {
		this.bone2 = root.getChild("bone2");
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(52, 15).mirror()
						.addBox(-1.0F, 10.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.0F, 7.0F, 0.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(53, 15).addBox(-1.0F, 10.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 16).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 7.0F, 0.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(43, 0).addBox(-4.5F, -1.0F, -6.5F, 9.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(43, 0).addBox(2.0F, 23.0F, -8.5F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(43, 0)
						.addBox(-1.5F, 23.0F, -8.5F, 3.5F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(43, 0).addBox(-4.5F, 23.0F, -8.5F, 1.5F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 0)
						.addBox(3.0F, 20.0F, -8.5F, 1.5F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 0).addBox(0.5F, 20.0F, -8.5F, 2.5F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 0)
						.addBox(-2.0F, 20.0F, -8.5F, 2.5F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 0).addBox(-4.5F, 22.0F, -8.5F, 2.5F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 0)
						.addBox(-4.5F, 20.0F, -8.5F, 2.5F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 0).addBox(-4.5F, 8.0F, -8.5F, 9.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(33, 1)
						.addBox(-4.5F, -1.0F, -16.0F, 9.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, 10.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(42, 0).addBox(-6.0F, -11.0F, -0.5F, 10.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 10.0F, -12.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(42, 0).addBox(-6.0F, -11.0F, -1.5F, 10.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 0).addBox(-4.0F, -3.0F, -1.5F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
						.addBox(2.0F, -3.0F, -1.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 0).addBox(4.0F, -3.0F, -1.5F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 10.0F, -12.0F, 0.0F, 1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}