package dk.mosberg.taob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import dk.mosberg.taob.block.BarrelBlock;
import dk.mosberg.taob.item.BarrelItem;
import dk.mosberg.taob.item.LargeFlaskItem;
import dk.mosberg.taob.item.MediumFlaskItem;
import dk.mosberg.taob.item.SmallFlaskItem;
import net.fabricmc.api.ModInitializer;

public class TAoB implements ModInitializer {
	public static final String MOD_ID = "taob";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		BarrelItem.registerAll();
		SmallFlaskItem.registerAll();
		MediumFlaskItem.registerAll();
		LargeFlaskItem.registerAll();
		BarrelBlock.registerAll();

		LOGGER.info("Hello Fabric world!");
	}
}
