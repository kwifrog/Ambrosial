package kiwi.ambrosial.registry;

import kiwi.ambrosial.Ambrosial;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.RegistryObject;

@Mod.EventBusSubscriber(modid = Ambrosial.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AmbrosialSounds {

    public static final RegistryObject<SoundEvent> ITEM_KIWI_PICK_FROM_BUSH = RegistryHandler.SOUNDS.register("item.kiwi.pick_from_bush",
            () -> new SoundEvent(new ResourceLocation(Ambrosial.MODID, "item.kiwi.pick_from_bush")));

    public static void register() {

    }
}
