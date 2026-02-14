package com.swlo.energyprovider.util;

import com.swlo.energyprovider.EnergyProviderMod;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static final class Items {

        public static final TagKey<Block> CABLES = createTag("cables");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(Identifier.fromNamespaceAndPath(EnergyProviderMod.MOD_ID, name));
        }

    }

    public static final class Blocks {
        public static final TagKey<Item> TOOLS = createTag("tools");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(Identifier.fromNamespaceAndPath(EnergyProviderMod.MOD_ID, name));
        }
    }

}
