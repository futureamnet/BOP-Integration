package amnet.bopintegration.forestry;

import amnet.bopintegration.BOPManager;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.liquids.LiquidStack;
import tdwp_ftw.biomesop.mod_BiomesOPlenty;
import forestry.api.core.ItemInterface;
import forestry.api.recipes.RecipeManagers;

public class ForestryIntegration {
	public static void integrate(){
		addRecipes();
	}
	
	private static void addRecipes() {
		if (BOPManager.checkForField("acaciaSapling"))
			addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.acaciaSapling));
		if (BOPManager.checkForField("darkSapling"))
			addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.darkSapling));
		if (BOPManager.checkForField("firSapling"))
			addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.firSapling));
		if (BOPManager.checkForField("holySapling"))
			addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.holySapling));
		if (BOPManager.checkForField("magicSapling"))
			addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.magicSapling));
		if (BOPManager.checkForField("mangroveSaplin"))
			addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.mangroveSapling));
		if (BOPManager.checkForField("palmSapling"))
			addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.palmSapling));
		if (BOPManager.checkForField("redwoodSapling"))
			addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.redwoodSapling));
		if (BOPManager.checkForField("willowSapling"))
			addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.willowSapling));
		if (BOPManager.checkForField("redSapling"))
			addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.redSapling));
		if (BOPManager.checkForField("orangeSapling"))
			addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.orangeSapling));
		if (BOPManager.checkForField("pinkSapling"))
			addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.pinkSapling));
		if (BOPManager.checkForField("whiteSaplin"))
			addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.whiteSapling));
		if (BOPManager.checkForField("appleSapling"))
			addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.appleSapling));
		if (BOPManager.checkForField("originSapling"))
			addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.originSapling));
		if (BOPManager.checkForField("redSapling"))
			addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.redSapling));
		if (BOPManager.checkForField("yellowSapling"))
			addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.yellowSapling));
		if (BOPManager.checkForField("brownSapling"))
			addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.brownSapling));
	}
	
	private static void addFermenterRecipeSapling(ItemStack resource) {
		RecipeManagers.fermenterManager.addRecipe(resource, 800, 1.0f, 
				new LiquidStack(ItemInterface.getItem("liquidBiomass").itemID, 1, ItemInterface.getItem("liquidBiomass").getItemDamage()), 
				new LiquidStack(Block.waterStill, 1));
		RecipeManagers.fermenterManager.addRecipe(resource, 800, 1.5f, 
				new LiquidStack(ItemInterface.getItem("liquidBiomass").itemID, 1, ItemInterface.getItem("liquidBiomass").getItemDamage()), 
				new LiquidStack(ItemInterface.getItem("liquidJuice").itemID, 1, ItemInterface.getItem("liquidJuice").getItemDamage()));
		RecipeManagers.fermenterManager.addRecipe(resource, 800, 1.5f, 
				new LiquidStack(ItemInterface.getItem("liquidBiomass").itemID, 1, ItemInterface.getItem("liquidBiomass").getItemDamage()), 
				new LiquidStack(ItemInterface.getItem("liquidHoney").itemID, 1, ItemInterface.getItem("liquidHoney").getItemDamage()));
	}
}
