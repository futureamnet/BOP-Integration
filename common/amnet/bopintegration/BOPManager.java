package amnet.bopintegration;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import tdwp_ftw.biomesop.mod_BiomesOPlenty;

public class BOPManager {
	public static List<String> availableFields = new ArrayList<String>();
	
	public static void initialize() {
		Field[] fields = mod_BiomesOPlenty.class.getFields();
		for (Field f : fields) {
			availableFields.add(f.getName());
		}
		
		Biomes.initialize();
	}
	
	public static boolean checkForField(String name) {
		return availableFields.contains(name);
	}
}