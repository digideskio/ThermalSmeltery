package us.drullk.thermalsmeltery.common.blocks;

import us.drullk.thermalsmeltery.common.items.ItemBlockSmeltery;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static BlockMachine blockMachine;

    private ModBlocks()
    {
    }

    public static void preInit()
    {
    }

    public static void initialize()
    {
        blockMachine = new BlockMachine();
        GameRegistry.registerBlock(blockMachine, ItemBlockSmeltery.class, "SmelteryMachine");
        blockMachine.initialize();

    }

    public static void postInit()
    {
        blockMachine.postInit();
    }
}
