package com.swlo.energyprovider.item;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jspecify.annotations.NonNull;

public class WrenchItem extends Item {
    public WrenchItem(Properties properties) {
		super(properties);
    }

    @Override
    public @NonNull InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickededBlock = level.getBlockState(context.getClickedPos()).getBlock();

        context.getPlayer().displayClientMessage(Component.literal("Olá"), true);

        return super.useOn(context);
    }
}
