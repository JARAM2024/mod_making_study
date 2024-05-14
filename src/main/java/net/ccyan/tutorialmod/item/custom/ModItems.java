package net.ccyan.tutorialmod.item.custom;

import net.ccyan.tutorialmod.TutorialMod;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = Items.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = Items.register("raw_sapphire",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> SAPPHIRE_SWORD = Items.register("sapphire_sword",
            () -> new SwordItem(ModToolTiers.SAPPHIRE, 4,2, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = Items.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SAPPHIRE, 1,1, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_AXE = Items.register("sapphire_axe",
            () -> new AxeItem(ModToolTiers.SAPPHIRE, 7,1, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = Items.register("sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.SAPPHIRE, 0,0, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_HOE = Items.register("sapphire_hoe",
            () -> new HoeItem(ModToolTiers.SAPPHIRE, 0,0, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        Items.register(eventBus);
    }
}
