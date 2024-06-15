package acoyt.serene_aquatics.item;

import acoyt.serene_aquatics.SereneAquatics;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.TridentItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item PRISMARINE_SWORD = registerItem("prismarine_sword",
            new Item(new FabricItemSettings().maxDamage(1600).rarity(Rarity.EPIC).group(ModItemGroup.SERENE_AQUATICS).fireproof()));
    public static final Item TRIDENT_TEST = registerItem("trident_test",
            new TridentItem(new FabricItemSettings().maxDamage(512).rarity(Rarity.RARE).group(ModItemGroup.SERENE_AQUATICS).fireproof()));
    public static final Item CORAL_BOW = registerItem("coral_bow",
            new BowItem(new FabricItemSettings().maxDamage(512).rarity(Rarity.RARE).group(ModItemGroup.SERENE_AQUATICS)));
    public static final Item PRISMARINE_KEY = registerItem("prismarine_key",
            new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.RARE).group(ModItemGroup.SERENE_AQUATICS)));
    public static final Item ENCHANTED_HEART_OF_THE_SEA = registerItem("enchanted_heart_of_the_sea",
            new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC).group(ModItemGroup.SERENE_AQUATICS).fireproof()));
    public static final  Item RED_HEART_OF_THE_SEA = registerItem("red_heart_of_the_sea",
            new Item(new FabricItemSettings().group(ModItemGroup.SERENE_AQUATICS).rarity(Rarity.EPIC)));
    public static final  Item DARK_PRISMARINE_HANDLE = registerItem("dark_prismarine_handle",
            new Item(new FabricItemSettings().group(ModItemGroup.SERENE_AQUATICS)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SereneAquatics.Mod_ID, name), item);
    }


    public static void registerModItems() {
        SereneAquatics.LOGGER.debug("Registering Mod Items for " + SereneAquatics.Mod_ID);
    }
}
