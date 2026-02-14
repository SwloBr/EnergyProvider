package com.swlo.energyprovider.block;

import com.swlo.energyprovider.EnergyProviderMod;
import com.swlo.energyprovider.item.ModItems;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(EnergyProviderMod.MOD_ID);

    public static final DeferredBlock<Block> CABLE_BLOCK = registerBlock(
            "cable",
            Block::new,
            () -> BlockBehaviour.Properties.of().strength(1.0f)
                    .requiresCorrectToolForDrops().sound(SoundType.COPPER_GOLEM_STATUE)
    );


    private static <T extends Block> DeferredBlock<T> registerBlock(
            String name,
            Function<BlockBehaviour.Properties, T> blockFactory,
            Supplier<BlockBehaviour.Properties> properties
    ) {
        DeferredBlock<T> deferredBlock = BLOCKS.registerBlock(name, blockFactory, properties);
        registerBlockItem(name, deferredBlock);
        return deferredBlock;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.registerSimpleBlockItem(name, block);
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
