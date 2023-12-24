
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.savusichka.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SavusichkaModTabs {
	public static CreativeModeTab TAB_SOVUSIATAB;

	public static void load() {
		TAB_SOVUSIATAB = new CreativeModeTab("tabsovusiatab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SavusichkaModItems.INFINITYCORE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
