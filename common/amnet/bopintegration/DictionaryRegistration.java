package amnet.bopintegration;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import tdwp_ftw.biomesop.mod_BiomesOPlenty;

public class DictionaryRegistration {
	public static void register() {
		// LOGS
		if (BOPManager.checkForField("acaciaWood"))
			OreDictionary.registerOre("woodLog", new ItemStack(mod_BiomesOPlenty.acaciaWood));
		if (BOPManager.checkForField("cherryWood"))
			OreDictionary.registerOre("woodLog", new ItemStack(mod_BiomesOPlenty.cherryWood));
		if (BOPManager.checkForField("darkWood"))
			OreDictionary.registerOre("woodLog", new ItemStack(mod_BiomesOPlenty.darkWood));
		if (BOPManager.checkForField("deadWood"))
			OreDictionary.registerOre("woodLog", new ItemStack(mod_BiomesOPlenty.deadWood));
		if (BOPManager.checkForField("firWood"))
			OreDictionary.registerOre("woodLog", new ItemStack(mod_BiomesOPlenty.firWood));
		if (BOPManager.checkForField("holyWood"))
			OreDictionary.registerOre("woodLog", new ItemStack(mod_BiomesOPlenty.holyWood));
		if (BOPManager.checkForField("magicWood"))
			OreDictionary.registerOre("woodLog", new ItemStack(mod_BiomesOPlenty.magicWood));
		if (BOPManager.checkForField("mangroveWood"))
			OreDictionary.registerOre("woodLog", new ItemStack(mod_BiomesOPlenty.mangroveWood));
		if (BOPManager.checkForField("palmWood"))
			OreDictionary.registerOre("woodLog", new ItemStack(mod_BiomesOPlenty.palmWood));
		if (BOPManager.checkForField("redwoodWood"))
			OreDictionary.registerOre("woodLog", new ItemStack(mod_BiomesOPlenty.redwoodWood));
		if (BOPManager.checkForField("willowWood"))
			OreDictionary.registerOre("woodLog", new ItemStack(mod_BiomesOPlenty.willowWood));
		
		// PLANKS
		if (BOPManager.checkForField("acaciaPlank"))
			OreDictionary.registerOre("plankWood", new ItemStack(mod_BiomesOPlenty.acaciaPlank));
		if (BOPManager.checkForField("cherryPlank"))
			OreDictionary.registerOre("plankWood", new ItemStack(mod_BiomesOPlenty.cherryPlank));
		if (BOPManager.checkForField("darkPlank"))
			OreDictionary.registerOre("plankWood", new ItemStack(mod_BiomesOPlenty.darkPlank));
		if (BOPManager.checkForField("firPlank"))
			OreDictionary.registerOre("plankWood", new ItemStack(mod_BiomesOPlenty.firPlank));
		if (BOPManager.checkForField("holyPlank)"))
			OreDictionary.registerOre("plankWood", new ItemStack(mod_BiomesOPlenty.holyPlank));
		if (BOPManager.checkForField("magicPlank"))
			OreDictionary.registerOre("plankWood", new ItemStack(mod_BiomesOPlenty.magicPlank));
		if (BOPManager.checkForField("mangrovePlank"))
			OreDictionary.registerOre("plankWood", new ItemStack(mod_BiomesOPlenty.mangrovePlank));
		if (BOPManager.checkForField("palmPlank"))
			OreDictionary.registerOre("plankWood", new ItemStack(mod_BiomesOPlenty.palmPlank));
		if (BOPManager.checkForField("redwoodPlan"))
			OreDictionary.registerOre("plankWood", new ItemStack(mod_BiomesOPlenty.redwoodPlank));
		if (BOPManager.checkForField("willowPlank"))
			OreDictionary.registerOre("plankWood", new ItemStack(mod_BiomesOPlenty.willowPlank));
		
		// SLABS
		if (BOPManager.checkForField("acaciaSingleSlab"))
			OreDictionary.registerOre("slabWood", new ItemStack(mod_BiomesOPlenty.acaciaSingleSlab));
		if (BOPManager.checkForField("cherrySingleSlab"))
			OreDictionary.registerOre("slabWood", new ItemStack(mod_BiomesOPlenty.cherrySingleSlab));
		if (BOPManager.checkForField("darkSingleSlab"))
			OreDictionary.registerOre("slabWood", new ItemStack(mod_BiomesOPlenty.darkSingleSlab));
		if (BOPManager.checkForField("firSingleSlab"))
			OreDictionary.registerOre("slabWood", new ItemStack(mod_BiomesOPlenty.firSingleSlab));
		if (BOPManager.checkForField("holySingleSlab"))
			OreDictionary.registerOre("slabWood", new ItemStack(mod_BiomesOPlenty.holySingleSlab));
		if (BOPManager.checkForField("magicSingleSlab"))
			OreDictionary.registerOre("slabWood", new ItemStack(mod_BiomesOPlenty.magicSingleSlab));
		if (BOPManager.checkForField("mangroveSingleSlab"))
			OreDictionary.registerOre("slabWood", new ItemStack(mod_BiomesOPlenty.mangroveSingleSlab));
		if (BOPManager.checkForField("palmSingleSlab"))
			OreDictionary.registerOre("slabWood", new ItemStack(mod_BiomesOPlenty.palmSingleSlab));
		if (BOPManager.checkForField("redwoodSingleSlab"))
			OreDictionary.registerOre("slabWood", new ItemStack(mod_BiomesOPlenty.redwoodSingleSlab));
		if (BOPManager.checkForField("willowSingleSlab"))
			OreDictionary.registerOre("slabWood", new ItemStack(mod_BiomesOPlenty.willowSingleSlab));
		
		// STAIRS
		if (BOPManager.checkForField("acaciaStairs"))
			OreDictionary.registerOre("stairWood", new ItemStack(mod_BiomesOPlenty.acaciaStairs));
		if (BOPManager.checkForField("cherryStairs"))
			OreDictionary.registerOre("stairWood", new ItemStack(mod_BiomesOPlenty.cherryStairs));
		if (BOPManager.checkForField("darkStairs"))
			OreDictionary.registerOre("stairWood", new ItemStack(mod_BiomesOPlenty.darkStairs));
		if (BOPManager.checkForField("firStairs"))
			OreDictionary.registerOre("stairWood", new ItemStack(mod_BiomesOPlenty.firStairs));
		if (BOPManager.checkForField("holyStairs"))
			OreDictionary.registerOre("stairWood", new ItemStack(mod_BiomesOPlenty.holyStairs));
		if (BOPManager.checkForField("magicStairs"))
			OreDictionary.registerOre("stairWood", new ItemStack(mod_BiomesOPlenty.magicStairs));
		if (BOPManager.checkForField("mangroveStairs"))
			OreDictionary.registerOre("stairWood", new ItemStack(mod_BiomesOPlenty.mangroveStairs));
		if (BOPManager.checkForField("palmStair"))
			OreDictionary.registerOre("stairWood", new ItemStack(mod_BiomesOPlenty.palmStairs));
		if (BOPManager.checkForField("redwoodStairs"))
			OreDictionary.registerOre("stairWood", new ItemStack(mod_BiomesOPlenty.redwoodStairs));
		if (BOPManager.checkForField("willowStairs"))
			OreDictionary.registerOre("stairWood", new ItemStack(mod_BiomesOPlenty.willowStairs));
		
		// LEAVES
		if (BOPManager.checkForField("acaciaLeaves"))
			OreDictionary.registerOre("treeLeaves", new ItemStack(mod_BiomesOPlenty.acaciaLeaves));
		if (BOPManager.checkForField("darkLeaves"))
			OreDictionary.registerOre("treeLeaves", new ItemStack(mod_BiomesOPlenty.darkLeaves));
		if (BOPManager.checkForField("firLeaves"))
			OreDictionary.registerOre("treeLeaves", new ItemStack(mod_BiomesOPlenty.firLeaves));
		if (BOPManager.checkForField("holyLeaves"))
			OreDictionary.registerOre("treeLeaves", new ItemStack(mod_BiomesOPlenty.holyLeaves));
		if (BOPManager.checkForField("mangroveLeaves"))
			OreDictionary.registerOre("treeLeaves", new ItemStack(mod_BiomesOPlenty.mangroveLeaves));
		if (BOPManager.checkForField("palmLeaves"))
			OreDictionary.registerOre("treeLeaves", new ItemStack(mod_BiomesOPlenty.palmLeaves));
		if (BOPManager.checkForField("redwoodLeaves"))
			OreDictionary.registerOre("treeLeaves", new ItemStack(mod_BiomesOPlenty.redwoodLeaves));
		if (BOPManager.checkForField("willowLeaves"))
			OreDictionary.registerOre("treeLeaves", new ItemStack(mod_BiomesOPlenty.willowLeaves));
		if (BOPManager.checkForField("autumnLeaves"))
			OreDictionary.registerOre("treeLeaves", new ItemStack(mod_BiomesOPlenty.autumnLeaves));
		if (BOPManager.checkForField("redLeaves"))
			OreDictionary.registerOre("treeLeaves", new ItemStack(mod_BiomesOPlenty.redLeaves));
		if (BOPManager.checkForField("orangeLeaves"))
			OreDictionary.registerOre("treeLeaves", new ItemStack(mod_BiomesOPlenty.orangeLeaves));
		if (BOPManager.checkForField("pinkLeaves"))
			OreDictionary.registerOre("treeLeaves", new ItemStack(mod_BiomesOPlenty.pinkLeaves));
		if (BOPManager.checkForField("blueLeaves"))
			OreDictionary.registerOre("treeLeaves", new ItemStack(mod_BiomesOPlenty.blueLeaves));
		if (BOPManager.checkForField("whiteLeaves"))
			OreDictionary.registerOre("treeLeaves", new ItemStack(mod_BiomesOPlenty.whiteLeaves));
		if (BOPManager.checkForField("deadLeaves"))
			OreDictionary.registerOre("treeLeaves", new ItemStack(mod_BiomesOPlenty.deadLeaves));
		if (BOPManager.checkForField("appleLeaves"))
			OreDictionary.registerOre("treeLeaves", new ItemStack(mod_BiomesOPlenty.appleLeaves));
		if (BOPManager.checkForField("bambooLeaves"))
			OreDictionary.registerOre("treeLeaves", new ItemStack(mod_BiomesOPlenty.bambooLeaves));
		if (BOPManager.checkForField("originLeaves"))
			OreDictionary.registerOre("treeLeaves", new ItemStack(mod_BiomesOPlenty.originLeaves));
		if (BOPManager.checkForField("appleLeavesFruitless"))
			OreDictionary.registerOre("treeLeaves", new ItemStack(mod_BiomesOPlenty.appleLeavesFruitless));
		if (BOPManager.checkForField("redLeaves"))
			OreDictionary.registerOre("treeLeaves", new ItemStack(mod_BiomesOPlenty.redLeaves));
		
		// SAPLINGS
		if (BOPManager.checkForField("acaciaSapling"))
			OreDictionary.registerOre("treeSapling", new ItemStack(mod_BiomesOPlenty.acaciaSapling));
		if (BOPManager.checkForField("darkSapling"))
			OreDictionary.registerOre("treeSapling", new ItemStack(mod_BiomesOPlenty.darkSapling));
		if (BOPManager.checkForField("firSapling"))
			OreDictionary.registerOre("treeSapling", new ItemStack(mod_BiomesOPlenty.firSapling));
		if (BOPManager.checkForField("holySapling"))
			OreDictionary.registerOre("treeSapling", new ItemStack(mod_BiomesOPlenty.holySapling));
		if (BOPManager.checkForField("magicSaplin"))
			OreDictionary.registerOre("treeSapling", new ItemStack(mod_BiomesOPlenty.magicSapling));
		if (BOPManager.checkForField("mangroveSapling"))
			OreDictionary.registerOre("treeSapling", new ItemStack(mod_BiomesOPlenty.mangroveSapling));
		if (BOPManager.checkForField("palmSapling"))
			OreDictionary.registerOre("treeSapling", new ItemStack(mod_BiomesOPlenty.palmSapling));
		if (BOPManager.checkForField("redwoodSapling"))
			OreDictionary.registerOre("treeSapling", new ItemStack(mod_BiomesOPlenty.redwoodSapling));
		if (BOPManager.checkForField("willowSapling"))
			OreDictionary.registerOre("treeSapling", new ItemStack(mod_BiomesOPlenty.willowSapling));
		if (BOPManager.checkForField("redSapling"))
			OreDictionary.registerOre("treeSapling", new ItemStack(mod_BiomesOPlenty.redSapling));
		if (BOPManager.checkForField("orangeSapling"))
			OreDictionary.registerOre("treeSapling", new ItemStack(mod_BiomesOPlenty.orangeSapling));
		if (BOPManager.checkForField("pinkSapling"))
			OreDictionary.registerOre("treeSapling", new ItemStack(mod_BiomesOPlenty.pinkSapling));
		if (BOPManager.checkForField("whiteSapling"))
			OreDictionary.registerOre("treeSapling", new ItemStack(mod_BiomesOPlenty.whiteSapling));
		if (BOPManager.checkForField("appleSapling"))
			OreDictionary.registerOre("treeSapling", new ItemStack(mod_BiomesOPlenty.appleSapling));
		if (BOPManager.checkForField("originSapling"))
			OreDictionary.registerOre("treeSapling", new ItemStack(mod_BiomesOPlenty.originSapling));
		if (BOPManager.checkForField("redSapling"))
			OreDictionary.registerOre("treeSapling", new ItemStack(mod_BiomesOPlenty.redSapling));
		if (BOPManager.checkForField("yellowSapling"))
			OreDictionary.registerOre("treeSapling", new ItemStack(mod_BiomesOPlenty.yellowSapling));
		if (BOPManager.checkForField("brownSapling"))
			OreDictionary.registerOre("treeSapling", new ItemStack(mod_BiomesOPlenty.brownSapling));
	}
}
