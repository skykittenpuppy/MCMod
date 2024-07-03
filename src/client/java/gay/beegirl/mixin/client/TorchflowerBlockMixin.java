package gay.beegirl.mixin.client;

import net.minecraft.block.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.shape.VoxelShape;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(TorchflowerBlock.class)
public class TorchflowerBlockMixin extends CropBlock{
	@Shadow
	public static final IntProperty AGE = Properties.AGE_2;
	@Shadow
    private static final VoxelShape[] SHAPES = new VoxelShape[]{
			Block.createCuboidShape(5.0, 0.0, 5.0, 11.0, 6.0, 11.0),
			Block.createCuboidShape(5.0, 0.0, 5.0, 11.0, 10.0, 11.0),
			Block.createCuboidShape(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)
	};
	@Inject(
			method = "withAge",
			at = @At("HEAD"),
			cancellable = true
	)
	protected void withAge(int age, CallbackInfoReturnable<BlockState> cir) {
		cir.setReturnValue(
				super.withAge(age)
		);
	}

	public TorchflowerBlockMixin(Settings settings) {
		super(settings);
	}
}