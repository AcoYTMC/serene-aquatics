package acoyt.serene_aquatics.item;

import acoyt.serene_aquatics.SereneAquatics;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup SERENE_AQUATICS = FabricItemGroupBuilder.build(
            new Identifier(SereneAquatics.Mod_ID, "serene_aquatics"),
            () -> new ItemStack(ModItems.PRISMARINE_KEY));
}
