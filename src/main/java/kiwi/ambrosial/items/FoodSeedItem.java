package kiwi.ambrosial.items;

import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.animal.Parrot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class FoodSeedItem extends ItemNameBlockItem {
    public FoodSeedItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public void fillItemCategory(CreativeModeTab tab, NonNullList<ItemStack> items) {
        if (this.allowdedIn(tab)) {
            items.add(new ItemStack(this));
        }
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack items, Player player, LivingEntity mob, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (!mob.isAddedToWorld() && !mob.isBaby() && mob instanceof AgeableMob && ((AgeableMob) mob).getAge() == 0) {
            if (mob instanceof Chicken) {
                if (((Chicken) mob).isInLove()) {
                    return InteractionResult.FAIL;
                } else {
                    ((Chicken) mob).setInLove(player);
                    if (!player.isCreative())
                        stack.shrink(1);
                    return InteractionResult.PASS;
                }
            }

            if (mob instanceof Parrot)
                if (!mob.isAddedToWorld()) {
                    if (!((Parrot) mob).isTame())
                        if (Math.random() <= 0.33) {
                            ((Parrot) mob).tame(player);
                            ((Parrot) mob).setInLove(player);
                        }
                    if (!player.isCreative())
                        stack.shrink(1);
                }
        }

        if (mob.isBaby()) {
            if (!player.isCreative())
                stack.shrink(1);
            ((AgeableMob) mob).ageUp((int) ((float) (-((AgeableMob) mob).getAge() / 20) * 0.1F), true);
            return InteractionResult.PASS;
        }
        return InteractionResult.FAIL;
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        BlockPos hitPos = context.getClickedPos();
        Level world = context.getLevel();
        BlockState state = world.getBlockState(hitPos);
        if (state.is(Blocks.FARMLAND)) {
            return super.useOn(context);
        }
        return InteractionResult.FAIL;
    }

}
