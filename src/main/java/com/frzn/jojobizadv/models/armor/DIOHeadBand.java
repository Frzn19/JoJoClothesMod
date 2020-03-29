package com.frzn.jojobizadv.models.armor;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;

/**
 * DIOHeadBand - OceanMan
 * Created using Tabula 7.0.1
 */
public class DIOHeadBand extends ModelBiped {
    public ModelRenderer HeadBand1;
    public ModelRenderer Headband2;

    public DIOHeadBand(float modelSize) {
        this.textureWidth = 516;
        this.textureHeight = 256;
        this.Headband2 = new ModelRenderer(this, 30, 18);
        this.Headband2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Headband2.addBox(-1.0F, -7.5F, -4.6F, 2, 2, 1, modelSize);
        this.HeadBand1 = new ModelRenderer(this, 28, 13);
        this.HeadBand1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadBand1.addBox(-4.5F, -7.0F, -4.5F, 9, 1, 9, modelSize);
        this.HeadBand1.addChild(this.Headband2);

        this.bipedHead.addChild(HeadBand1);
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
