package com.ceejayy.myfirstmod.util;

import com.ceejayy.myfirstmod.MyFirstMod;
import com.ceejayy.myfirstmod.items.FireworkGunModel;
import com.ceejayy.myfirstmod.items.ItemModel;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    //Register
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MyFirstMod.MOD_ID);

    // Items
    public static final RegistryObject<Item> BEER = ITEMS.register("beer", ItemModel::new);

    public static final RegistryObject<Item> FIREWORKGUN = ITEMS.register("fireworkgun", FireworkGunModel::new);

    //Constructor / init
    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public RegistryHandler(){
    }
}
