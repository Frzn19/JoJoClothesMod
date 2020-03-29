package com.frzn.jojobizadv.models.armor;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;

/**
 * DIOWig - OceanMan
 * Created using Tabula 7.0.1
 */
public class DIOWig extends ModelBiped {
    public ModelRenderer Head;
    public ModelRenderer Hair1;
    public ModelRenderer Hair2;
    public ModelRenderer Hair3;
    public ModelRenderer Hair4;
    public ModelRenderer Hair5;
    public ModelRenderer Hair6;
    public ModelRenderer Hair7;
    public ModelRenderer Hair8;
    public ModelRenderer Hair9;
    public ModelRenderer Hair10;
    public ModelRenderer Hair11;
    public ModelRenderer Hair12;
    public ModelRenderer Hair13;
    public ModelRenderer Hair14;
    public ModelRenderer Hair15;
    public ModelRenderer Hair16;
    public ModelRenderer Hair17;
    public ModelRenderer Hair22;
    public ModelRenderer Hair19;
    public ModelRenderer Hair20;
    public ModelRenderer Hair21;
    public ModelRenderer Hair18;
    public ModelRenderer HeadBand1;
    public ModelRenderer Headband2;

    public DIOWig(float modelSize) {
        this.textureWidth = 516;
        this.textureHeight = 256;
        this.Hair15 = new ModelRenderer(this, 33, 0);
        this.Hair15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair15.addBox(0.2F, -10.5F, -4.3F, 2, 4, 2, modelSize);
        this.setRotateAngle(Hair15, -0.36425021489121656F, 0.0F, 0.22514747350726852F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, modelSize);
        this.Hair4 = new ModelRenderer(this, 10, 0);
        this.Hair4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair4.addBox(1.6F, -8.2F, -4.9F, 1, 3, 1, modelSize);
        this.setRotateAngle(Hair4, 0.0F, 0.0F, 0.22759093446006054F);
        this.Headband2 = new ModelRenderer(this, 30, 18);
        this.Headband2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Headband2.addBox(-1.0F, -7.5F, -4.6F, 2, 2, 1, modelSize);
        this.Hair6 = new ModelRenderer(this, 10, 0);
        this.Hair6.setRotationPoint(0.0F, 0.0F, 0.1F);
        this.Hair6.addBox(4.0F, -7.5F, -2.9F, 1, 3, 1, modelSize);
        this.Hair7 = new ModelRenderer(this, 10, 0);
        this.Hair7.setRotationPoint(0.0F, 0.0F, 0.1F);
        this.Hair7.addBox(-5.0F, -7.5F, -1.0F, 1, 3, 1, modelSize);
        this.HeadBand1 = new ModelRenderer(this, 28, 13);
        this.HeadBand1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadBand1.addBox(-4.5F, -7.0F, -4.5F, 9, 1, 9, modelSize);
        this.Hair19 = new ModelRenderer(this, 33, 0);
        this.Hair19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair19.addBox(1.0F, 0.0F, 2.6F, 1, 4, 2, modelSize);
        this.setRotateAngle(Hair19, 0.40980330836826856F, 0.27314402793711257F, 0.0F);
        this.Hair21 = new ModelRenderer(this, 33, 0);
        this.Hair21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair21.addBox(-3.7F, -0.9F, 1.0F, 1, 4, 2, modelSize);
        this.setRotateAngle(Hair21, 0.40980330836826856F, -0.27314402793711257F, 0.0F);
        this.Hair5 = new ModelRenderer(this, 10, 0);
        this.Hair5.setRotationPoint(0.0F, 0.0F, 0.1F);
        this.Hair5.addBox(-5.0F, -7.5F, -2.9F, 1, 3, 1, modelSize);
        this.Hair3 = new ModelRenderer(this, 10, 0);
        this.Hair3.setRotationPoint(0.0F, 0.0F, 0.1F);
        this.Hair3.addBox(-2.6F, -8.2F, -4.9F, 1, 3, 1, modelSize);
        this.setRotateAngle(Hair3, 0.0F, 0.0F, -0.22759093446006054F);
        this.Hair11 = new ModelRenderer(this, 33, 0);
        this.Hair11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair11.addBox(-1.0F, -9.6F, -5.9F, 2, 4, 2, modelSize);
        this.setRotateAngle(Hair11, -0.27314402793711257F, 0.0F, 0.0F);
        this.Hair13 = new ModelRenderer(this, 33, 0);
        this.Hair13.setRotationPoint(0.0F, 0.0F, modelSize);
        this.Hair13.addBox(0.2F, -9.6F, -5.9F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Hair13, -0.27314402793711257F, 0.0F, 0.22514747350726852F);
        this.Hair12 = new ModelRenderer(this, 33, 0);
        this.Hair12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair12.addBox(-2.2F, -9.6F, -5.9F, 2, 4, 2, modelSize);
        this.setRotateAngle(Hair12, -0.27314402793711257F, 0.0F, -0.22514747350726852F);
        this.Hair16 = new ModelRenderer(this, 33, 0);
        this.Hair16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair16.addBox(-2.2F, -10.5F, -2.2F, 2, 4, 2, modelSize);
        this.setRotateAngle(Hair16, -0.40980330836826856F, 0.0F, -0.22514747350726852F);
        this.Hair2 = new ModelRenderer(this, 10, 0);
        this.Hair2.setRotationPoint(0.0F, 0.0F, 0.1F);
        this.Hair2.addBox(-0.6F, -8.2F, -4.9F, 1, 4, 1, modelSize);
        this.setRotateAngle(Hair2, 0.0F, 0.0F, -0.22759093446006054F);
        this.Hair17 = new ModelRenderer(this, 33, 0);
        this.Hair17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair17.addBox(0.2F, -10.5F, -2.2F, 2, 4, 2, modelSize);
        this.setRotateAngle(Hair17, -0.40980330836826856F, 0.0F, 0.22514747350726852F);
        this.Hair10 = new ModelRenderer(this, 33, 0);
        this.Hair10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair10.addBox(-1.0F, -10.5F, -4.3F, 2, 4, 2, modelSize);
        this.setRotateAngle(Hair10, -0.36425021489121656F, 0.0F, 0.0F);
        this.Hair9 = new ModelRenderer(this, 33, 0);
        this.Hair9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair9.addBox(-1.0F, -10.5F, -2.2F, 2, 4, 2, modelSize);
        this.setRotateAngle(Hair9, -0.40980330836826856F, 0.0F, 0.0F);
        this.Hair22 = new ModelRenderer(this, 33, 0);
        this.Hair22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair22.addBox(-2.0F, 0.0F, 2.6F, 1, 4, 2, modelSize);
        this.setRotateAngle(Hair22, 0.40980330836826856F, -0.27314402793711257F, 0.0F);
        this.Hair8 = new ModelRenderer(this, 10, 0);
        this.Hair8.setRotationPoint(0.0F, 0.0F, 0.1F);
        this.Hair8.addBox(4.0F, -7.5F, -1.0F, 1, 3, 1, modelSize);
        this.Hair20 = new ModelRenderer(this, 33, 0);
        this.Hair20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair20.addBox(2.7F, -0.9F, 1.0F, 1, 4, 2, modelSize);
        this.setRotateAngle(Hair20, 0.40980330836826856F, 0.27314402793711257F, 0.0F);
        this.Hair18 = new ModelRenderer(this, 33, 0);
        this.Hair18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair18.addBox(-0.5F, 0.0F, 2.2F, 1, 4, 2, modelSize);
        this.setRotateAngle(Hair18, 0.40980330836826856F, 0.0F, 0.0F);
        this.Hair14 = new ModelRenderer(this, 33, 0);
        this.Hair14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair14.addBox(-2.2F, -10.5F, -4.3F, 2, 4, 2, modelSize);
        this.setRotateAngle(Hair14, -0.36425021489121656F, 0.0F, -0.22514747350726852F);
        this.Hair1 = new ModelRenderer(this, 10, 0);
        this.Hair1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair1.addBox(-0.6F, -8.2F, -4.9F, 1, 4, 1, modelSize);
        this.setRotateAngle(Hair1, 0.0F, 0.0F, 0.22759093446006054F);
        this.Head.addChild(this.Hair15);
        this.Head.addChild(this.Hair4);
        this.HeadBand1.addChild(this.Headband2);
        this.Head.addChild(this.Hair6);
        this.Head.addChild(this.Hair7);
        this.Head.addChild(this.HeadBand1);
        this.Head.addChild(this.Hair19);
        this.Head.addChild(this.Hair21);
        this.Head.addChild(this.Hair5);
        this.Head.addChild(this.Hair3);
        this.Head.addChild(this.Hair11);
        this.Head.addChild(this.Hair13);
        this.Head.addChild(this.Hair12);
        this.Head.addChild(this.Hair16);
        this.Head.addChild(this.Hair2);
        this.Head.addChild(this.Hair17);
        this.Head.addChild(this.Hair10);
        this.Head.addChild(this.Hair9);
        this.Head.addChild(this.Hair22);
        this.Head.addChild(this.Hair8);
        this.Head.addChild(this.Hair20);
        this.Head.addChild(this.Hair18);
        this.Head.addChild(this.Hair14);
        this.Head.addChild(this.Hair1);

        this.bipedHead.addChild(Head);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        if (entity instanceof EntityArmorStand) {
            f3 = 0;
        }
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
