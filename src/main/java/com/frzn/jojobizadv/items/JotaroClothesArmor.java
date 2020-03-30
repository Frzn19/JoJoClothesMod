package com.frzn.jojobizadv.items;

import com.frzn.jojobizadv.Main;
import com.frzn.jojobizadv.Reference;
import com.frzn.jojobizadv.init.ItemInit;
import com.frzn.jojobizadv.models.armor.JotaroClothes;
import com.frzn.jojobizadv.util.interfaces.IHasModel;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class JotaroClothesArmor extends ItemArmor implements IHasModel {

    public EntityPlayer player;

    public JotaroClothesArmor(String name, CreativeTabs tab, ArmorMaterial material, EntityEquipmentSlot equipmentSlot) {

        super(material, 1, equipmentSlot);

        setTranslationKey(Reference.MODID + "." + name);
        setRegistryName(name);
        setCreativeTab(tab);
        setMaxStackSize(1);

        ItemInit.ITEMS.add(this);

    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerModel(this, 0);
    }

    @Nullable
    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {

        if(itemStack != ItemStack.EMPTY){
            if(itemStack.getItem() instanceof JotaroClothesArmor){
               JotaroClothes model = new JotaroClothes(0.2f);

                model.bipedBody.showModel = armorSlot == EntityEquipmentSlot.CHEST;
                model.ArmL.showModel = armorSlot == EntityEquipmentSlot.CHEST;
                model.ArmR.showModel = armorSlot == EntityEquipmentSlot.CHEST;
                model.bipedLeftLeg.showModel = armorSlot == EntityEquipmentSlot.LEGS;
                model.bipedRightLeg.showModel = armorSlot == EntityEquipmentSlot.LEGS;

                model.isChild = _default.isChild;
                model.isRiding = _default.isRiding;
                model.isSneak = _default.isSneak;
                model.rightArmPose = _default.rightArmPose;
                model.leftArmPose = _default.leftArmPose;

                return model;
            }
        }

        return null;
    }
}
