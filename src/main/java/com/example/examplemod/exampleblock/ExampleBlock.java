package com.example.examplemod.exampleblock;

import com.example.examplemod.exampleitem.ItemClassInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExampleBlock.MODID) // META-INF/mods.toml に記述した modId
public class ExampleBlock {
    public static final String MODID = "exampleblock";

    public ExampleBlock() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BlockClassInit.BLOCKS.register(bus);
        BlockClassInit.ITEMS.register(bus);
    }
}
