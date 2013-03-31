package amnet.bopintegration.thaumcraft;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import tdwp_ftw.biomesop.mod_BiomesOPlenty;
import thaumcraft.api.EnumTag;
import thaumcraft.api.ObjectTags;
import thaumcraft.api.ThaumcraftApi;
import amnet.bopintegration.BOPManager;
import amnet.bopintegration.Biomes;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ThaumcraftIntegration {
	public static void integrate(){
		registerBiomesInfo();
		addAspects();
		BiomeGenBase[] allBiomes = (BiomeGenBase[])Biomes.biomeListNoPromised.values().toArray(new BiomeGenBase[] { null });
		EntityRegistry.addSpawn("entBrainyZombie", 6, 1, 1, EnumCreatureType.monster, (BiomeGenBase[])Biomes.biomeListNoPromised.values().toArray(allBiomes));
	}
	
	private static void addAspects() {
		// LOGS
		if (BOPManager.checkForField("holyWood"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.holyWood.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 8).add(EnumTag.LIGHT, 2));
		if (BOPManager.checkForField("magicWood"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.magicWood.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 8).add(EnumTag.MAGIC, 2));
		if (BOPManager.checkForField("darkWood"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.darkWood.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 8).add(EnumTag.DARK, 2));
		if (BOPManager.checkForField("deadWood"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.deadWood.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 8).add(EnumTag.DEATH, 2));
		if (BOPManager.checkForField("acaciaWood"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.acaciaWood.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 8));
		if (BOPManager.checkForField("cherryWood"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.cherryWood.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 8));
		if (BOPManager.checkForField("firWood"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.firWood.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 8));
		if (BOPManager.checkForField("mangroveWood"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.mangroveWood.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 8));
		if (BOPManager.checkForField("palmWood"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.palmWood.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 8));
		if (BOPManager.checkForField("redwoodWood"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redwoodWood.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 8));
		if (BOPManager.checkForField("willowWood"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.willowWood.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 8));
		
		// PLANKS
		if (BOPManager.checkForField("holyPlank"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.holyPlank.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 2).add(EnumTag.LIGHT, 1));
		if (BOPManager.checkForField("magicPlank"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.magicPlank.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 2).add(EnumTag.MAGIC, 1));
		if (BOPManager.checkForField("darkPlank"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.darkPlank.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 2).add(EnumTag.DARK, 1));
		if (BOPManager.checkForField("acaciaPlank"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.acaciaPlank.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 2));
		if (BOPManager.checkForField("cherryPlank"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.cherryPlank.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 2));
		if (BOPManager.checkForField("firPlank"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.firPlank.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 2));
		if (BOPManager.checkForField("mangrovePlank"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.mangrovePlank.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 2));
		if (BOPManager.checkForField("palmPlank"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.palmPlank.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 2));
		if (BOPManager.checkForField("redwoodPlank"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redwoodPlank.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 2));
		if (BOPManager.checkForField("willowPlank"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.willowPlank.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 2));
				
		// LEAVES
		if (BOPManager.checkForField("holyLeaves"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.holyLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.LIGHT, 1));
		if (BOPManager.checkForField("blueLeaves"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.blueLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.MAGIC, 1));
		if (BOPManager.checkForField("darkLeaves"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.darkLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.DARK, 1));
		if (BOPManager.checkForField("deadLeave"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.deadLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.DEATH, 1));
		if (BOPManager.checkForField("appleLeaves"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.appleLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.LIFE, 1));
		if (BOPManager.checkForField("acaciaLeaves"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.acaciaLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("firLeaves"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.firLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("mangroveLeaves"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.mangroveLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("palmLeaves"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.palmLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("redwoodLeaves"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redwoodLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("willowLeaves"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.willowLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("autumnLeaves"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.autumnLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("redLeaves"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("orangeLeaves"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.orangeLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("pinkLeaves"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.pinkLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("whiteLeaves"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.whiteLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("bambooLeaves"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.bambooLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("originLeaves"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.originLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("appleLeavesFruitless"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.appleLeavesFruitless.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("redLeaves"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		
		// SAPLINGS
		if (BOPManager.checkForField("holySapling"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.holySapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2).add(EnumTag.LIGHT, 2));
		if (BOPManager.checkForField("magicSapling"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.magicSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2).add(EnumTag.MAGIC, 2));
		if (BOPManager.checkForField("darkSapling"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.darkSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2).add(EnumTag.DARK, 2));
		if (BOPManager.checkForField("brownSapling"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.brownSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2).add(EnumTag.DEATH, 2));
		if (BOPManager.checkForField("acaciaSapling"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.acaciaSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("firSapling"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.firSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("mangroveSapling"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.mangroveSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("palmSapling"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.palmSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("redwoodSapling"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redwoodSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("willowSapling"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.willowSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("redSapling"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("orangeSapling"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.orangeSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("pinkSapling"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.pinkSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("whiteSapling"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.whiteSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("appleSapling"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.appleSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("originSapling"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.originSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("redSapling"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("yellowSapling"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.yellowSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		
		// BLOCKS
		if (BOPManager.checkForField("mud"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.mud.blockID, -1, (new ObjectTags()).add(EnumTag.WATER, 3).add(EnumTag.EARTH, 6));
		if (BOPManager.checkForField("driedDirt"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.driedDirt.blockID, -1, (new ObjectTags()).add(EnumTag.DESTRUCTION, 1).add(EnumTag.EARTH, 1));
		if (BOPManager.checkForField("redRock"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redRock.blockID, -1, (new ObjectTags()).add(EnumTag.ROCK, 2));
		if (BOPManager.checkForField("ash"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.ash.blockID, -1, (new ObjectTags()).add(EnumTag.DESTRUCTION, 3).add(EnumTag.EXCHANGE, 3));
		if (BOPManager.checkForField("ashStone"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.ashStone.blockID, -1, (new ObjectTags()).add(EnumTag.ROCK, 1).add(EnumTag.EXCHANGE, 1));
		if (BOPManager.checkForField("hardIce"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.hardIce.blockID, -1, (new ObjectTags()).add(EnumTag.ROCK, 2).add(EnumTag.COLD, 2));
		if (BOPManager.checkForField("originGrass"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.originGrass.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.EARTH, 2));
		if (BOPManager.checkForField("hardSand"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.hardSand.blockID, -1, (new ObjectTags()).add(EnumTag.ROCK, 1).add(EnumTag.EARTH, 2));
		if (BOPManager.checkForField("hardDirt"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.hardDirt.blockID, -1, (new ObjectTags()).add(EnumTag.ROCK, 1).add(EnumTag.EARTH, 2));
		if (BOPManager.checkForField("holyGrass"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.holyGrass.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.EARTH, 2).add(EnumTag.LIGHT, 1));
		if (BOPManager.checkForField("holyStone"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.holyStone.blockID, -1, (new ObjectTags()).add(EnumTag.LIGHT, 1).add(EnumTag.ROCK, 2));
		if (BOPManager.checkForField("cragRock"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.cragRock.blockID, -1, (new ObjectTags()).add(EnumTag.ROCK, 2));
		if (BOPManager.checkForField("quicksand"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.quicksand.blockID, -1, (new ObjectTags()).add(EnumTag.EARTH, 2).add(EnumTag.TRAP, 4));
		if (BOPManager.checkForField("smolderingGrass"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.smolderingGrass.blockID, -1, (new ObjectTags()).add(EnumTag.EARTH, 2).add(EnumTag.FIRE, 1));
		if (BOPManager.checkForField("bambooThatching"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.bambooThatching.blockID, -1, (new ObjectTags()).add(EnumTag.WATER, 14).add(EnumTag.PLANT, 14));
		if (BOPManager.checkForField("amethystBloc"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.amethystBlock.blockID, -1, (new ObjectTags()).add(EnumTag.VALUABLE, 58).add(EnumTag.PURE, 58).add(EnumTag.CRYSTAL, 87));
		if (BOPManager.checkForField("amethystOre"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.amethystOre.blockID, -1, (new ObjectTags()).add(EnumTag.VALUABLE, 6).add(EnumTag.PURE, 6).add(EnumTag.CRYSTAL, 14).add(EnumTag.ROCK, 4));
		if (BOPManager.checkForField("redRockCobble"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redRockCobble.blockID, -1, (new ObjectTags()).add(EnumTag.DESTRUCTION, 1).add(EnumTag.ROCK, 1));
		if (BOPManager.checkForField("giantFlowerRed"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.giantFlowerRed.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4).add(EnumTag.MAGIC, 1));
		if (BOPManager.checkForField("giantFlowerStem"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.giantFlowerStem.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4).add(EnumTag.MAGIC, 1));
		if (BOPManager.checkForField("giantFlowerYellow"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.giantFlowerYellow.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4).add(EnumTag.MAGIC, 1));
		
		// ITEMS
		if (BOPManager.checkForField("amethyst"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.amethyst.itemID, -1, (new ObjectTags()).add(EnumTag.VALUABLE, 8).add(EnumTag.PURE, 8).add(EnumTag.CRYSTAL, 16));
		if (BOPManager.checkForField("barleyItem"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.barleyItem.itemID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.LIFE, 1));
		if (BOPManager.checkForField("ashes"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.ashes.itemID, -1, (new ObjectTags()).add(EnumTag.DESTRUCTION, 1).add(EnumTag.EXCHANGE, 1));
		if (BOPManager.checkForField("cattailItem"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.cattailItem.itemID, -1, (new ObjectTags()).add(EnumTag.WATER, 1).add(EnumTag.PLANT, 1));
		if (BOPManager.checkForField("bambooItem"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.bambooItem.itemID, -1, (new ObjectTags()).add(EnumTag.WATER, 2).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("mudBrick"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.mudBrick.itemID, -1, (new ObjectTags()).add(EnumTag.EARTH, 2).add(EnumTag.FIRE, 1));
		if (BOPManager.checkForField("mudBall"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.mudBall.itemID, -1, (new ObjectTags()).add(EnumTag.WATER, 1).add(EnumTag.EARTH, 2));
		if (BOPManager.checkForField("shroomPowder"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.shroomPowder.itemID, -1, (new ObjectTags()).add(EnumTag.FUNGUS, 2).add(EnumTag.DESTRUCTION, 1));
		if (BOPManager.checkForField("bopDisc"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.bopDisc.itemID, -1, (new ObjectTags()).add(EnumTag.SOUND, 12).add(EnumTag.VALUABLE, 4).add(EnumTag.CROP, 4));
		if (BOPManager.checkForField("bopDiscMud"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.bopDiscMud.itemID, -1, (new ObjectTags()).add(EnumTag.SOUND, 12).add(EnumTag.VALUABLE, 4).add(EnumTag.EARTH, 2).add(EnumTag.WATER, 2));
		
		// PLANTS
		if (BOPManager.checkForField("toadstool"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.toadstool.blockID, -1, (new ObjectTags()).add(EnumTag.FUNGUS, 4));
		if (BOPManager.checkForField("tinyCactus"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.tinyCactus.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2).add(EnumTag.WEAPON, 1));
		if (BOPManager.checkForField("holyTallGrass"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.holyTallGrass.blockID, -1, (new ObjectTags()).add(EnumTag.WIND, 1).add(EnumTag.PLANT, 1).add(EnumTag.LIGHT, 1));
		if (BOPManager.checkForField("desertSprouts"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.desertSprouts.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1));
		if (BOPManager.checkForField("duneGrass"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.duneGrass.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.WIND, 1));
		if (BOPManager.checkForField("thorn"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.thorn.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2).add(EnumTag.WEAPON, 1));
		if (BOPManager.checkForField("desertGrass"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.desertGrass.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1));
		if (BOPManager.checkForField("deadGrass"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.deadGrass.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1));
		if (BOPManager.checkForField("treeMoss"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.treeMoss.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("moss"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.moss.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("sproutItem"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.sproutItem.itemID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("bushItem"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.bushItem.itemID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		if (BOPManager.checkForField("mediumGrassItem"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.mediumGrassItem.itemID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1));
		if (BOPManager.checkForField("shortGrassItem"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.shortGrassItem.itemID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1));
		
		// FLOWERS
		if (BOPManager.checkForField("violet"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.violet.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4));
		if (BOPManager.checkForField("hydrangea"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.hydrangea.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4));
		if (BOPManager.checkForField("deathbloom"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.deathbloom.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4).add(EnumTag.DEATH, 1));
		if (BOPManager.checkForField("glowFlower"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.glowFlower.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4).add(EnumTag.LIGHT, 1));
		if (BOPManager.checkForField("whiteFlower"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.whiteFlower.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4));
		if (BOPManager.checkForField("blueFlower"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.blueFlower.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4));
		if (BOPManager.checkForField("purpleFlower"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.purpleFlower.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4));
		if (BOPManager.checkForField("orangeFlower"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.orangeFlower.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4));
		if (BOPManager.checkForField("pinkFlower"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.pinkFlower.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4));
		if (BOPManager.checkForField("tinyFlower"))
			ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.tinyFlower.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 1).add(EnumTag.PLANT, 1));
	}
	

	private static void registerBiomesInfo(){
		/* New Vanilla Biomes */
		registerBiomeInfo("desertNew", 300, EnumTag.FIRE, false, false);
		registerBiomeInfo("plainsNew", 600, EnumTag.WIND, false, true);
		registerBiomeInfo("extremeHillsNew", 500, EnumTag.ROCK, false, false);
		registerBiomeInfo("forestNew", 700, EnumTag.WOOD, true, true);
		registerBiomeInfo("taigaNew", 700, EnumTag.WIND, true, false);
		registerBiomeInfo("swamplandNew", 700, EnumTag.WATER, false, false);
		registerBiomeInfo("jungleNew", 800, EnumTag.PLANT, false, false);

		/* New Biomes */
		registerBiomeInfo("alps", 500, EnumTag.COLD, false, false);
		registerBiomeInfo("arctic", 600, EnumTag.WOOD, false, false);
		registerBiomeInfo("badlands", 300, EnumTag.FIRE, false, false);
		registerBiomeInfo("bambooForest", 600, EnumTag.PLANT, false, false);
		registerBiomeInfo("bayou", 600, EnumTag.WATER, false, false);
		registerBiomeInfo("birchForest", 700, EnumTag.WOOD, true, false);
		registerBiomeInfo("bog", 650, EnumTag.WATER, false, false);
		registerBiomeInfo("borealForest", 700, EnumTag.WOOD, true, true);
		registerBiomeInfo("canyon", 500, EnumTag.ROCK, false, false);
		registerBiomeInfo("chaparral", 550, EnumTag.PLANT, true, true);
		registerBiomeInfo("cherryBlossomGrove", 700, EnumTag.WOOD, true, true);
		registerBiomeInfo("coniferousForest", 650, EnumTag.WOOD, false, false);
		registerBiomeInfo("crag", 300, EnumTag.ROCK, false, false);
		registerBiomeInfo("deadForest", 400, EnumTag.DEATH, false, false);
		registerBiomeInfo("deadSwamp", 300, EnumTag.DEATH, false, false);
		registerBiomeInfo("deadlands", 150, EnumTag.FIRE, false, false);
		registerBiomeInfo("deciduousForest", 700, EnumTag.WOOD, true, true);
		registerBiomeInfo("drylands", 550, EnumTag.FIRE, true, false);
		registerBiomeInfo("dunes", 350, EnumTag.FIRE, false, false);
		registerBiomeInfo("fen", 450, EnumTag.WATER, false, false);
		registerBiomeInfo("field", 650, EnumTag.EARTH, true, true);
		registerBiomeInfo("frostForest", 600, EnumTag.WOOD, true, true);
		registerBiomeInfo("fungiForest", 850, EnumTag.FUNGUS, false, true);
		registerBiomeInfo("garden", 800, EnumTag.FLOWER, false, true);
		registerBiomeInfo("glacier", 300, EnumTag.COLD, false, false);
		registerBiomeInfo("grassland", 550, EnumTag.EARTH, false, false);
		registerBiomeInfo("grove", 600, EnumTag.WOOD, false, true);
		registerBiomeInfo("heathland", 600, EnumTag.WIND, true, true);
		registerBiomeInfo("highland", 550, EnumTag.WIND, false, false);
		registerBiomeInfo("iceSheet", 300, EnumTag.COLD, false, false);
		registerBiomeInfo("icyHills", 450, EnumTag.COLD, false, false);
		registerBiomeInfo("jadeCliffs", 550, EnumTag.ROCK, true, true);
		registerBiomeInfo("lushDesert", 500, EnumTag.FIRE, true, false);
		registerBiomeInfo("lushSwamp", 700, EnumTag.WATER, true, true);
		registerBiomeInfo("mangrove", 700, EnumTag.WATER, false, false);
		registerBiomeInfo("mapleWoods", 700, EnumTag.WOOD, true, true);
		registerBiomeInfo("marsh", 600, EnumTag.WATER, false, false);
		registerBiomeInfo("meadow", 600, EnumTag.PLANT, false, true);
		registerBiomeInfo("mesa", 400, EnumTag.ROCK, false, false);
		registerBiomeInfo("moor", 500, EnumTag.ROCK, false, false);
		registerBiomeInfo("mountain", 600, EnumTag.ROCK, true, false);
		registerBiomeInfo("mysticGrove", 650, EnumTag.MAGIC, true, true);
		registerBiomeInfo("oasis", 600, EnumTag.PLANT, false, false);
		registerBiomeInfo("ominousWoods", 600, EnumTag.EVIL, true, false);
		registerBiomeInfo("orchard", 750, EnumTag.WOOD, true, true);
		registerBiomeInfo("originValley", 600, EnumTag.WOOD, false, false);
		registerBiomeInfo("outback", 550, EnumTag.WIND, false, false);
		registerBiomeInfo("pasture", 700, EnumTag.CROP, false, true);
		registerBiomeInfo("prairie", 600, EnumTag.WIND, true, true);
		registerBiomeInfo("promisedLand", 800, EnumTag.LIGHT, false, true);
		registerBiomeInfo("quagmire", 350, EnumTag.WATER, false, false);
		registerBiomeInfo("rainforest", 700, EnumTag.PLANT, false, false);
		registerBiomeInfo("redwoodForest", 600, EnumTag.WOOD, false, false);
		registerBiomeInfo("sacredSprings", 550, EnumTag.WATER, false, false);
		registerBiomeInfo("savanna", 500, EnumTag.WIND, false, false);
		registerBiomeInfo("scrubland", 500, EnumTag.WIND, false, false);
		registerBiomeInfo("seasonalForest", 600, EnumTag.WOOD, false, true);
		registerBiomeInfo("shield", 650, EnumTag.WATER, true, true);
		registerBiomeInfo("shore", 500, EnumTag.WATER, false, false);
		registerBiomeInfo("shrubland", 500, EnumTag.WIND, false, false);
		registerBiomeInfo("snowyWoods", 350, EnumTag.COLD, false, false);
		registerBiomeInfo("spruceWoods", 600, EnumTag.WOOD, false, false);
		registerBiomeInfo("steppe", 500, EnumTag.EARTH, false, false);
		registerBiomeInfo("swampwoods", 600, EnumTag.WOOD, true, false);
		registerBiomeInfo("temperateRainforest", 600, EnumTag.WOOD, false, false);
		registerBiomeInfo("thicket", 600, EnumTag.PLANT, false, true);
		registerBiomeInfo("tropicalRainforest", 700, EnumTag.WOOD, false, false);
		registerBiomeInfo("tropics", 600, EnumTag.FIRE, false, false);
		registerBiomeInfo("tundra", 500, EnumTag.WIND, false, false);
		registerBiomeInfo("volcano", 300, EnumTag.FIRE, false, false);
		registerBiomeInfo("wasteland", 200, EnumTag.DEATH, false, false);
		registerBiomeInfo("wetland", 600, EnumTag.WATER, true, false);
		registerBiomeInfo("woodland", 650, EnumTag.WOOD, true, true);
	}
	
	private static void registerBiomeInfo(String name, int visLevel, EnumTag tag, boolean greatwood, boolean silverwood) {
		if (BOPManager.checkForField(name))
			ThaumcraftApi.registerBiomeInfo(Biomes.biomeList.get(name).biomeID, visLevel, tag, greatwood, silverwood);
	}
}
