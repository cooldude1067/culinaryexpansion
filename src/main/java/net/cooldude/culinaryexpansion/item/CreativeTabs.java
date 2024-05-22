package net.cooldude.culinaryexpansion.item;

import net.cooldude.culinaryexpansion.CulinaryExpansion;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CulinaryExpansion.MODID);

    public static final RegistryObject<CreativeModeTab> CULINARY_TAB = CREATIVE_MODE_TABS.register("culinaryexpansiontab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.culinaryexpansiontab"))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SAPPHIRE.get());
                    }))
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
