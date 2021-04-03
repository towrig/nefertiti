package net.towrig.nefertiti.setup;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.towrig.nefertiti.data.blocks.ParseableBlock;
import net.towrig.nefertiti.data.blocks.SandstoneSteps;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ModBlocks {

  public static Map<ParseableBlock, RegistryObject<Block>> blocks;

  //add new blocks here.
  static void register() {
    blocks = new HashMap<>();
    blocks.put(new SandstoneSteps(), register(new SandstoneSteps()));
  }

  private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
    //creates Block
    RegistryObject<T> blockReg = Registration.BLOCKS.register(name, block);

    //creates Item representation of Block
    Registration.ITEMS.register(name, () -> new BlockItem(blockReg.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    return blockReg;
  }

  private static RegistryObject<Block> register(ParseableBlock block) {
    //creates Block
    RegistryObject<Block> blockReg = Registration.BLOCKS.register(block.getName(), block.getSupplier());

    //creates Item representation of Block
    Registration.ITEMS.register(block.getName(), () -> new BlockItem(blockReg.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    return blockReg;
  }

}
