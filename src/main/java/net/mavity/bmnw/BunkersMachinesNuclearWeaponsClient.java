package net.mavity.bmnw;

import net.fabricmc.api.ClientModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BunkersMachinesNuclearWeaponsClient implements ClientModInitializer {

    public static final String NAME = "Bunkers, Machines & Nuclear Weapons Client";
    public static final Logger LOGGER = LoggerFactory.getLogger(BunkersMachinesNuclearWeaponsClient.NAME);

    @Override
    public void onInitializeClient() {

        // Logger
        BunkersMachinesNuclearWeaponsClient.LOGGER.info(BunkersMachinesNuclearWeaponsClient.NAME + " has registered its' client class");

    }
}
