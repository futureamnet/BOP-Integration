package amnet.bopintegration.forestry;

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
		addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.acaciaSapling));
		addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.darkSapling));
		addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.firSapling));
		addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.holySapling));
		addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.magicSapling));
		addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.mangroveSapling));
		addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.palmSapling));
		addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.redwoodSapling));
		addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.willowSapling));
		addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.redSapling));
		addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.orangeSapling));
		addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.pinkSapling));
		addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.whiteSapling));
		addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.appleSapling));
		addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.originSapling));
		addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.redSapling));
		addFermenterRecipeSapling(new ItemStack(mod_BiomesOPlenty.yellowSapling));
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
