package kiwi.ambrosial.items;

import net.minecraft.core.NonNullList;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Rabbit;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class FoodRabbitItem extends Item {
    public FoodRabbitItem(Properties properties) {
        super(properties);
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
            if (mob instanceof Rabbit) {
                if (((Rabbit) mob).isInLove()) {
                    return InteractionResult.FAIL;
                } else {
                    ((Rabbit) mob).setInLove(player);
                    if (!player.isCreative())
                        stack.shrink(1);
                    return InteractionResult.PASS;
                }
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
}    
