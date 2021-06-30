package com.kiwi.ambrosial.registry;

import com.kiwi.ambrosial.Ambrosial;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Ambrosial.MODID);

    public static final RegistryObject<SoundEvent> ITEM_KIWI_PICK_FROM_BUSH = SOUNDS.register("item.kiwi.pick_from_bush",
            () -> new SoundEvent(new ResourceLocation(Ambrosial.MODID, "item.kiwi.pick_from_bush")));
}
