package com.swlo.energyprovider.block;

import com.swlo.energyprovider.EnergyProviderMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(EnergyProviderMod.MOD_ID);

    public static final DeferredBlock<Block> CABLE = BLOCKS.registerSimpleBlock("cable");

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
