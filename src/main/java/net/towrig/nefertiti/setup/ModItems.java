package net.towrig.nefertiti.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
  public static final RegistryObject<Item> POT_FRAGMENT = Registration.ITEMS.register("pot_fragment", () ->
    new Item(new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

  public static final RegistryObject<Item> MUDDY_ARTEFACT = Registration.ITEMS.register("muddy_artefact", () ->
          new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));

  public static final RegistryObject<Item> TROWEL = Registration.ITEMS.register("trowel", () ->
          new Item(new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

  static void register() {}
}
