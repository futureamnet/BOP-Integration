package amnet.bopintegration;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.Configuration;

public class Config {
	public static boolean forestryIntegration;
	public static boolean moCreaturesIntegration;
	public static boolean thaumcraftIntegration;
	public static boolean oreDictionaryRegistration;
	
	public static void load(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
		// Loading configuration
		config.load();
		
		// General configuration
		oreDictionaryRegistration = config.get(Configuration.CATEGORY_GENERAL, "Register Ore Dictionary", true).getBoolean(false);
		
		// Integration configuration
		forestryIntegration = config.get("Integration", "Forestry", true).getBoolean(false);
		moCreaturesIntegration = config.get("Integration", "Mo Creatures", true).getBoolean(false);
		thaumcraftIntegration = config.get("Integration", "Thaumcraft", true).getBoolean(false);
		
		// Saving configuration
		config.save();
	}
}
