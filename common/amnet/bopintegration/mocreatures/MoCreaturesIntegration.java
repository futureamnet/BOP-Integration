package amnet.bopintegration.mocreatures;

import java.util.Collection;

import amnet.bopintegration.BOPManager;
import amnet.bopintegration.Biomes;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import drzhark.mocreatures.MoCProxy;
import drzhark.mocreatures.MoCreatures;

public class MoCreaturesIntegration {
	public static void integrate()
	{
		addSpawns();
	}
	
	private static void addSpawns() {
		int difficultySetting = 0;
		
		try {
			if (FMLCommonHandler.instance().getEffectiveSide() == Side.SERVER) {
				difficultySetting = FMLCommonHandler.instance().getMinecraftServerInstance().getDifficulty();
			} else {
				difficultySetting = FMLCommonHandler.instance().getMinecraftServerInstance().worldServerForDimension(0).difficultySetting;
			}
		}
		catch (Exception e) {
		}
		
		int min = 4;
	    int max = 5;
	    
	    MoCProxy proxy = MoCreatures.proxy;
	    
	    BiomeGenBase[] all = getBiomesFromArray(Biomes.biomeListNoPromised.values());
	    BiomeGenBase[] arctic = getBiomesFromArray(Biomes.arcticBiomes.values());
	    BiomeGenBase[] desert = getBiomesFromArray(Biomes.desertBiomes.values());
	    BiomeGenBase[] forest = getBiomesFromArray(Biomes.forestBiomes.values());
	    BiomeGenBase[] jungle = getBiomesFromArray(Biomes.jungleBiomes.values());
	    BiomeGenBase[] mountain = getBiomesFromArray(Biomes.mountainBiomes.values());
	    BiomeGenBase[] plains = getBiomesFromArray(Biomes.plainsBiomes.values());
	    BiomeGenBase[] swamp = getBiomesFromArray(Biomes.swampBiomes.values());
	    
	    if (proxy.getHorseFreq() > 0) {
	    	EntityRegistry.addSpawn("Horse", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, plains);
	    }
	    
	    if (proxy.getBoarFreq() > 0) {
	    	EntityRegistry.addSpawn("Boar", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, forest);
	    	EntityRegistry.addSpawn("Boar", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, jungle);
	    	EntityRegistry.addSpawn("Boar", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, mountain);
	    	EntityRegistry.addSpawn("Boar", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, plains);
	    }
	    
	    if (proxy.getBearFreq() > 0) {
	    	EntityRegistry.addSpawn("Bear", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, arctic);
	    	EntityRegistry.addSpawn("Bear", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, forest);
	    }
	    
	    if (proxy.getDuckFreq() > 0) {
	    	EntityRegistry.addSpawn("Duck", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, plains);
	    }
	    
	    if (proxy.getBigCatFreq() > 0) {
	    	EntityRegistry.addSpawn("BigCat", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, arctic);
	    	EntityRegistry.addSpawn("BigCat", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, desert);
	    	EntityRegistry.addSpawn("BigCat", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, jungle);
	    	EntityRegistry.addSpawn("BigCat", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, plains);
	    }
	    
	    if (proxy.getBunnyFreq() > 0) {
	    	EntityRegistry.addSpawn("Bunny", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, forest);
	    	EntityRegistry.addSpawn("Bunny", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, plains);
	    }
	    
	    if (proxy.getBirdFreq() > 0) {
	    	EntityRegistry.addSpawn("Bird", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, forest);
	    	EntityRegistry.addSpawn("Bird", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, jungle);
	    	EntityRegistry.addSpawn("Bird", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, plains);
	    	if (BOPManager.checkForField("promisedLand"))
	    		EntityRegistry.addSpawn("Bird", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, new BiomeGenBase[] { Biomes.biomeList.get("promisedLand") });
	    }
	    
	    if (proxy.getDeerFreq() > 0) {
	    	EntityRegistry.addSpawn("Deer", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, forest);
	    }
	    
	    if (proxy.getFoxFreq() > 0) {
	    	EntityRegistry.addSpawn("Fox", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, forest);
	    }
	    
	    if (proxy.getKittyFreq() > 0) {
	    	EntityRegistry.addSpawn("Kitty", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, forest);
	    	EntityRegistry.addSpawn("Kitty", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, plains);
	    }
	    
	    if (proxy.getMiceFreq() > 0) {
	    	EntityRegistry.addSpawn("Mouse", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, forest);
	    	EntityRegistry.addSpawn("Mouse", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, jungle);
	    	EntityRegistry.addSpawn("Mouse", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, plains);
	    	EntityRegistry.addSpawn("Mouse", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, swamp);
	    }
	    
	    if (proxy.getTurtleFreq() > 0) {
	    	EntityRegistry.addSpawn("Turtle", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, swamp);
	    }
	    
	    if (proxy.getSnakeFreq() > 0) {
	    	EntityRegistry.addSpawn("Snake", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, desert);
	    	EntityRegistry.addSpawn("Snake", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, jungle);
	    	EntityRegistry.addSpawn("Snake", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, swamp);
	    }
	    
	    if (proxy.getGoatFreq() > 0) {
	    	EntityRegistry.addSpawn("Goat", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, mountain);
	    }
	    
	    if (proxy.getOstrichFreq() > 0) {
	    	EntityRegistry.addSpawn("Ostrich", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, desert);
	    	EntityRegistry.addSpawn("Ostrich", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, plains);
	    }
	    
	    if (proxy.getElephantFreq() > 0) {
	    	EntityRegistry.addSpawn("Elephant", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, arctic);
	    	EntityRegistry.addSpawn("Elephant", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, desert);
	    }
	    
	    if (proxy.getKomodoFreq() > 0) {
	    	EntityRegistry.addSpawn("Komodo Dragon", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, plains);
	    	EntityRegistry.addSpawn("Komodo Dragon", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, swamp);
	    }
	    
	    if (proxy.getFlyFreq() > 0) {
	    	EntityRegistry.addSpawn("Fly", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, forest);
	    	EntityRegistry.addSpawn("Fly", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, jungle);
	    	EntityRegistry.addSpawn("Fly", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, plains);
	    	EntityRegistry.addSpawn("Fly", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, swamp);
	    }
	    
	    if (proxy.getBeeFreq() > 0) {
	    	EntityRegistry.addSpawn("Bee", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, forest);
	    	EntityRegistry.addSpawn("Bee", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, plains);
	    	EntityRegistry.addSpawn("Bee", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, jungle);
	    }
	    
	    if (proxy.getDragonflyFreq() > 0) {
	    	EntityRegistry.addSpawn("DragonFly", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, jungle);
	    	EntityRegistry.addSpawn("DragonFly", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, swamp);
	    	if (BOPManager.checkForField("promisedLand"))
	    		EntityRegistry.addSpawn("DragonFly", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, new BiomeGenBase[] { Biomes.biomeList.get("promisedLand") });
	    }
	    
	    if (proxy.getButterflyFreq() > 0) {
	    	EntityRegistry.addSpawn("ButterFly", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, forest);
	    	EntityRegistry.addSpawn("ButterFly", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, plains);
	    	if (BOPManager.checkForField("promisedLand"))
	    		EntityRegistry.addSpawn("ButterFly", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, new BiomeGenBase[] { Biomes.biomeList.get("promisedLand") });
	    }
	    
	    if (proxy.getFireflyFreq() > 0) {
	    	EntityRegistry.addSpawn("Firefly", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, forest);
	    	EntityRegistry.addSpawn("Firefly", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, jungle);
	    	EntityRegistry.addSpawn("Firefly", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, swamp);
	    	if (BOPManager.checkForField("promisedLand"))
	    		EntityRegistry.addSpawn("Firefly", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, new BiomeGenBase[] { Biomes.biomeList.get("promisedLand") });
	    }
	    
	    if (proxy.getCricketFreq() > 0) {
	    	EntityRegistry.addSpawn("Cricket", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, forest);
	    	EntityRegistry.addSpawn("Cricket", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, jungle);
	    	if (BOPManager.checkForField("promisedLand"))
	    		EntityRegistry.addSpawn("Cricket", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, new BiomeGenBase[] { Biomes.biomeList.get("promisedLand") });
	    }
	    
	    if (proxy.getSnailFreq() > 0) {
	    	EntityRegistry.addSpawn("Snail", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, forest);
	    	EntityRegistry.addSpawn("Snail", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, jungle);
	    	EntityRegistry.addSpawn("Snail", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, plains);
	    	EntityRegistry.addSpawn("Snail", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, swamp);
	    	if (BOPManager.checkForField("promisedLand"))
	    		EntityRegistry.addSpawn("Snail", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, new BiomeGenBase[] { Biomes.biomeList.get("promisedLand") });
	    }
	    
	    if (proxy.getTurkeyFreq() > 0) {
	    	EntityRegistry.addSpawn("Turkey", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, forest);
	    	EntityRegistry.addSpawn("Turkey", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, plains);
	    }
	    
	    if (proxy.getCrocFreq() > 0) {
	    	EntityRegistry.addSpawn("Crocodile", proxy.getWraithFreq(), min, max, EnumCreatureType.creature, swamp);
	    }
	    
	    if ((proxy.getSharkFreq() > 0) && (difficultySetting >= proxy.getSharkSpawnDif() + 1)) {
	    	if (BOPManager.checkForField("crag"))
	    		EntityRegistry.addSpawn("Shark", proxy.getWraithFreq(), min, max, EnumCreatureType.waterCreature, new BiomeGenBase[] { Biomes.biomeList.get("crag") });
	    }
	    
	    if (proxy.getDolphinFreq() > 0) {
	    	if (BOPManager.checkForField("crag"))
	    		EntityRegistry.addSpawn("Dolphin", proxy.getWraithFreq(), min, max, EnumCreatureType.waterCreature, new BiomeGenBase[] { Biomes.biomeList.get("crag") });
	    }
	    
	    if (proxy.getFishFreq() > 0) {
	    	EntityRegistry.addSpawn("Fishy", proxy.getWraithFreq(), min, max, EnumCreatureType.waterCreature, all);
	    }
	    
	    if (proxy.getRayFreq() > 0) {
	    	EntityRegistry.addSpawn("Ray", proxy.getWraithFreq(), min, max, EnumCreatureType.waterCreature, jungle);
	    	EntityRegistry.addSpawn("Ray", proxy.getWraithFreq(), min, max, EnumCreatureType.waterCreature, swamp);
	    	if (BOPManager.checkForField("crag"))
	    		EntityRegistry.addSpawn("Ray", proxy.getWraithFreq(), min, max, EnumCreatureType.waterCreature, new BiomeGenBase[] { Biomes.biomeList.get("crag") });
	    }
	    
	    if (proxy.getJellyfishFreq() > 0) {
	    	EntityRegistry.addSpawn("JellyFish", proxy.getWraithFreq(), min, max, EnumCreatureType.waterCreature, jungle);
	    	EntityRegistry.addSpawn("JellyFish", proxy.getWraithFreq(), min, max, EnumCreatureType.waterCreature, swamp);
	    	if (BOPManager.checkForField("crag"))
	    		EntityRegistry.addSpawn("JellyFish", proxy.getWraithFreq(), min, max, EnumCreatureType.waterCreature, new BiomeGenBase[] { Biomes.biomeList.get("crag") });
	    }
	    
	    if ((proxy.getOgreFreq() > 0) && (difficultySetting >= proxy.getOgreSpawnDif() + 1)) {
	    	EntityRegistry.addSpawn("Ogre", proxy.getWraithFreq(), min, max, EnumCreatureType.monster, all);
	    }
	    
	    if ((proxy.getFireOgreFreq() > 0) && (difficultySetting >= proxy.getFireOgreSpawnDif() + 1)) {
	    	EntityRegistry.addSpawn("FireOgre", proxy.getWraithFreq(), min, max, EnumCreatureType.monster, all);
	    }
	    
	    if ((proxy.getCaveOgreFreq() > 0) && (difficultySetting >= proxy.getCaveOgreSpawnDif() + 1)) {
	    	EntityRegistry.addSpawn("CaveOgre", proxy.getWraithFreq(), min, max, EnumCreatureType.monster, all);
	    }
	    
	    if (proxy.getWWolfFreq() > 0) {
	    	EntityRegistry.addSpawn("WWolf", proxy.getWraithFreq(), min, max, EnumCreatureType.monster, all);
	    }
	    
	    if ((proxy.getWraithFreq() > 0) && (difficultySetting >= proxy.getWraithSpawnDif() + 1)) {
	    	EntityRegistry.addSpawn("Wraith", proxy.getWraithFreq(), min, max, EnumCreatureType.monster, all);
	    }
	    
	    if ((proxy.getFlameWraithFreq() > 0) && (difficultySetting >= proxy.getFlameWraithSpawnDif() + 1)) {
	    	EntityRegistry.addSpawn("FlameWraith", proxy.getWraithFreq(), min, max, EnumCreatureType.monster, all);
	    }
	    
	    if ((proxy.getWerewolfFreq() > 0) && (difficultySetting >= proxy.getWerewolfSpawnDif() + 1)) {
	    	EntityRegistry.addSpawn("Werewolf", proxy.getWraithFreq(), min, max, EnumCreatureType.monster, all);
	    }
	    
	    if (proxy.getRatFreq() > 0) {
	    	EntityRegistry.addSpawn("Rat", proxy.getWraithFreq(), min, max, EnumCreatureType.monster, all);
	    }
	    
	    if (proxy.getScorpionFreq() > 0) {
	    	EntityRegistry.addSpawn("Scorpion", proxy.getWraithFreq(), min, max, EnumCreatureType.monster, all);
	    }
	    
	    if (proxy.getHorseMobFreq() > 0) {
	    	EntityRegistry.addSpawn("HorseMob", proxy.getWraithFreq(), min, max, EnumCreatureType.monster, desert);
	    	EntityRegistry.addSpawn("HorseMob", proxy.getWraithFreq(), min, max, EnumCreatureType.monster, plains);
	    }
	    
	    if (proxy.getGolemFreq() > 0) {
	    	EntityRegistry.addSpawn("BigGolem", proxy.getWraithFreq(), min, max, EnumCreatureType.monster, all);
	    }
	}
	
	private static BiomeGenBase[] getBiomesFromArray(Collection<BiomeGenBase> biomeArray) {
		return (BiomeGenBase[])biomeArray.toArray(new BiomeGenBase[biomeArray.size()]);
	}
	
	
}
