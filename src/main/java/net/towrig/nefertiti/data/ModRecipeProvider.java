package net.towrig.nefertiti.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.towrig.nefertiti.setup.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator gen) {
        super(gen);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(ModItems.POT_FRAGMENT.get(), 1)
          .requires(ModItems.SANDY_ARTEFACT.get())
          .unlockedBy("has_item", has(ModItems.SANDY_ARTEFACT.get()))
          .save(consumer);
    }
}
