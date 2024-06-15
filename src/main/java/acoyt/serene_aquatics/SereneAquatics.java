package acoyt.serene_aquatics;

import acoyt.serene_aquatics.block.ModBlocks;
import acoyt.serene_aquatics.item.ModItems;
import acoyt.serene_aquatics.util.PrismarineKeyBuriedTreasureLootTableModifiers;
import acoyt.serene_aquatics.util.RedHeartOfTheSeaLootTableModifiers;
import acoyt.serene_aquatics.util.PrismarineKeyShipwreckTreasureLootTableModifiers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SereneAquatics implements ModInitializer {
	public static final String Mod_ID = "serene_aquatics";
	public static final Logger LOGGER = LoggerFactory.getLogger(Mod_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

        RedHeartOfTheSeaLootTableModifiers.modifyLootTables();
		PrismarineKeyShipwreckTreasureLootTableModifiers.modifyLootTables();
		PrismarineKeyBuriedTreasureLootTableModifiers.modifyLootTables();

	}
}