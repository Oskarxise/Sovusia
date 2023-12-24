
package net.mcreator.savusichka.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.savusichka.init.SavusichkaModTabs;

public class InfinitycoreItem extends Item {
	public InfinitycoreItem() {
		super(new Item.Properties().tab(SavusichkaModTabs.TAB_SOVUSIATAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
