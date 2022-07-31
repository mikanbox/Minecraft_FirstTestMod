package com.example.examplemod.exampleitem;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExampleItem.MODID) // META-INF/mods.toml に記述した modId
public class ExampleItem {
    public static final String MODID = "exampleitem";

    public ExampleItem() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemClassInit.ITEMS.register(bus);
    }

}







