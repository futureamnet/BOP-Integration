package amnet.bopintegration;

import java.util.HashMap;

import net.minecraft.world.biome.BiomeGenBase;
import tdwp_ftw.biomesop.mod_BiomesOPlenty;

public class Biomes {
	public static HashMap<String, BiomeGenBase> biomeList = new HashMap<String, BiomeGenBase>();
	public static HashMap<String, BiomeGenBase> biomeListNoPromised = new HashMap<String, BiomeGenBase>();
	
	public static HashMap<String, BiomeGenBase> arcticBiomes = new HashMap<String, BiomeGenBase>();
	public static HashMap<String, BiomeGenBase> desertBiomes = new HashMap<String, BiomeGenBase>();
	public static HashMap<String, BiomeGenBase> forestBiomes = new HashMap<String, BiomeGenBase>();
	public static HashMap<String, BiomeGenBase> jungleBiomes = new HashMap<String, BiomeGenBase>();
	public static HashMap<String, BiomeGenBase> mountainBiomes = new HashMap<String, BiomeGenBase>();
	public static HashMap<String, BiomeGenBase> plainsBiomes = new HashMap<String, BiomeGenBase>();
	public static HashMap<String, BiomeGenBase> swampBiomes = new HashMap<String, BiomeGenBase>();
	
	public static void initialize() {
		/* Arctic Biomes */
		if (BOPManager.checkForField("taigaNew")) 
			arcticBiomes.put("taigaNew", mod_BiomesOPlenty.taigaNew);
		if (BOPManager.checkForField("alps")) 
			arcticBiomes.put("alps", mod_BiomesOPlenty.alps);
		if (BOPManager.checkForField("arctic")) 
			arcticBiomes.put("arctic", mod_BiomesOPlenty.arctic);
		if (BOPManager.checkForField("frostForest")) 
			arcticBiomes.put("frostForest", mod_BiomesOPlenty.frostForest);
		if (BOPManager.checkForField("glacier")) 
			arcticBiomes.put("glacier", mod_BiomesOPlenty.glacier);
		if (BOPManager.checkForField("iceSheet")) 
			arcticBiomes.put("iceSheet", mod_BiomesOPlenty.iceSheet);
		if (BOPManager.checkForField("icyHills")) 
			arcticBiomes.put("icyHills", mod_BiomesOPlenty.icyHills);
		if (BOPManager.checkForField("snowyWoods")) 
			arcticBiomes.put("snowyWoods", mod_BiomesOPlenty.snowyWoods);
		if (BOPManager.checkForField("tundra")) 
			arcticBiomes.put("tundra", mod_BiomesOPlenty.tundra);
		
		/* Desert Biomes */
		if (BOPManager.checkForField("desertNew")) 
			desertBiomes.put("desertNew", mod_BiomesOPlenty.desertNew);
		if (BOPManager.checkForField("badlands")) 
			desertBiomes.put("badlands", mod_BiomesOPlenty.badlands);
		if (BOPManager.checkForField("deadlands")) 
			desertBiomes.put("deadlands", mod_BiomesOPlenty.deadlands);
		if (BOPManager.checkForField("dunes")) 
			desertBiomes.put("dunes", mod_BiomesOPlenty.dunes);
		if (BOPManager.checkForField("lushDesert")) 
			desertBiomes.put("lushDesert", mod_BiomesOPlenty.lushDesert);
		if (BOPManager.checkForField("mesa")) 
			desertBiomes.put("mesa", mod_BiomesOPlenty.mesa);
		if (BOPManager.checkForField("oasis")) 
			desertBiomes.put("oasis", mod_BiomesOPlenty.oasis);
		if (BOPManager.checkForField("quagmire")) 
			desertBiomes.put("quagmire", mod_BiomesOPlenty.quagmire);
		if (BOPManager.checkForField("wasteland")) 
			desertBiomes.put("wasteland", mod_BiomesOPlenty.wasteland);
		
		/* Forest Biomes */
		if (BOPManager.checkForField("forestNew")) 
			forestBiomes.put("forestNew", mod_BiomesOPlenty.forestNew);
		if (BOPManager.checkForField("birchForest")) 
			forestBiomes.put("birchForest", mod_BiomesOPlenty.birchForest);
		if (BOPManager.checkForField("borealForest")) 
			forestBiomes.put("borealForest", mod_BiomesOPlenty.borealForest);
		if (BOPManager.checkForField("cherryBlossomGrove")) 
			forestBiomes.put("cherryBlossomGrove", mod_BiomesOPlenty.cherryBlossomGrove);
		if (BOPManager.checkForField("coniferousForest")) 
			forestBiomes.put("coniferousForest", mod_BiomesOPlenty.coniferousForest);
		if (BOPManager.checkForField("deadForest")) 
			forestBiomes.put("deadForest", mod_BiomesOPlenty.deadForest);
		if (BOPManager.checkForField("deciduousForest")) 
			forestBiomes.put("deciduousForest", mod_BiomesOPlenty.deciduousForest);
		if (BOPManager.checkForField("fen")) 
			forestBiomes.put("fen", mod_BiomesOPlenty.fen);
		if (BOPManager.checkForField("fungiForest")) 
			forestBiomes.put("fungiForest", mod_BiomesOPlenty.fungiForest);
		if (BOPManager.checkForField("grove")) 
			forestBiomes.put("grove", mod_BiomesOPlenty.grove);
		if (BOPManager.checkForField("mapleWoods")) 
			forestBiomes.put("mapleWoods", mod_BiomesOPlenty.mapleWoods);
		if (BOPManager.checkForField("meadow")) 
			forestBiomes.put("meadow", mod_BiomesOPlenty.meadow);
		if (BOPManager.checkForField("mysticGrove")) 
			forestBiomes.put("mysticGrove", mod_BiomesOPlenty.mysticGrove);
		if (BOPManager.checkForField("ominousWoods")) 
			forestBiomes.put("ominousWoods", mod_BiomesOPlenty.ominousWoods);
		if (BOPManager.checkForField("orchard")) 
			forestBiomes.put("orchard", mod_BiomesOPlenty.orchard);
		if (BOPManager.checkForField("originValley")) 
			forestBiomes.put("originValley", mod_BiomesOPlenty.originValley);
		if (BOPManager.checkForField("redwoodForest")) 
			forestBiomes.put("redwoodForest", mod_BiomesOPlenty.redwoodForest);
		if (BOPManager.checkForField("seasonalForest")) 
			forestBiomes.put("seasonalForest", mod_BiomesOPlenty.seasonalForest);
		if (BOPManager.checkForField("spruceWoods")) 
			forestBiomes.put("spruceWoods", mod_BiomesOPlenty.spruceWoods);
		if (BOPManager.checkForField("thicket")) 
			forestBiomes.put("thicket", mod_BiomesOPlenty.thicket);
		if (BOPManager.checkForField("woodland")) 
			forestBiomes.put("woodland", mod_BiomesOPlenty.woodland);
		
		/* Jungle Biomes */
		if (BOPManager.checkForField("jungleNew")) 
			jungleBiomes.put("jungleNew", mod_BiomesOPlenty.jungleNew);
		if (BOPManager.checkForField("bambooForest")) 
			jungleBiomes.put("bambooForest", mod_BiomesOPlenty.bambooForest);
		if (BOPManager.checkForField("rainforest")) 
			jungleBiomes.put("rainforest", mod_BiomesOPlenty.rainforest);
		if (BOPManager.checkForField("temperateRainforest")) 
			jungleBiomes.put("temperateRainforest", mod_BiomesOPlenty.temperateRainforest);
		if (BOPManager.checkForField("tropicalRainforest")) 
			jungleBiomes.put("tropicalRainforest", mod_BiomesOPlenty.tropicalRainforest);
		if (BOPManager.checkForField("tropics")) 
			jungleBiomes.put("tropics", mod_BiomesOPlenty.tropics);
		
		/* Mountain Biomes */
		if (BOPManager.checkForField("extremeHillsNew")) 
			mountainBiomes.put("extremeHillsNew", mod_BiomesOPlenty.extremeHillsNew);
		if (BOPManager.checkForField("canyon")) 
			mountainBiomes.put("canyon", mod_BiomesOPlenty.canyon);
		if (BOPManager.checkForField("crag")) 
			mountainBiomes.put("crag", mod_BiomesOPlenty.crag);
		if (BOPManager.checkForField("highland")) 
			mountainBiomes.put("highland", mod_BiomesOPlenty.highland);
		if (BOPManager.checkForField("jadeCliffs")) 
			mountainBiomes.put("jadeCliffs", mod_BiomesOPlenty.jadeCliffs);
		if (BOPManager.checkForField("moor")) 
			mountainBiomes.put("moor", mod_BiomesOPlenty.moor);
		if (BOPManager.checkForField("mountain")) 
			mountainBiomes.put("mountain", mod_BiomesOPlenty.mountain);
		if (BOPManager.checkForField("sacredSprings")) 
			mountainBiomes.put("sacredSprings", mod_BiomesOPlenty.sacredSprings);
		if (BOPManager.checkForField("volcano")) 
			mountainBiomes.put("volcano", mod_BiomesOPlenty.volcano);
		
		/* Plains Biomes */
		if (BOPManager.checkForField("plainsNew")) 
			plainsBiomes.put("plainsNew", mod_BiomesOPlenty.plainsNew);
		if (BOPManager.checkForField("chaparral")) 
			plainsBiomes.put("chaparral", mod_BiomesOPlenty.chaparral);
		if (BOPManager.checkForField("drylands")) 
			plainsBiomes.put("drylands", mod_BiomesOPlenty.drylands);
		if (BOPManager.checkForField("field")) 
			plainsBiomes.put("field", mod_BiomesOPlenty.field);
		if (BOPManager.checkForField("garden")) 
			plainsBiomes.put("garden", mod_BiomesOPlenty.garden);
		if (BOPManager.checkForField("grassland")) 
			plainsBiomes.put("grassland", mod_BiomesOPlenty.grassland);
		if (BOPManager.checkForField("heathland")) 
			plainsBiomes.put("heathland", mod_BiomesOPlenty.heathland);
		if (BOPManager.checkForField("outback")) 
			plainsBiomes.put("outback", mod_BiomesOPlenty.outback);
		if (BOPManager.checkForField("pasture")) 
			plainsBiomes.put("pasture", mod_BiomesOPlenty.pasture);
		if (BOPManager.checkForField("prairie")) 
			plainsBiomes.put("prairie", mod_BiomesOPlenty.prairie);
		if (BOPManager.checkForField("savanna")) 
			plainsBiomes.put("savanna", mod_BiomesOPlenty.savanna);
		if (BOPManager.checkForField("scrubland")) 
			plainsBiomes.put("scrubland", mod_BiomesOPlenty.scrubland);
		if (BOPManager.checkForField("shield")) 
			plainsBiomes.put("shield", mod_BiomesOPlenty.shield);
		if (BOPManager.checkForField("shore")) 
			plainsBiomes.put("shore", mod_BiomesOPlenty.shore);
		if (BOPManager.checkForField("shrubland")) 
			plainsBiomes.put("shrubland", mod_BiomesOPlenty.shrubland);
		if (BOPManager.checkForField("steppe")) 
			plainsBiomes.put("steppe", mod_BiomesOPlenty.steppe);
		
		/* Swamp Biomes */		
		if (BOPManager.checkForField("swamplandNew")) 
			swampBiomes.put("swamplandNew", mod_BiomesOPlenty.swamplandNew);
		if (BOPManager.checkForField("bayou")) 
			swampBiomes.put("bayou", mod_BiomesOPlenty.bayou);
		if (BOPManager.checkForField("bog")) 
			swampBiomes.put("bog", mod_BiomesOPlenty.bog);
		if (BOPManager.checkForField("deadSwamp")) 
			swampBiomes.put("deadSwamp", mod_BiomesOPlenty.deadSwamp);
		if (BOPManager.checkForField("lushSwamp")) 
			swampBiomes.put("lushSwamp", mod_BiomesOPlenty.lushSwamp);
		if (BOPManager.checkForField("mangrove")) 
			swampBiomes.put("mangrove", mod_BiomesOPlenty.mangrove);
		if (BOPManager.checkForField("marsh")) 
			swampBiomes.put("marsh", mod_BiomesOPlenty.marsh);
		if (BOPManager.checkForField("swampwoods")) 
			swampBiomes.put("swampwoods", mod_BiomesOPlenty.swampwoods);
		if (BOPManager.checkForField("wetland")) 
			swampBiomes.put("wetland", mod_BiomesOPlenty.wetland);

		/* Promised Land */
		if (BOPManager.checkForField("promisedLand")) 
			biomeList.put("promisedLand", mod_BiomesOPlenty.promisedLand);
		
		biomeListNoPromised.putAll(arcticBiomes);
		biomeListNoPromised.putAll(desertBiomes);
		biomeListNoPromised.putAll(forestBiomes);
		biomeListNoPromised.putAll(jungleBiomes);
		biomeListNoPromised.putAll(mountainBiomes);
		biomeListNoPromised.putAll(plainsBiomes);
		biomeListNoPromised.putAll(swampBiomes);
		
		biomeList.putAll(biomeListNoPromised);
		
		/* New Vanilla Biomes */
		/*if (BOPManager.checkForField("desertNew")) 
			biomeList.put("desertNew", mod_BiomesOPlenty.desertNew);
		if (BOPManager.checkForField("plainsNew")) 
			biomeList.put("plainsNew", mod_BiomesOPlenty.plainsNew);
		if (BOPManager.checkForField("extremeHillsNew")) 
			biomeList.put("extremeHillsNew", mod_BiomesOPlenty.extremeHillsNew);
		if (BOPManager.checkForField("forestNew")) 
			biomeList.put("forestNew", mod_BiomesOPlenty.forestNew);
		if (BOPManager.checkForField("taigaNew")) 
			biomeList.put("taigaNew", mod_BiomesOPlenty.taigaNew);
		if (BOPManager.checkForField("swamplandNew")) 
			biomeList.put("swamplandNew", mod_BiomesOPlenty.swamplandNew);
		if (BOPManager.checkForField("jungleNew")) 
			biomeList.put("jungleNew", mod_BiomesOPlenty.jungleNew);*/
		
		/* New Biomes */
		/*if (BOPManager.checkForField("alps")) 
			biomeList.put("alps", mod_BiomesOPlenty.alps);
		if (BOPManager.checkForField("arctic")) 
			biomeList.put("arctic", mod_BiomesOPlenty.arctic);
		if (BOPManager.checkForField("badlands")) 
			biomeList.put("badlands", mod_BiomesOPlenty.badlands);
		if (BOPManager.checkForField("bambooForest")) 
			biomeList.put("bambooForest", mod_BiomesOPlenty.bambooForest);
		if (BOPManager.checkForField("bayou")) 
			biomeList.put("bayou", mod_BiomesOPlenty.bayou);
		if (BOPManager.checkForField("birchForest")) 
			biomeList.put("birchForest", mod_BiomesOPlenty.birchForest);
		if (BOPManager.checkForField("bog")) 
			biomeList.put("bog", mod_BiomesOPlenty.bog);
		if (BOPManager.checkForField("borealForest")) 
			biomeList.put("borealForest", mod_BiomesOPlenty.borealForest);
		if (BOPManager.checkForField("canyon")) 
			biomeList.put("canyon", mod_BiomesOPlenty.canyon);
		if (BOPManager.checkForField("chaparral")) 
			biomeList.put("chaparral", mod_BiomesOPlenty.chaparral);
		if (BOPManager.checkForField("cherryBlossomGrove")) 
			biomeList.put("cherryBlossomGrove", mod_BiomesOPlenty.cherryBlossomGrove);
		if (BOPManager.checkForField("coniferousForest")) 
			biomeList.put("coniferousForest", mod_BiomesOPlenty.coniferousForest);
		if (BOPManager.checkForField("crag")) 
			biomeList.put("crag", mod_BiomesOPlenty.crag);
		if (BOPManager.checkForField("deadForest")) 
			biomeList.put("deadForest", mod_BiomesOPlenty.deadForest);
		if (BOPManager.checkForField("deadSwamp")) 
			biomeList.put("deadSwamp", mod_BiomesOPlenty.deadSwamp);
		if (BOPManager.checkForField("deadlands")) 
			biomeList.put("deadlands", mod_BiomesOPlenty.deadlands);
		if (BOPManager.checkForField("deciduousForest")) 
			biomeList.put("deciduousForest", mod_BiomesOPlenty.deciduousForest);
		if (BOPManager.checkForField("drylands")) 
			biomeList.put("drylands", mod_BiomesOPlenty.drylands);
		if (BOPManager.checkForField("dunes")) 
			biomeList.put("dunes", mod_BiomesOPlenty.dunes);
		if (BOPManager.checkForField("fen")) 
			biomeList.put("fen", mod_BiomesOPlenty.fen);
		if (BOPManager.checkForField("field")) 
			biomeList.put("field", mod_BiomesOPlenty.field);
		if (BOPManager.checkForField("frostForest")) 
			biomeList.put("frostForest", mod_BiomesOPlenty.frostForest);
		if (BOPManager.checkForField("fungiForest")) 
			biomeList.put("fungiForest", mod_BiomesOPlenty.fungiForest);
		if (BOPManager.checkForField("garden")) 
			biomeList.put("garden", mod_BiomesOPlenty.garden);
		if (BOPManager.checkForField("glacier")) 
			biomeList.put("glacier", mod_BiomesOPlenty.glacier);
		if (BOPManager.checkForField("grassland")) 
			biomeList.put("grassland", mod_BiomesOPlenty.grassland);
		if (BOPManager.checkForField("grove")) 
			biomeList.put("grove", mod_BiomesOPlenty.grove);
		if (BOPManager.checkForField("heathland")) 
			biomeList.put("heathland", mod_BiomesOPlenty.heathland);
		if (BOPManager.checkForField("highland")) 
			biomeList.put("highland", mod_BiomesOPlenty.highland);
		if (BOPManager.checkForField("iceSheet")) 
			biomeList.put("iceSheet", mod_BiomesOPlenty.iceSheet);
		if (BOPManager.checkForField("icyHills")) 
			biomeList.put("icyHills", mod_BiomesOPlenty.icyHills);
		if (BOPManager.checkForField("jadeCliffs")) 
			biomeList.put("jadeCliffs", mod_BiomesOPlenty.jadeCliffs);
		if (BOPManager.checkForField("lushDesert")) 
			biomeList.put("lushDesert", mod_BiomesOPlenty.lushDesert);
		if (BOPManager.checkForField("lushSwamp")) 
			biomeList.put("lushSwamp", mod_BiomesOPlenty.lushSwamp);
		if (BOPManager.checkForField("mangrove")) 
			biomeList.put("mangrove", mod_BiomesOPlenty.mangrove);
		if (BOPManager.checkForField("mapleWoods")) 
			biomeList.put("mapleWoods", mod_BiomesOPlenty.mapleWoods);
		if (BOPManager.checkForField("marsh")) 
			biomeList.put("marsh", mod_BiomesOPlenty.marsh);
		if (BOPManager.checkForField("meadow")) 
			biomeList.put("meadow", mod_BiomesOPlenty.meadow);
		if (BOPManager.checkForField("mesa")) 
			biomeList.put("mesa", mod_BiomesOPlenty.mesa);
		if (BOPManager.checkForField("moor")) 
			biomeList.put("moor", mod_BiomesOPlenty.moor);
		if (BOPManager.checkForField("mountain")) 
			biomeList.put("mountain", mod_BiomesOPlenty.mountain);
		if (BOPManager.checkForField("mysticGrove")) 
			biomeList.put("mysticGrove", mod_BiomesOPlenty.mysticGrove);
		if (BOPManager.checkForField("oasis")) 
			biomeList.put("oasis", mod_BiomesOPlenty.oasis);
		if (BOPManager.checkForField("ominousWoods")) 
			biomeList.put("ominousWoods", mod_BiomesOPlenty.ominousWoods);
		if (BOPManager.checkForField("orchard")) 
			biomeList.put("orchard", mod_BiomesOPlenty.orchard);
		if (BOPManager.checkForField("originValley")) 
			biomeList.put("originValley", mod_BiomesOPlenty.originValley);
		if (BOPManager.checkForField("outback")) 
			biomeList.put("outback", mod_BiomesOPlenty.outback);
		if (BOPManager.checkForField("pasture")) 
			biomeList.put("pasture", mod_BiomesOPlenty.pasture);
		if (BOPManager.checkForField("prairie")) 
			biomeList.put("prairie", mod_BiomesOPlenty.prairie);
		if (BOPManager.checkForField("promisedLand")) 
			biomeList.put("promisedLand", mod_BiomesOPlenty.promisedLand);
		if (BOPManager.checkForField("quagmire")) 
			biomeList.put("quagmire", mod_BiomesOPlenty.quagmire);
		if (BOPManager.checkForField("rainforest")) 
			biomeList.put("rainforest", mod_BiomesOPlenty.rainforest);
		if (BOPManager.checkForField("redwoodForest")) 
			biomeList.put("redwoodForest", mod_BiomesOPlenty.redwoodForest);
		if (BOPManager.checkForField("sacredSprings")) 
			biomeList.put("sacredSprings", mod_BiomesOPlenty.sacredSprings);
		if (BOPManager.checkForField("savanna")) 
			biomeList.put("savanna", mod_BiomesOPlenty.savanna);
		if (BOPManager.checkForField("scrubland")) 
			biomeList.put("scrubland", mod_BiomesOPlenty.scrubland);
		if (BOPManager.checkForField("seasonalForest")) 
			biomeList.put("seasonalForest", mod_BiomesOPlenty.seasonalForest);
		if (BOPManager.checkForField("shield")) 
			biomeList.put("shield", mod_BiomesOPlenty.shield);
		if (BOPManager.checkForField("shore")) 
			biomeList.put("shore", mod_BiomesOPlenty.shore);
		if (BOPManager.checkForField("shrubland")) 
			biomeList.put("shrubland", mod_BiomesOPlenty.shrubland);
		if (BOPManager.checkForField("snowyWoods")) 
			biomeList.put("snowyWoods", mod_BiomesOPlenty.snowyWoods);
		if (BOPManager.checkForField("spruceWoods")) 
			biomeList.put("spruceWoods", mod_BiomesOPlenty.spruceWoods);
		if (BOPManager.checkForField("steppe")) 
			biomeList.put("steppe", mod_BiomesOPlenty.steppe);
		if (BOPManager.checkForField("swampwoods")) 
			biomeList.put("swampwoods", mod_BiomesOPlenty.swampwoods);
		if (BOPManager.checkForField("temperateRainforest")) 
			biomeList.put("temperateRainforest", mod_BiomesOPlenty.temperateRainforest);
		if (BOPManager.checkForField("thicket")) 
			biomeList.put("thicket", mod_BiomesOPlenty.thicket);
		if (BOPManager.checkForField("tropicalRainforest")) 
			biomeList.put("tropicalRainforest", mod_BiomesOPlenty.tropicalRainforest);
		if (BOPManager.checkForField("tropics")) 
			biomeList.put("tropics", mod_BiomesOPlenty.tropics);
		if (BOPManager.checkForField("tundra")) 
			biomeList.put("tundra", mod_BiomesOPlenty.tundra);
		if (BOPManager.checkForField("volcano")) 
			biomeList.put("volcano", mod_BiomesOPlenty.volcano);
		if (BOPManager.checkForField("wasteland")) 
			biomeList.put("wasteland", mod_BiomesOPlenty.wasteland);
		if (BOPManager.checkForField("wetland")) 
			biomeList.put("wetland", mod_BiomesOPlenty.wetland);
		if (BOPManager.checkForField("woodland")) 
			biomeList.put("woodland", mod_BiomesOPlenty.woodland);*/
	}
	
}
