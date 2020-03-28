package com.frzn.jojobizadv.models.armor;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.item.EntityArmorStand;
import org.lwjgl.opengl.GL11;

/**
 * DIOCoat - OceanMan
 * Created using Tabula 7.0.1
 */
public class DIOClothes extends ModelBiped {
    public ModelRenderer Pants1;
    public ModelRenderer Body;
    public ModelRenderer ArmL;
    public ModelRenderer ArmR;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer Belt;
    public ModelRenderer KneeL;
    public ModelRenderer Coat5;
    public ModelRenderer Coat6;
    public ModelRenderer Collar2;
    public ModelRenderer Coat7;
    public ModelRenderer Coat8;
    public ModelRenderer Shirt;
    public ModelRenderer shoulderL;
    public ModelRenderer shoulderR;
    public ModelRenderer KneeR;
    public ModelRenderer KneeL_1;

    public DIOClothes(float modelSize) {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Pants1 = new ModelRenderer(this, 16, 30);
        this.Pants1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Pants1.addBox(-4.0F, 9.9F, -2.0F, 8, 2, 4, modelSize);
        this.LegL = new ModelRenderer(this, 0, 16);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(1.9F, 12.0F, 0.1F);
        this.LegL.addBox(-3.9F, -12.0F, -2.0F, 4, 10, 4, modelSize);
        this.KneeL_1 = new ModelRenderer(this, 0, 11);
        this.KneeL_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.KneeL_1.addBox(-3.0F, -7.5F, -2.5F, 2, 2, 1, modelSize);
        this.ArmL = new ModelRenderer(this, 40, 16);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(5.0F, 2.0F, -0.0F);
        this.ArmL.addBox(-6.0F, -4.0F, -2.0F, 4, 10, 4, modelSize);
        this.Coat7 = new ModelRenderer(this, 44, 39);
        this.Coat7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Coat7.addBox(-3.9F, -0.9F, -2.5F, 2, 8, 1, modelSize);
        this.setRotateAngle(Coat7, 0.0F, 0.0F, 0.091106186954104F);
        this.Coat6 = new ModelRenderer(this, 44, 0);
        this.Coat6.mirror = true;
        this.Coat6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Coat6.addBox(2.5F, -1.1F, -2.5F, 2, 8, 4, modelSize);
        this.Belt = new ModelRenderer(this, 16, 37);
        this.Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Belt.addBox(-4.0F, 9.1F, -2.5F, 8, 1, 5, modelSize);
        this.KneeL = new ModelRenderer(this, 0, 11);
        this.KneeL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.KneeL.addBox(-1.0F, 8.6F, -2.7F, 2, 2, 1, modelSize);
        this.Collar2 = new ModelRenderer(this, 0, 54);
        this.Collar2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Collar2.addBox(-4.5F, -1.2F, -1.9F, 9, 2, 5, modelSize);
        this.ArmR = new ModelRenderer(this, 40, 16);
        this.ArmR.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.ArmR.addBox(2.0F, -4.0F, -2.0F, 4, 10, 4, modelSize);
        this.shoulderR = new ModelRenderer(this, 46, 30);
        this.shoulderR.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.shoulderR.addBox(1.95F, -7.0F, -2.5F, 4, 4, 5, modelSize);
        this.KneeR = new ModelRenderer(this, 0, 11);
        this.KneeR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.KneeR.addBox(1.0F, -7.5F, -2.5F, 2, 2, 1, modelSize);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-4.5F, 0.0F, 1.5F, 9, 7, 1, modelSize);
        this.Coat5 = new ModelRenderer(this, 44, 0);
        this.Coat5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Coat5.addBox(-4.5F, -1.1F, -2.5F, 2, 8, 4, modelSize);
        this.LegR = new ModelRenderer(this, 0, 16);
        this.LegR.setRotationPoint(-1.9F, 12.0F, 0.1F);
        this.LegR.addBox(0.0F, -12.0F, -2.0F, 4, 10, 4, modelSize);
        this.shoulderL = new ModelRenderer(this, 46, 30);
        this.shoulderL.mirror = true;
        this.shoulderL.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.shoulderL.addBox(-5.95F, -7.0F, -2.5F, 4, 4, 5, modelSize);
        this.Coat8 = new ModelRenderer(this, 44, 39);
        this.Coat8.mirror = true;
        this.Coat8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Coat8.addBox(1.9F, -0.9F, -2.5F, 2, 8, 1, modelSize);
        this.setRotateAngle(Coat8, 0.0F, 0.0F, -0.091106186954104F);
        this.Shirt = new ModelRenderer(this, 16, 16);
        this.Shirt.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shirt.addBox(-4.0F, 0.0F, -2.0F, 8, 10, 4, modelSize);

        this.LegL.addChild(this.KneeL_1);
        this.Body.addChild(this.Coat7);
        this.Body.addChild(this.Coat6);
        this.Pants1.addChild(this.Belt);
        this.Pants1.addChild(this.KneeL);
        this.Body.addChild(this.Collar2);
        this.ArmR.addChild(this.shoulderR);
        this.LegR.addChild(this.KneeR);
        this.Body.addChild(this.Coat5);
        this.ArmL.addChild(this.shoulderL);
        this.Body.addChild(this.Coat8);
        this.Body.addChild(this.Shirt);

        this.bipedBody.addChild(Body);
        this.bipedBody.addChild(Pants1);
        this.bipedRightArm.addChild(ArmR);
        this.bipedLeftArm.addChild(ArmL);
        this.bipedRightLeg.addChild(LegR);
        this.bipedLeftLeg.addChild(LegL);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

        super.render(entity, f, f1, f2, f3, f4, f5);

    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
