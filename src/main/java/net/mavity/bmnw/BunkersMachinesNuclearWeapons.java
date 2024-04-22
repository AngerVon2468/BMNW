package net.mavity.bmnw;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BunkersMachinesNuclearWeapons implements ModInitializer {

	public static final String NAME = "Bunkers, Machines & Nuclear Weapons";

	public static final String MOD_ID = "bmnw";

    public static final Logger LOGGER = LoggerFactory.getLogger(BunkersMachinesNuclearWeapons.NAME);

	@Override
	public void onInitialize() {

		BunkersMachinesNuclearWeapons.LOGGER.info(BunkersMachinesNuclearWeapons.NAME + " has registered its' main class");

	}
}