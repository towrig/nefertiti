package net.towrig.nefertiti.setup;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.towrig.nefertiti.NefertitiMod;

//TODO: define custom tags here when necessary. Refer to modding pt.2 for further info.
public class ModTags {
  public static final class Blocks {

    private static ITag.INamedTag<Block> forge(String path){
      return BlockTags.bind(new ResourceLocation("forge", path).toString());
    }

    private static ITag.INamedTag<Block> mod(String path){
      return BlockTags.bind(new ResourceLocation(NefertitiMod.MOD_ID, path).toString());
    }
  }

  public static final class Items {

    private static ITag.INamedTag<Item> forge(String path){
      return ItemTags.bind(new ResourceLocation("forge", path).toString());
    }

    private static ITag.INamedTag<Item> mod(String path){
      return ItemTags.bind(new ResourceLocation(NefertitiMod.MOD_ID, path).toString());
    }
  }
}
