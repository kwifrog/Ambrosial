package kiwi.ambrosial.events;

import kiwi.ambrosial.entity.ai.ExtraTemptation;
import kiwi.ambrosial.registry.AmbrosialItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.GroundPathNavigation;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class TemptationTask {
    private static final Ingredient SEEDS = Ingredient.of(AmbrosialItems.KIWI_SEED.get(), AmbrosialItems.RADISH_SEED.get());
    private static final Ingredient OINK = Ingredient.of(AmbrosialItems.RADISH.get());

    @SubscribeEvent
    public void onEntitySpawn(EntityJoinWorldEvent event) {
        Entity entity = event.getEntity();

        if (entity instanceof Chicken chicken) {
            if ((chicken.getNavigation() instanceof GroundPathNavigation) || (chicken.getNavigation() instanceof FlyingPathNavigation)) {
                chicken.goalSelector.addGoal(3, new ExtraTemptation(chicken, 1.0D, SEEDS, false));
            }
        }

        if (entity instanceof Pig pig) {
            if ((pig.getNavigation() instanceof  GroundPathNavigation) || (pig.getNavigation() instanceof FlyingPathNavigation)) {
                pig.goalSelector.addGoal(4, new ExtraTemptation(pig, 1.2D, OINK, false));
            }
        }
    }
}
