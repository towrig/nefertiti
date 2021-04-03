package net.towrig.nefertiti.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.towrig.nefertiti.NefertitiMod;
import net.towrig.nefertiti.data.blocks.ParseableBlock;
import net.towrig.nefertiti.setup.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {

  public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
    super(gen, NefertitiMod.MOD_ID, exFileHelper);
  }

  @Override
  protected void registerStatesAndModels() {
    handleEasyBlocks();
  }

  private void handleEasyBlocks() {
    for (ParseableBlock pb : ModBlocks.blocks.keySet()) {
      simpleBlock(ModBlocks.blocks.get(pb).get());
    }
  }
}
