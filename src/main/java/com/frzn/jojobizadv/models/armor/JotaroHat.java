package com.frzn.jojobizadv.models.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.Entity;

/**
 * CoolHat - OceanMan
 * Created using Tabula 7.0.1
 */
public class JotaroHat extends ModelBiped {
    public ModelRenderer Hat;
    public ModelRenderer Brim;
    public ModelRenderer Brim2;
    public ModelRenderer Decoration1;
    public ModelRenderer Decoration2;

    public JotaroHat() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Brim2 = new ModelRenderer(this, 32, 10);
        this.Brim2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Brim2.addBox(-5.0F, -5.8F, -5.1F, 10, 1, 5, 0.0F);
        this.setRotateAngle(Brim2, 0.091106186954104F, 0.0F, 0.0F);
        this.Decoration1 = new ModelRenderer(this, 32, 4);
        this.Decoration1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Decoration1.addBox(-1.0F, -7.2F, -4.7F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Decoration1, 0.18203784098300857F, 0.0F, 0.0F);
        this.Brim = new ModelRenderer(this, 0, 17);
        this.Brim.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Brim.addBox(-4.5F, -5.6F, -8.4F, 9, 1, 9, 0.0F);
        this.setRotateAngle(Brim, 0.18203784098300857F, 0.0F, 0.0F);
        this.Hat = new ModelRenderer(this, 32, 0);
        this.Hat.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hat.addBox(-4.5F, -8.3F, -5.5F, 9, 3, 7, 0.0F);
        this.setRotateAngle(Hat, -0.18203784098300857F, 0.0F, 0.0F);
        this.Decoration2 = new ModelRenderer(this, 32, 0);
        this.Decoration2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Decoration2.addBox(0.9F, -8.2F, -4.5F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Decoration2, 0.18203784098300857F, 0.0F, 0.0F);
        this.Hat.addChild(this.Brim2);
        this.Hat.addChild(this.Decoration1);
        this.Hat.addChild(this.Brim);
        this.Hat.addChild(this.Decoration2);

        this.bipedHead.addChild(Hat);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);

        if (entity instanceof EntityArmorStand) {
            // Hack so helmets look right on armor stand
            f4 = 0;
        }
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
