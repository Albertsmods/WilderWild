package net.frozenblock.wilderwild.mixin;

import net.frozenblock.wilderwild.registry.RegisterBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.SculkVeinBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SculkVeinBlock.SculkVeinGrowChecker.class)
public class SculkVeinGrowCheckerMixin {

    @Inject(at = @At("HEAD"), method = "canGrow", cancellable = true)
    public void newBlocks(BlockView world, BlockPos pos, BlockPos growPos, Direction direction, BlockState state, CallbackInfoReturnable<Boolean> info) {
        BlockState blockState = world.getBlockState(growPos.offset(direction));
        if (blockState.isOf(RegisterBlocks.OSSEOUS_SCULK) || blockState.isOf(RegisterBlocks.SCULK_JAW)) { info.setReturnValue(false);
            info.cancel();
        }
    }

}
