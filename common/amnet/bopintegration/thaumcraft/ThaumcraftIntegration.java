package amnet.bopintegration.thaumcraft;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import tdwp_ftw.biomesop.mod_BiomesOPlenty;
import thaumcraft.api.EnumTag;
import thaumcraft.api.ObjectTags;
import thaumcraft.api.ThaumcraftApi;
import amnet.bopintegration.Biomes;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ThaumcraftIntegration {
	public static void integrate(){
		registerBiomesInfo();
		addAspects();
		BiomeGenBase[] allBiomes = (BiomeGenBase[])Biomes.biomeList.values().toArray(new BiomeGenBase[] { null });
		EntityRegistry.addSpawn("entBrainyZombie", 6, 1, 1, EnumCreatureType.monster, (BiomeGenBase[])Biomes.biomeList.values().toArray(allBiomes));
	}
	
	private static void addAspects() {
		// LOGS
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.holyWood.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 8).add(EnumTag.LIGHT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.magicWood.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 8).add(EnumTag.MAGIC, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.darkWood.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 8).add(EnumTag.DARK, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.deadWood.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 8).add(EnumTag.DEATH, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.acaciaWood.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 8));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.cherryWood.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 8));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.firWood.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 8));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.mangroveWood.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 8));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.palmWood.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 8));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redwoodWood.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 8));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.willowWood.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 8));
		
		// PLANKS
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.holyPlank.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 2).add(EnumTag.LIGHT, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.magicPlank.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 2).add(EnumTag.MAGIC, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.darkPlank.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 2).add(EnumTag.DARK, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.acaciaPlank.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.cherryPlank.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.firPlank.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.mangrovePlank.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.palmPlank.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redwoodPlank.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.willowPlank.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 2));
				
		// LEAVES
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.holyLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.LIGHT, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.blueLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.MAGIC, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.darkLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.DARK, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.deadLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.DEATH, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.appleLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.LIFE, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.acaciaLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.firLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.mangroveLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.palmLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redwoodLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.willowLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.autumnLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.orangeLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.pinkLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.whiteLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.bambooLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.originLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.appleLeavesFruitless.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		
		// SAPLINGS
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.holySapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2).add(EnumTag.LIGHT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.magicSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2).add(EnumTag.MAGIC, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.darkSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2).add(EnumTag.DARK, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.brownSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2).add(EnumTag.DEATH, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.acaciaSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.firSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.mangroveSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.palmSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redwoodSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.willowSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.orangeSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.pinkSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.whiteSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.appleSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.originSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.yellowSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		
		// BLOCKS
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.mud.blockID, -1, (new ObjectTags()).add(EnumTag.WATER, 3).add(EnumTag.EARTH, 6));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.driedDirt.blockID, -1, (new ObjectTags()).add(EnumTag.DESTRUCTION, 1).add(EnumTag.EARTH, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redRock.blockID, -1, (new ObjectTags()).add(EnumTag.ROCK, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.ash.blockID, -1, (new ObjectTags()).add(EnumTag.DESTRUCTION, 3).add(EnumTag.EXCHANGE, 3));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.ashStone.blockID, -1, (new ObjectTags()).add(EnumTag.ROCK, 1).add(EnumTag.EXCHANGE, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.hardIce.blockID, -1, (new ObjectTags()).add(EnumTag.ROCK, 2).add(EnumTag.COLD, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.originGrass.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.EARTH, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.hardSand.blockID, -1, (new ObjectTags()).add(EnumTag.ROCK, 1).add(EnumTag.EARTH, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.hardDirt.blockID, -1, (new ObjectTags()).add(EnumTag.ROCK, 1).add(EnumTag.EARTH, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.holyGrass.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.EARTH, 2).add(EnumTag.LIGHT, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.holyStone.blockID, -1, (new ObjectTags()).add(EnumTag.LIGHT, 1).add(EnumTag.ROCK, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.cragRock.blockID, -1, (new ObjectTags()).add(EnumTag.ROCK, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.quicksand.blockID, -1, (new ObjectTags()).add(EnumTag.EARTH, 2).add(EnumTag.TRAP, 4));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.smolderingGrass.blockID, -1, (new ObjectTags()).add(EnumTag.EARTH, 2).add(EnumTag.FIRE, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.bambooThatching.blockID, -1, (new ObjectTags()).add(EnumTag.WATER, 14).add(EnumTag.PLANT, 14));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.amethystBlock.blockID, -1, (new ObjectTags()).add(EnumTag.VALUABLE, 58).add(EnumTag.PURE, 58).add(EnumTag.CRYSTAL, 87));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.amethystOre.blockID, -1, (new ObjectTags()).add(EnumTag.VALUABLE, 6).add(EnumTag.PURE, 6).add(EnumTag.CRYSTAL, 14).add(EnumTag.ROCK, 4));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redRockCobble.blockID, -1, (new ObjectTags()).add(EnumTag.DESTRUCTION, 1).add(EnumTag.ROCK, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.giantFlowerRed.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4).add(EnumTag.MAGIC, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.giantFlowerStem.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4).add(EnumTag.MAGIC, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.giantFlowerYellow.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4).add(EnumTag.MAGIC, 1));
		
		// ITEMS
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.amethyst.itemID, -1, (new ObjectTags()).add(EnumTag.VALUABLE, 8).add(EnumTag.PURE, 8).add(EnumTag.CRYSTAL, 16));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.barleyItem.itemID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.LIFE, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.ashes.itemID, -1, (new ObjectTags()).add(EnumTag.DESTRUCTION, 1).add(EnumTag.EXCHANGE, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.cattailItem.itemID, -1, (new ObjectTags()).add(EnumTag.WATER, 1).add(EnumTag.PLANT, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.bambooItem.itemID, -1, (new ObjectTags()).add(EnumTag.WATER, 2).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.mudBrick.itemID, -1, (new ObjectTags()).add(EnumTag.EARTH, 2).add(EnumTag.FIRE, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.mudBall.itemID, -1, (new ObjectTags()).add(EnumTag.WATER, 1).add(EnumTag.EARTH, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.shroomPowder.itemID, -1, (new ObjectTags()).add(EnumTag.FUNGUS, 2).add(EnumTag.DESTRUCTION, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.bopDisc.itemID, -1, (new ObjectTags()).add(EnumTag.SOUND, 12).add(EnumTag.VALUABLE, 4).add(EnumTag.CROP, 4));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.bopDiscMud.itemID, -1, (new ObjectTags()).add(EnumTag.SOUND, 12).add(EnumTag.VALUABLE, 4).add(EnumTag.EARTH, 2).add(EnumTag.WATER, 2));
		
		// PLANTS
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.toadstool.blockID, -1, (new ObjectTags()).add(EnumTag.FUNGUS, 4));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.tinyCactus.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2).add(EnumTag.WEAPON, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.holyTallGrass.blockID, -1, (new ObjectTags()).add(EnumTag.WIND, 1).add(EnumTag.PLANT, 1).add(EnumTag.LIGHT, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.desertSprouts.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.duneGrass.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.WIND, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.thorn.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2).add(EnumTag.WEAPON, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.desertGrass.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.deadGrass.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.treeMoss.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.moss.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.sproutItem.itemID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.bushItem.itemID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.mediumGrassItem.itemID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.shortGrassItem.itemID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1));
		
		// FLOWERS
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.violet.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.hydrangea.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.deathbloom.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4).add(EnumTag.DEATH, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.glowFlower.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4).add(EnumTag.LIGHT, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.whiteFlower.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.blueFlower.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.purpleFlower.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.orangeFlower.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.pinkFlower.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.tinyFlower.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 1).add(EnumTag.PLANT, 1));
	}
	
	private static void registerBiomesInfo(){
		/* New Vanilla Biomes */
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("desertNew").biomeID, 300, EnumTag.FIRE, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("plainsNew").biomeID, 600, EnumTag.WIND, false, true);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("extremeHillsNew").biomeID, 500, EnumTag.ROCK, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("forestNew").biomeID, 700, EnumTag.WOOD, true, true);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("taigaNew").biomeID, 700, EnumTag.WIND, true, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("swamplandNew").biomeID, 700, EnumTag.WATER, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("jungleNew").biomeID, 800, EnumTag.PLANT, false, false);

		/* New Biomes */
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("alps").biomeID, 500, EnumTag.COLD, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("arctic").biomeID, 600, EnumTag.WOOD, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("badlands").biomeID, 300, EnumTag.FIRE, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("bambooForest").biomeID, 600, EnumTag.PLANT, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("bayou").biomeID, 600, EnumTag.WATER, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("birchForest").biomeID, 700, EnumTag.WOOD, true, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("bog").biomeID, 650, EnumTag.WATER, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("borealForest").biomeID, 700, EnumTag.WOOD, true, true);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("canyon").biomeID, 500, EnumTag.ROCK, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("chaparral").biomeID, 550, EnumTag.PLANT, true, true);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("cherryBlossomGrove").biomeID, 700, EnumTag.WOOD, true, true);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("coniferousForest").biomeID, 650, EnumTag.WOOD, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("crag").biomeID, 300, EnumTag.ROCK, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("deadForest").biomeID, 400, EnumTag.DEATH, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("deadSwamp").biomeID, 300, EnumTag.DEATH, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("deadlands").biomeID, 150, EnumTag.FIRE, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("deciduousForest").biomeID, 700, EnumTag.WOOD, true, true);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("drylands").biomeID, 550, EnumTag.FIRE, true, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("dunes").biomeID, 350, EnumTag.FIRE, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("fen").biomeID, 450, EnumTag.WATER, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("field").biomeID, 650, EnumTag.EARTH, true, true);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("frostForest").biomeID, 600, EnumTag.WOOD, true, true);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("fungiForest").biomeID, 850, EnumTag.FUNGUS, false, true);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("garden").biomeID, 800, EnumTag.FLOWER, false, true);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("glacier").biomeID, 300, EnumTag.COLD, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("grassland").biomeID, 550, EnumTag.EARTH, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("grove").biomeID, 600, EnumTag.WOOD, false, true);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("heathland").biomeID, 600, EnumTag.WIND, true, true);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("highland").biomeID, 550, EnumTag.WIND, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("iceSheet").biomeID, 300, EnumTag.COLD, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("icyHills").biomeID, 450, EnumTag.COLD, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("jadeCliffs").biomeID, 550, EnumTag.ROCK, true, true);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("lushDesert").biomeID, 500, EnumTag.FIRE, true, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("lushSwamp").biomeID, 700, EnumTag.WATER, true, true);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("mangrove").biomeID, 700, EnumTag.WATER, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("mapleWoods").biomeID, 700, EnumTag.WOOD, true, true);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("marsh").biomeID, 600, EnumTag.WATER, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("meadow").biomeID, 600, EnumTag.PLANT, false, true);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("mesa").biomeID, 400, EnumTag.ROCK, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("moor").biomeID, 500, EnumTag.ROCK, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("mountain").biomeID, 600, EnumTag.ROCK, true, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("mysticGrove").biomeID, 650, EnumTag.MAGIC, true, true);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("oasis").biomeID, 600, EnumTag.PLANT, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("ominousWoods").biomeID, 600, EnumTag.EVIL, true, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("orchard").biomeID, 750, EnumTag.WOOD, true, true);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("originValley").biomeID, 600, EnumTag.WOOD, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("outback").biomeID, 550, EnumTag.WIND, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("pasture").biomeID, 700, EnumTag.CROP, false, true);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("prairie").biomeID, 600, EnumTag.WIND, true, true);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("promisedLand").biomeID, 800, EnumTag.LIGHT, false, true);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("quagmire").biomeID, 350, EnumTag.WATER, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("rainforest").biomeID, 700, EnumTag.PLANT, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("redwoodForest").biomeID, 600, EnumTag.WOOD, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("sacredSprings").biomeID, 550, EnumTag.WATER, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("savanna").biomeID, 500, EnumTag.WIND, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("scrubland").biomeID, 500, EnumTag.WIND, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("seasonalForest").biomeID, 600, EnumTag.WOOD, false, true);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("shield").biomeID, 650, EnumTag.WATER, true, true);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("shore").biomeID, 500, EnumTag.WATER, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("shrubland").biomeID, 500, EnumTag.WIND, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("snowyWoods").biomeID, 350, EnumTag.COLD, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("spruceWoods").biomeID, 600, EnumTag.WOOD, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("steppe").biomeID, 500, EnumTag.EARTH, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("swampwoods").biomeID, 600, EnumTag.WOOD, true, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("temperateRainforest").biomeID, 600, EnumTag.WOOD, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("thicket").biomeID, 600, EnumTag.PLANT, false, true);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("tropicalRainforest").biomeID, 700, EnumTag.WOOD, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("tropics").biomeID, 600, EnumTag.FIRE, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("tundra").biomeID, 500, EnumTag.WIND, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("volcano").biomeID, 300, EnumTag.FIRE, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("wasteland").biomeID, 200, EnumTag.DEATH, false, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("wetland").biomeID, 600, EnumTag.WATER, true, false);
		ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get("woodland").biomeID, 650, EnumTag.WOOD, true, true);
	}
}
