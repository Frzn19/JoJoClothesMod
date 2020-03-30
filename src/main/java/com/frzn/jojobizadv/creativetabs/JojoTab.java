package com.frzn.jojobizadv.creativetabs;

import com.frzn.jojobizadv.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class JojoTab extends CreativeTabs {

    public JojoTab()
    {
        super("jojo");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemInit.JOTARO_HAT);
    }
}
