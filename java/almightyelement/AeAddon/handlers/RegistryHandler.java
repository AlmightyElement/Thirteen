package almightyelement.AeAddon.handlers;

import almightyelement.AeAddon.gen.KryptoniteOreGen;
import almightyelement.AeAddon.init.ArmourInit;
import almightyelement.AeAddon.init.BlockInit;
import almightyelement.AeAddon.init.ItemInit;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegistryHandler 
{
	public static void Client()
	{	
		RecipeHandler.registerCrafting();
		RecipeHandler.registerSmelting();
	}
	
	public static void Common()
	{
		ItemInit.init();
		ItemInit.register();
		
		BlockInit.init();
		BlockInit.register();
		
		ArmourInit.init();
		ArmourInit.register();
		
		GameRegistry.registerWorldGenerator(new KryptoniteOreGen(), 0);
	}
}
