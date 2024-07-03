package gay.beegirl.datagen;

import gay.beegirl.CustomClasses.BerryBushBlock;
import gay.beegirl.CustomClasses.FlowerCropBlock;
import gay.beegirl.ModBlocks;
import gay.beegirl.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.CropBlock;
import net.minecraft.data.client.*;
import net.minecraft.data.client.BlockStateModelGenerator.TintType;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.SOUR_BERRY_BUSH, TintType.NOT_TINTED, BerryBushBlock.AGE, 0,1,2,3);
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.NIGHTSHADE_CROP, TintType.NOT_TINTED, FlowerCropBlock.AGE, 0,1,2);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.NIGHTSHADE, ModBlocks.POTTED_NIGHTSHADE, TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.CAMELIA_CROP, TintType.NOT_TINTED, FlowerCropBlock.AGE, 0,1,2);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CAMELIA, ModBlocks.POTTED_CAMELIA, TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.LAVENDER_CROP, TintType.NOT_TINTED, FlowerCropBlock.AGE, 0,1,2);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LAVENDER, ModBlocks.POTTED_LAVENDER, TintType.NOT_TINTED);
        blockStateModelGenerator.registerCrop(ModBlocks.VANILLA_CROP, CropBlock.AGE, 0,0,1,1,2,2,2,3);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModBlocks.SPONGE_CAKE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.CHOCOLATE_CAKE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.RED_VELVET_CAKE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.CARROT_CAKE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.PUMPKIN_PIE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.APPLE_PIE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.BERRY_PIE.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.PANCAKES.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.TREACLE_TART.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.FLAN.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModItems.BREADCRUMBS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CUSTARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLESH_JERKY, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEET_BERRY_JUICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEET_WINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOUR_BERRY_JUICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOUR_WINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOW_BERRY_JUICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOW_BERRY_WINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TUNA, Models.GENERATED);
        itemModelGenerator.register(ModItems.TUNA_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.TUNA_SPAWN_EGG, SPAWN_EGG);
        itemModelGenerator.register(ModItems.VANILLA, Models.GENERATED);
    }

    private static final Model SPAWN_EGG = new Model(Optional.of(Identifier.ofVanilla("item/template_spawn_egg")), Optional.empty());
    /*private BlockStateProvider registerPlaceableFood(PlaceableFoodBlock block, Property<Integer> ageProperty, int... ageModelIndices){
        if (ageProperty.getValues().size() != ageModelIndices.length) {
            int[] temp = new int[ageProperty.getValues().size()];
            Arrays.fill(temp, block.MAX_BITES);
            System.arraycopy(ageModelIndices, 0, temp, 0, ageModelIndices.length);
            ageModelIndices = temp;
        }
        return MultipartBlockStateSupplier.create(block)
                .with(When.create().set(ageProperty, 0),
                        BlockStateVariant.create()
                                .put(VariantSettings.MODEL, )
                .with(When.create().set(ageProperty, 1),
                        BlockStateVariant.create()
                                .put(VariantSettings.MODEL, )
                .with(When.create().set(ageProperty, 2),
                        BlockStateVariant.create()
                                .put(VariantSettings.MODEL, )
                .with(When.create().set(ageProperty, 3),
                        BlockStateVariant.create()
                                .put(VariantSettings.MODEL, ));
    }*/
}
