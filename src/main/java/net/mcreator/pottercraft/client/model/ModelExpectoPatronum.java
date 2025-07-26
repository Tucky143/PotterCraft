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
public class ModelExpectoPatronum<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pottercraft", "model_expecto_patronum"), "main");
	public final ModelPart bone;

	public ModelExpectoPatronum(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(79, 37).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(41, 93).addBox(-4.0F, -2.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(79, 0)
						.addBox(-8.0F, -5.0F, -8.0F, 16.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(79, 20).addBox(-4.0F, -9.0F, -16.0F, 20.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 90)
						.addBox(4.0F, -9.0F, -4.0F, 12.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(73, 59).addBox(-16.0F, -9.0F, -16.0F, 12.0F, 4.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(73, 42)
						.addBox(-16.0F, -9.0F, 4.0F, 32.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(15.0F, -14.0F, -18.0F, 3.0F, 5.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(0, 81)
						.addBox(-18.0F, -14.0F, -18.0F, 33.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(73, 84).addBox(-15.0F, -14.0F, 15.0F, 30.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-18.0F, -14.0F, -15.0F, 3.0F, 5.0F, 33.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}