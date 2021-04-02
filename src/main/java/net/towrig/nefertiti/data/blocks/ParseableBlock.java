package net.towrig.nefertiti.data.blocks;

import net.minecraft.block.Block;

import java.util.function.Supplier;

public interface ParseableBlock {

  public Supplier<Block> getSupplier();

}
