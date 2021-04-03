package net.towrig.nefertiti.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.towrig.nefertiti.NefertitiMod;
import net.towrig.nefertiti.data.blocks.ParseableBlock;
import net.towrig.nefertiti.setup.ModBlocks;

public class ModItemModelProvider extends ItemModelProvider {


  public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
    super(generator, NefertitiMod.MOD_ID, existingFileHelper);
  }

  @Override
  protected void registerModels() {
    handleEasyBlocks();

    ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
    builder(itemGenerated, "pot_fragment");
  }

  private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
    return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
  }

  private void handleEasyBlocks() {
    for (ParseableBlock pb : ModBlocks.blocks.keySet()) {
      withExistingParent(pb.getName(), modLoc("block/" + pb.getName()));
    }
  }

}
