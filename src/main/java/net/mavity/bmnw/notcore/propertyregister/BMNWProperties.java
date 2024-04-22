package net.mavity.bmnw.notcore.propertyregister;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.mavity.bmnw.core.BunkersMachinesNuclearWeapons;

public class BMNWProperties {
    public static final FabricItemSettings I_DUNNO_NAMES = new FabricItemSettings();
    public static void registerBMNWProperties() {
        BunkersMachinesNuclearWeapons.LOGGER.info(BunkersMachinesNuclearWeapons.NAME + " has registered its' properties.");
    }
}
