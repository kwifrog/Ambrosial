package kiwi.ambrosial.entity.ai;

import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.item.crafting.Ingredient;

public class ExtraTemptation extends TemptGoal {
    public ExtraTemptation(PathfinderMob creature, double speed, Ingredient ingredient, boolean bool) {
        super(creature, speed, ingredient, bool);
    }
}
