package net.towrig.nefertiti.data;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.towrig.nefertiti.NefertitiMod;
import net.towrig.nefertiti.setup.ModBlocks;

public class ModBlockTagsProvider extends BlockTagsProvider {

  public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
    super(generatorIn, NefertitiMod.MOD_ID, existingFileHelper);
  }

  @Override
  protected void registerTags() {
    getOrCreateBuilder(Tags.Blocks.SANDSTONE).add(ModBlocks.SANDSTONE_STEPS.get());
  }
}
