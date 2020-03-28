package com.frzn.jojobizadv.util.handlers;

import com.frzn.jojobizadv.init.ItemInit;
import com.frzn.jojobizadv.util.interfaces.IHasModel;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }


    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event)
    {

        for(Item item : ItemInit.ITEMS)
        {
            if(item instanceof IHasModel)
            {
                ((IHasModel)item).registerModels();
            }
        }

    }

    public static void preInitRegistries(FMLPreInitializationEvent event)
    {
    }

    public static void initRegistries(FMLInitializationEvent event)
    {
    }

    public static void postInitRegistries(FMLPostInitializationEvent event)
    {
    }

    public static void serverRegistries(FMLServerStartingEvent event)
    {
    }

}
