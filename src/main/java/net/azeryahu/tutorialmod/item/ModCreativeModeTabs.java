package net.azeryahu.tutorialmod.item;

import net.azeryahu.tutorialmod.TutorialMod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab TUTORIAL_TAB;
    //public static CreativeModeTab TUTORIAL_TAB2;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event)
    {
        TUTORIAL_TAB = event.registerCreativeModeTab(new ResourceLocation(TutorialMod.MOD_ID, "tutorial_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.BLACK_OPAL.get()))
                        .title(Component.translatable("creativemodetab.tutorial_tab")));
        /*TUTORIAL_TAB = event.registerCreativeModeTab(new ResourceLocation(TutorialMod.MOD_ID, "tutorial_tab2"),
                builder -> builder.icon(() -> new ItemStack(ModItems."ITEM_NAME".get()))
                        .title(Component.translatable("creativemodetab.tutorial_tab")));

         */
    }
}
