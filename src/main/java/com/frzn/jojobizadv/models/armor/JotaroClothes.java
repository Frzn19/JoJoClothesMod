package com.frzn.jojobizadv.models.armor;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * CoolCoat - OceanMan
 * Created using Tabula 7.0.1
 */
public class JotaroClothes extends ModelBiped {
    public ModelRenderer Pants1;
    public ModelRenderer Body;
    public ModelRenderer ArmL;
    public ModelRenderer ArmR;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer Belt;
    public ModelRenderer Coat2;
    public ModelRenderer Coat5;
    public ModelRenderer Coat6;
    public ModelRenderer Collar1;
    public ModelRenderer Collar2;
    public ModelRenderer Coat7;
    public ModelRenderer Coat8;
    public ModelRenderer Shirt;
    public ModelRenderer Coat3;
    public ModelRenderer Coat4;
    public ModelRenderer Chain1;
    public ModelRenderer Chain2;
    public ModelRenderer Chain3;
    public ModelRenderer Chain4;
    public ModelRenderer Chain5;
    public ModelRenderer Chain6;
    public ModelRenderer Chain7;
    public ModelRenderer Chain8;
    public ModelRenderer shoulderL;
    public ModelRenderer shoulderR;

    public JotaroClothes(float modelSize) {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Coat8 = new ModelRenderer(this, 44, 40);
        this.Coat8.mirror = true;
        this.Coat8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Coat8.addBox(3.5F, -1.4F, -0.1F, 2, 12, 1, modelSize);
        this.setRotateAngle(Coat8, 0.0F, 0.7285004297824331F, 0.091106186954104F);
        this.shoulderR = new ModelRenderer(this, 0, 33);
        this.shoulderR.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.shoulderR.addBox(1.95F, -7.0F, -2.5F, 4, 4, 5, modelSize);
        this.Chain7 = new ModelRenderer(this, 31, 50);
        this.Chain7.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Chain7.addBox(1.9F, 5.6F, -0.9F, 1, 2, 2, modelSize);
        this.setRotateAngle(Chain7, -0.36425021489121656F, 0.6373942428283291F, 0.27314402793711257F);
        this.ArmL = new ModelRenderer(this, 40, 16);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(5.0F, 2.0F, -0.0F);
        this.ArmL.addBox(-6f, -4.0F, -2.0F, 4, 10, 4, modelSize);
        this.Chain6 = new ModelRenderer(this, 31, 50);
        this.Chain6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Chain6.addBox(3.6F, 1.2F, 4.6F, 1, 2, 2, modelSize);
        this.setRotateAngle(Chain6, -0.6373942428283291F, 2.231054382824351F, 0.18203784098300857F);
        this.LegR = new ModelRenderer(this, 0, 16);
        this.LegR.setRotationPoint(-1.9F, 12.0F, 0.1F);
        this.LegR.addBox(0.0F, -12.0F, -2.0F, 4, 10, 4, modelSize);
        this.Chain8 = new ModelRenderer(this, 31, 50);
        this.Chain8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Chain8.addBox(3.6F, 2.8F, 5.6F, 1, 2, 2, modelSize);
        this.setRotateAngle(Chain8, -0.6373942428283291F, 2.231054382824351F, 0.18203784098300857F);
        this.LegL = new ModelRenderer(this, 0, 16);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(1.9F, 12.0F, 0.1F);
        this.LegL.addBox(-3.9F, -12.0F, -2.0F, 4, 10, 4, modelSize);
        this.Chain5 = new ModelRenderer(this, 31, 50);
        this.Chain5.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Chain5.addBox(1.9F, 4.0F, -1.9F, 1, 2, 2, modelSize);
        this.setRotateAngle(Chain5, -0.36425021489121656F, 0.6373942428283291F, 0.27314402793711257F);
        this.Chain1 = new ModelRenderer(this, 31, 50);
        this.Chain1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Chain1.addBox(0.3F, 0.1F, -5.9F, 1, 2, 2, modelSize);
        this.setRotateAngle(Chain1, -0.091106186954104F, 0.091106186954104F, -0.9105382707654417F);
        this.Chain3 = new ModelRenderer(this, 31, 50);
        this.Chain3.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Chain3.addBox(2.8F, 1.0F, -2.2F, 1, 2, 2, modelSize);
        this.setRotateAngle(Chain3, -0.36425021489121656F, 0.6829473363053812F, 0.8196066167365371F);
        this.ArmR = new ModelRenderer(this, 40, 16);
        this.ArmR.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.ArmR.addBox(2f, -4.0F, -2.0F, 4, 10, 4, modelSize);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-4.5F, 0.0F, 1.5F, 9, 10, 1, modelSize);
        this.Coat6 = new ModelRenderer(this, 52, 0);
        this.Coat6.mirror = true;
        this.Coat6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Coat6.addBox(2.5F, 0.0F, -2.5F, 2, 11, 4, modelSize);
        this.Collar2 = new ModelRenderer(this, 0, 55);
        this.Collar2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Collar2.addBox(-4.5F, -2.0F, -1.1F, 9, 1, 5, modelSize);
        this.setRotateAngle(Collar2, -0.091106186954104F, 0.0F, 0.0F);
        this.Collar1 = new ModelRenderer(this, 0, 45);
        this.Collar1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Collar1.addBox(-4.5F, -1.6F, -1.3F, 9, 3, 5, modelSize);
        this.setRotateAngle(Collar1, -0.27314402793711257F, 0.0F, 0.0F);
        this.Shirt = new ModelRenderer(this, 16, 16);
        this.Shirt.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shirt.addBox(-4.0F, 0.0F, -2.0F, 8, 10, 4, modelSize);
        this.Pants1 = new ModelRenderer(this, 18, 42);
        this.Pants1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Pants1.addBox(-4.0F, 10.0F, -2.0F, 8, 2, 4, modelSize);
        this.Coat3 = new ModelRenderer(this, 49, 51);
        this.Coat3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Coat3.addBox(-4.5F, 10.0F, -3.4F, 1, 9, 4, modelSize);
        this.Coat5 = new ModelRenderer(this, 52, 0);
        this.Coat5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Coat5.addBox(-4.5F, 0.0F, -2.5F, 2, 11, 4, 0.0F);
        this.Coat2 = new ModelRenderer(this, 22, 0);
        this.Coat2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Coat2.addBox(-4.5F, 10.0F, 0.55F, 9, 9, 1, modelSize);
        this.setRotateAngle(Coat2, 0.091106186954104F, 0.0F, 0.0F);
        this.Coat4 = new ModelRenderer(this, 49, 51);
        this.Coat4.mirror = true;
        this.Coat4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Coat4.addBox(3.5F, 10.0F, -3.4F, 1, 9, 4, modelSize);
        this.Belt = new ModelRenderer(this, 16, 37);
        this.Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Belt.addBox(-4.0F, 10.3F, -2.1F, 8, 2, 4, modelSize);
        this.shoulderL = new ModelRenderer(this, 0, 33);
        this.shoulderL.mirror = true;
        this.shoulderL.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.shoulderL.addBox(-5.95F, -7.0F, -2.5F, 4, 4, 5, modelSize);
        this.Chain2 = new ModelRenderer(this, 31, 50);
        this.Chain2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Chain2.addBox(4.0F, -1.6F, 2.4F, 1, 2, 2, modelSize);
        this.setRotateAngle(Chain2, -0.36425021489121656F, 2.0488420089161434F, 0.8196066167365371F);
        this.Chain4 = new ModelRenderer(this, 31, 50);
        this.Chain4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Chain4.addBox(3.7F, -0.2F, 3.8F, 1, 2, 2, modelSize);
        this.setRotateAngle(Chain4, -0.36425021489121656F, 2.0488420089161434F, 0.8196066167365371F);
        this.Coat7 = new ModelRenderer(this, 44, 40);
        this.Coat7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Coat7.addBox(-5.5F, -1.4F, -0.1F, 2, 12, 1, modelSize);
        this.setRotateAngle(Coat7, 0.0F, -0.7285004297824331F, -0.091106186954104F);
        this.Body.addChild(this.Coat8);
        this.ArmR.addChild(this.shoulderR);
        this.Coat7.addChild(this.Chain7);
        this.Coat7.addChild(this.Chain6);
        this.Coat7.addChild(this.Chain8);
        this.Coat7.addChild(this.Chain5);
        this.Coat7.addChild(this.Chain1);
        this.Coat7.addChild(this.Chain3);
        this.Body.addChild(this.Coat6);
        this.Body.addChild(this.Collar2);
        this.Body.addChild(this.Collar1);
        this.Body.addChild(this.Shirt);
        this.Coat2.addChild(this.Coat3);
        this.Body.addChild(this.Coat5);
        this.Body.addChild(this.Coat2);
        this.Coat2.addChild(this.Coat4);
        this.Pants1.addChild(this.Belt);
        this.ArmL.addChild(this.shoulderL);
        this.Coat7.addChild(this.Chain2);
        this.Coat7.addChild(this.Chain4);
        this.Body.addChild(this.Coat7);

        this.bipedRightLeg.addChild(LegR);
        this.bipedLeftLeg.addChild(LegL);
        this.bipedRightArm.addChild(ArmR);
        this.bipedLeftArm.addChild(ArmL);
        this.bipedBody.addChild(Pants1);
        this.bipedBody.addChild(Body);

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
