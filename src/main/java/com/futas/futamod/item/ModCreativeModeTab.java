package com.futas.futamod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab FUTA_TAB = new CreativeModeTab("futatab") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SORETE.get());
        }
    };
}
