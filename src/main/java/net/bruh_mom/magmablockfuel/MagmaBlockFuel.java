package net.bruh_mom.magmablockfuel;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.ItemTags;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MagmaBlockFuel implements ModInitializer {
	public static final String MOD_ID = "magmablockfuel";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		FuelRegistry.INSTANCE.add(Blocks.MAGMA_BLOCK, 1000);

	}
}