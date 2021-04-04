package net.towrig.nefertiti.data.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

import java.util.function.Supplier;

public class SandstoneSteps extends ParseableBlock {

  @Override
  public String getName() {
    return "sandstone_steps";
  }

  @Override
  public Supplier<Block> getSupplier() {
    return () -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.SAND).strength(0.8F));
  }

}
