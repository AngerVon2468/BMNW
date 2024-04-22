package net.mavity.bmnw.core;

import net.fabricmc.api.ModInitializer;

import net.mavity.bmnw.notcore.blockregister.BlockInit;
import net.mavity.bmnw.notcore.itemregister.ItemInit;
import net.mavity.bmnw.notcore.propertyregister.BMNWProperties;

import net.mavity.bmnw.notcore.soundregister.SoundInit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BunkersMachinesNuclearWeapons implements ModInitializer {

	public static final String NAME = "Bunkers, Machines & Nuclear Weapons";

	public static final String MOD_ID = "bmnw";

    public static final Logger LOGGER = LoggerFactory.getLogger(BunkersMachinesNuclearWeapons.NAME);

	@Override
	public void onInitialize() {

		// Logger & Initializing Classes
		BunkersMachinesNuclearWeapons.LOGGER.info(BunkersMachinesNuclearWeapons.NAME + " has registered its' main class");
		BlockInit.registerBMNWBlocks();
		ItemInit.registerBMNWItems();
		BMNWProperties.registerBMNWProperties();
		SoundInit.registerBMNWSounds();

	}
}