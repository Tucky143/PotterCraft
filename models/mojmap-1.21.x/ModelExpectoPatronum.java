// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelExpectoPatronum<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "expectopatronum"), "main");
	private final ModelPart bone;

	public ModelExpectoPatronum(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(79, 37)
						.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(41, 93)
						.addBox(-4.0F, -2.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(79, 0)
						.addBox(-8.0F, -5.0F, -8.0F, 16.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(79, 20)
						.addBox(-4.0F, -9.0F, -16.0F, 20.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 90)
						.addBox(4.0F, -9.0F, -4.0F, 12.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(73, 59)
						.addBox(-16.0F, -9.0F, -16.0F, 12.0F, 4.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(73, 42)
						.addBox(-16.0F, -9.0F, 4.0F, 32.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(15.0F, -14.0F, -18.0F, 3.0F, 5.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(0, 81)
						.addBox(-18.0F, -14.0F, -18.0F, 33.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(73, 84)
						.addBox(-15.0F, -14.0F, 15.0F, 30.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-18.0F, -14.0F, -15.0F, 3.0F, 5.0F, 33.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}