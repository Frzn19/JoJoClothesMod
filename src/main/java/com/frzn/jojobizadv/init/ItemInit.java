package com.frzn.jojobizadv.init;

import com.frzn.jojobizadv.Main;
import com.frzn.jojobizadv.Reference;
import com.frzn.jojobizadv.items.*;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial ;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final ArmorMaterial JOTARO_CLOTHES_MATERIAL = EnumHelper.addArmorMaterial("jotaro_clothes", Reference.MODID + ":jotaro_clothes", 0, new int[]{1, 2, 2, 2}, 20, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f);
    public static final ArmorMaterial JOTARO_CLOTHES_4_MATERIAL = EnumHelper.addArmorMaterial("jotaro_clothes_4", Reference.MODID + ":jotaro_clothes_4", 0, new int[]{1, 2, 2, 1}, 20, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f);
    public static final ArmorMaterial JOTARO_CLOTHES_6_MATERIAL = EnumHelper.addArmorMaterial("jotaro_clothes_6", Reference.MODID + ":jotaro_clothes_6", 0, new int[]{1, 2, 2, 1}, 20, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f);
    public static final ArmorMaterial JOTARO_HAT_MATERIAL = EnumHelper.addArmorMaterial("jotaro_hat", Reference.MODID + ":jotaro_hat", 0, new int[]{1, 2, 2, 2}, 20, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f);
    public static final ArmorMaterial JOTARO_HAT_4_MATERIAL = EnumHelper.addArmorMaterial("jotaro_hat_4", Reference.MODID + ":jotaro_hat_4", 0, new int[]{1, 2, 2, 2}, 20, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f);
    public static final ArmorMaterial JOTARO_HAT_6_MATERIAL = EnumHelper.addArmorMaterial("jotaro_hat_6", Reference.MODID + ":jotaro_hat_6", 0, new int[]{1, 2, 2, 2}, 20, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f);
    public static final ArmorMaterial DIO_HEADBAND_MATERIAL = EnumHelper.addArmorMaterial("dio_headband", Reference.MODID + ":dio_headband", 0, new int[]{1, 2, 2, 1}, 20, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0f);
    public static final ArmorMaterial DIO_WIG_MATERIAL = EnumHelper.addArmorMaterial("dio_wig", Reference.MODID + ":dio_wig", 0, new int[]{1, 2, 2, 1}, 20, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0f);
    public static final ArmorMaterial DIO_CLOTHES_MATERIAL = EnumHelper.addArmorMaterial("dio_clothes", Reference.MODID + ":dio_clothes", 0, new int[]{1, 2, 2, 2}, 20, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f);

    public static final Item JOTARO_HAT = new JotaroHatArmor("jotaro_hat", Main.JOJO_TAB, JOTARO_HAT_MATERIAL, EntityEquipmentSlot.HEAD);
    public static final Item JOTARO_CHEST = new JotaroClothesArmor("jotaro_coat", Main.JOJO_TAB, JOTARO_CLOTHES_MATERIAL, EntityEquipmentSlot.CHEST);
    public static final Item JOTARO_TROUSERS = new JotaroClothesArmor("jotaro_trousers", Main.JOJO_TAB, JOTARO_CLOTHES_MATERIAL, EntityEquipmentSlot.LEGS);

    public static final Item JOTARO_HAT_4 = new JotaroHatArmor("jotaro_hat_4", Main.JOJO_TAB, JOTARO_HAT_4_MATERIAL, EntityEquipmentSlot.HEAD);
    public static final Item JOTARO_COAT_4 = new JotaroClothesArmor("jotaro_coat_4", Main.JOJO_TAB, JOTARO_CLOTHES_4_MATERIAL, EntityEquipmentSlot.CHEST);
    public static final Item JOTARO_TROUSERS_4 = new JotaroClothesArmor("jotaro_trousers_4", Main.JOJO_TAB, JOTARO_CLOTHES_4_MATERIAL, EntityEquipmentSlot.LEGS);

    public static final Item JOTARO_HAT_6 = new JotaroHatArmor("jotaro_hat_6", Main.JOJO_TAB, JOTARO_HAT_6_MATERIAL, EntityEquipmentSlot.HEAD);
    public static final Item JOTARO_COAT_6 = new JotaroClothesArmor("jotaro_coat_6", Main.JOJO_TAB, JOTARO_CLOTHES_6_MATERIAL, EntityEquipmentSlot.CHEST);
    public static final Item JOTARO_TROUSERS_6 = new JotaroClothesArmor("jotaro_trousers_6", Main.JOJO_TAB, JOTARO_CLOTHES_6_MATERIAL, EntityEquipmentSlot.LEGS);

    public static final Item DIO_HEADBAND = new DioHeadbandArmor("dio_headband", Main.JOJO_TAB, DIO_HEADBAND_MATERIAL, EntityEquipmentSlot.HEAD);
    public static final Item DIO_WIG = new DioHeadbandWigArmor("dio_wig", Main.JOJO_TAB, DIO_WIG_MATERIAL, EntityEquipmentSlot.HEAD);
    public static final Item DIO_CHEST = new DioClothesArmor("dio_chest", Main.JOJO_TAB, DIO_CLOTHES_MATERIAL, EntityEquipmentSlot.CHEST);
    public static final Item DIO_TROUSERS = new DioClothesArmor("dio_trousers", Main.JOJO_TAB, DIO_CLOTHES_MATERIAL, EntityEquipmentSlot.LEGS);

}
