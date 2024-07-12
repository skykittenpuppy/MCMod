package gay.beegirl.DataGen;

import gay.beegirl.Entity.Variants.*;
import gay.beegirl.ModRegistries;
import gay.beegirl.World.ModConfiguredFeatures;
import gay.beegirl.World.ModPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class ModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModBlockLootTableProvider::new);
        pack.addProvider(ModBlockTagProvider::new);
        pack.addProvider(ModItemTagProvider::new);
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModRecipeProvider::new);
        pack.addProvider(ModVariantGenerator::new);
        pack.addProvider(ModWorldGenerator::new);
        //pack.addProvider(VanillaNamespaceRecipeProvider::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);

        registryBuilder.addRegistry(ModRegistries.CHICKEN_VARIANT_KEY, ChickenVariants::bootstrap);
        registryBuilder.addRegistry(ModRegistries.COW_VARIANT_KEY, CowVariants::bootstrap);
        registryBuilder.addRegistry(ModRegistries.DROWNED_VARIANT_KEY, DrownedVariants::bootstrap);
        registryBuilder.addRegistry(ModRegistries.GOAT_VARIANT_KEY, GoatVariants::bootstrap);
        registryBuilder.addRegistry(ModRegistries.PIG_VARIANT_KEY, PigVariants::bootstrap);
        //registryBuilder.addRegistry(ModRegistries.RABBIT_VARIANT_KEY, RabbitVariants::bootstrap);
        registryBuilder.addRegistry(ModRegistries.SHEEP_VARIANT_KEY, SheepVariants::bootstrap);
    }
}
