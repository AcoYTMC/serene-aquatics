package acoyt.serene_aquatics.block;

import acoyt.serene_aquatics.SereneAquatics;
import acoyt.serene_aquatics.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block POLISHED_DARK_PRISMARINE = registerBlock("polished_dark_prismarine",
            new Block(FabricBlockSettings.copyOf(Blocks.DARK_PRISMARINE)), ModItemGroup.SERENE_AQUATICS);
    public static final Block POLISHED_PRISMARINE = registerBlock("polished_prismarine",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE)), ModItemGroup.SERENE_AQUATICS);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(SereneAquatics.Mod_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(SereneAquatics.Mod_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    public static void registerModBlocks () {
        SereneAquatics.LOGGER.debug("Registering ModBlocks for " + SereneAquatics.Mod_ID);
    }
}
