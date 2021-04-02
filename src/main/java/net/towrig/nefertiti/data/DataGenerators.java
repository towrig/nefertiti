package net.towrig.nefertiti.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.towrig.nefertiti.NefertitiMod;
import net.towrig.nefertiti.data.client.ModBlockStateProvider;
import net.towrig.nefertiti.data.client.ModItemModelProvider;

@Mod.EventBusSubscriber(modid = NefertitiMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {
  private DataGenerators() {}

  @SubscribeEvent
  public static void gatherData(GatherDataEvent event) {
    DataGenerator gen = event.getGenerator();
    ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

    gen.addProvider(new ModBlockStateProvider(gen, existingFileHelper));
    gen.addProvider(new ModItemModelProvider(gen, existingFileHelper));

    ModBlockTagsProvider blockTags = new ModBlockTagsProvider(gen, existingFileHelper);
    gen.addProvider(blockTags);
    gen.addProvider(new ModItemTagsProvider(gen, blockTags, existingFileHelper));
  }
}
