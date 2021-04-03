package net.towrig.nefertiti.data.blocks;

import net.minecraft.block.Block;
import net.minecraft.tags.ITag;
import net.minecraftforge.common.Tags;

import java.util.function.Supplier;

public abstract class ParseableBlock {

  public String getName(){
    return "";
  }

  public Supplier<Block> getSupplier(){
    return null;
  }

  public ITag.INamedTag<Block> getTag(){
    return Tags.Blocks.SAND;
  }

}
