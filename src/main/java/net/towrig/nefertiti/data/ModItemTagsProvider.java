package net.towrig.nefertiti.data;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.towrig.nefertiti.NefertitiMod;
import net.towrig.nefertiti.setup.ModTags;

import javax.annotation.Nullable;

public class ModItemTagsProvider extends ItemTagsProvider {


  public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
    super(dataGenerator, blockTagProvider, NefertitiMod.MOD_ID, existingFileHelper);
  }

  @Override
  protected void registerTags() {
    copy(Tags.Blocks.SANDSTONE, Tags.Items.SANDSTONE);
  }
}
