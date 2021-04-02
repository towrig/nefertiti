package net.towrig.nefertiti.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
  public static final RegistryObject<Item> POT_FRAGMENT = Registration.ITEMS.register("pot_fragment", () ->
    new Item(new Item.Properties().group(ItemGroup.DECORATIONS)));

  static void register() {}
}
