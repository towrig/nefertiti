package net.towrig.nefertiti.data;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.towrig.nefertiti.NefertitiMod;
import net.towrig.nefertiti.data.blocks.ParseableBlock;
import net.towrig.nefertiti.setup.ModBlocks;

public class ModBlockTagsProvider extends BlockTagsProvider {

  public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
    super(generatorIn, NefertitiMod.MOD_ID, existingFileHelper);
  }

  @Override
  protected void registerTags() {
    registerEasyBlocks();
  }

  private void registerEasyBlocks() {
    for (ParseableBlock pb : ModBlocks.blocks.keySet()) {
      getOrCreateBuilder(pb.getTag()).add(ModBlocks.blocks.get(pb).get());
    }
  }
}
