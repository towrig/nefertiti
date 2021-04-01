package net.towrig.nefertiti.setup;

import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

  public static final RegistryObject<Block> ROCK_BLOCK = Registration.BLOCKS.register("rock", () -> new Block(sandstoneProperties()));

  static void register() {}

  private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block){
    //creates Block
    RegistryObject<T> blockReg = Registration.BLOCKS.register("sandstone_steps", block);

    //creates Item representation of Block
    Registration.ITEMS.register(name, () -> new BlockItem(blockReg.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    return blockReg;
  }

  private static AbstractBlock.Properties sandstoneProperties() {
    return AbstractBlock.Properties.create(Material.ROCK, MaterialColor.SAND).func_235861_h_().hardnessAndResistance(0.8F);
  }
}
