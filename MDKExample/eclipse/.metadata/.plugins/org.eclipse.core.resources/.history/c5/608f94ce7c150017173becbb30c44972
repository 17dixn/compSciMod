package nate.TestMod.init;

import nate.TestMod.main.Reference;
import nate.TestMod.main.TestMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.util.ResourceLocation;

public class TestItems 
{
	public static Item first_item;
	
	public static void init()
	{
		first_item = registerItem(new Item(), "first_item").setUnlocalizedName("first_item");
	}
	
	public static void registereRenders()
	{
		registerRender(first_item);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()			 //All of this
			.register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + //is one
			item.getUnlocalizedName().substring(5), "inventory")); 				 //line of code
	}
	
	
	//Register Item Start\\
	public static Item registerItem(Item item, String name)
	{
		return registerItem(item, name, null);
	}
	
	public static Item registerItem(Item item, String name, CreativeTabs tab)
	{
		GameRegistry.register(item, new ResourceLocation(Reference.MODID, name));
		return item;
	}
	//Register Item End\\
}
