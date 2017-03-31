package nate.TestMod.proxy;

import nate.TestMod.init.TestItems;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		super.preInit(event);
		//Inits
		TestItems.init();
	}
	@Override
	public void init(FMLInitializationEvent event)
	{
		super.init(event);
		//RegisterRenders
		TestItems.registereRenders();
	}
	@Override
	public void postInit(FMLPostInitializationEvent event)
	{
		super.postInit(event);
		//
	}

}
