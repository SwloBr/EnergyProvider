package com.swlo.energyprovider.item;

import com.swlo.energyprovider.EnergyProviderMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EnergyProviderMod.MOD_ID);

    public static final DeferredItem<Item> WRENCH = ITEMS.registerItem(
            "wrench",
            WrenchItem::new,
            () -> new Item.Properties().durability(32)
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
