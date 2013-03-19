package amnet.bopintegration;

import java.util.logging.Level;

import amnet.bopintegration.forestry.ForestryIntegration;
import amnet.bopintegration.thaumcraft.ThaumcraftIntegration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid="BoPIntegration", name="BoPIntegration", version="0.4.0", dependencies="required-after:Forge@[6.6.0.497,);required-after:BiomesOPlenty;after:Thaumcraft;after:Forestry")
public class BoPIntegration {
	
	@Mod.Init
	public void load(FMLInitializationEvent event) {
		if (Loader.isModLoaded("BiomesOPlenty")) {
			
			DictionaryRegistration.register();
			
			/* THAUMCRAFT INTEGRATION */
			if (Loader.isModLoaded("Thaumcraft")) {
				try {
					ThaumcraftIntegration.integrate();
					FMLLog.info("[BoPIntegration] Thaumcraft integration completed.", new Object[0]);
				}
				catch (Exception e) {
					FMLLog.log(Level.SEVERE, "There was an error while integrating Thaumcraft with Biomes O' Plenty!");
					e.printStackTrace(System.err);
				}
			} else {
				FMLLog.info("[BoPIntegration] Thaumcraft not found. Skipping...", new Object[0]);
			}
			
			/* FORESTRY INTEGRATION */
			if (Loader.isModLoaded("Forestry")) {
				try {
					ForestryIntegration.integrate();
					FMLLog.info("[BoPIntegration] Forestry integration completed.", new Object[0]);
				}
				catch (Exception e) {
					FMLLog.log(Level.SEVERE, "There was an error while integrating Forestry with Biomes O' Plenty!");
					e.printStackTrace(System.err);
				}
			} else {
				FMLLog.info("[BoPIntegration] Forestry not found. Skipping...", new Object[0]);
			}
			
		} else {
			FMLLog.info("[BoPIntegration] Biomes O' Plenty not found. Skipping...", new Object[0]);
		}
	}
}
