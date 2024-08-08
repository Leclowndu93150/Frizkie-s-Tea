package com.leclowndu93150.tea.common;

import com.leclowndu93150.tea.registry.ItemRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.stats.Stats;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

public class CupItem extends Item {
    public CupItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 16;
    }

    /*
    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        BlockPos clickedPos = pContext.getClickedPos();
        Direction clickedFace = pContext.getClickedFace();

        BlockPos adjacentPos = clickedPos.relative(clickedFace);

        if (level.getFluidState(adjacentPos).is(FluidTags.WATER)) {
            pContext.getItemInHand().shrink(1);
            pContext.getPlayer().getInventory().add(new ItemStack(ItemRegistry.WATER_CUP.asItem()));
            return InteractionResult.SUCCESS;
        }

        return InteractionResult.PASS;
    }


     */
    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        ItemStack itemStack = pPlayer.getItemInHand(pUsedHand);

        BlockHitResult blockHitResult = getPlayerPOVHitResult(pLevel, pPlayer, ClipContext.Fluid.SOURCE_ONLY);

        if (blockHitResult.getType() == HitResult.Type.MISS || blockHitResult.getType() != HitResult.Type.BLOCK) {
            return InteractionResultHolder.pass(itemStack);
        }

        BlockPos blockPos = blockHitResult.getBlockPos();

        if (!pLevel.mayInteract(pPlayer, blockPos)) {
            return InteractionResultHolder.fail(itemStack);
        }

        if (pLevel.getFluidState(blockPos).is(FluidTags.WATER)) {
            itemStack.shrink(1);
            ItemStack filledCup = new ItemStack(ItemRegistry.WATER_CUP.asItem());

            if (!pPlayer.getInventory().add(filledCup)) {
                pPlayer.drop(filledCup, false);
            }

            pPlayer.awardStat(Stats.ITEM_USED.get(this));

            return InteractionResultHolder.sidedSuccess(itemStack, pLevel.isClientSide());
        }
        return InteractionResultHolder.pass(itemStack);
    }
}
