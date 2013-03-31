package amnet.bopintegration;

import java.util.logging.Level;

import amnet.bopintegration.forestry.ForestryIntegration;
import amnet.bopintegration.mocreatures.MoCreaturesIntegration;
import amnet.bopintegration.thaumcraft.ThaumcraftIntegration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="BOPIntegration", name="BOP Integration", version="0.5.0", dependencies="required-after:Forge@[6.6.0.497,);required-after:BiomesOPlenty;after:Thaumcraft;after:Forestry;after:MoCreatures;after:CustomSpawner")
public class BOPIntegration {
	
	@Mod.PreInit
	public void load(FMLPreInitializationEvent event) {
		Config.load(event);
	}
	
	@Mod.Init
	public void load(FMLInitializationEvent event) {
		if (Loader.isModLoaded("BiomesOPlenty")) {
			
			BOPManager.initialize();
			
			if (Config.oreDictionaryRegistration)
				DictionaryRegistration.register();
			
			/* THAUMCRAFT INTEGRATION */
			if (Config.thaumcraftIntegration) {
				if (Loader.isModLoaded("Thaumcraft")) {
					try {
						ThaumcraftIntegration.integrate();
						FMLLog.info("[BOP Integration] Thaumcraft integration completed.", new Object[0]);
					}
					catch (Exception e) {
						FMLLog.log(Level.SEVERE, "There was an error while integrating Thaumcraft with Biomes O' Plenty!");
						e.printStackTrace(System.err);
					}
				} else {
					FMLLog.info("[BOP Integration] Thaumcraft not found. Skipping...", new Object[0]);
				}
			}
			
			/* FORESTRY INTEGRATION */
			if (Config.forestryIntegration) {
				if (Loader.isModLoaded("Forestry")) {
					try {
						ForestryIntegration.integrate();
						FMLLog.info("[BOP Integration] Forestry integration completed.", new Object[0]);
					}
					catch (Exception e) {
						FMLLog.log(Level.SEVERE, "There was an error while integrating Forestry with Biomes O' Plenty!");
						e.printStackTrace(System.err);
					}
				} else {
					FMLLog.info("[BOP Integration] Forestry not found. Skipping...", new Object[0]);
				}
			}
			
			/* MO' CREATURES INTEGRATION */
			if (Config.moCreaturesIntegration) {
				if (Loader.isModLoaded("MoCreatures")) {
					try {
						MoCreaturesIntegration.integrate();
						FMLLog.info("[BOP Integration] Mo' Creatures integration completed.", new Object[0]);
					}
					catch (Exception e) {
						FMLLog.log(Level.SEVERE, "There was an error while integrating Mo' Creatures with Biomes O' Plenty!");
						e.printStackTrace(System.err);
					}
				} else {
					FMLLog.info("[BOP Integration] Mo' Creatures not found. Skipping...", new Object[0]);
				}
			}
			
		} else {
			FMLLog.info("[BOP Integration] Biomes O' Plenty not found. Skipping...", new Object[0]);
		}
	}
}
