
package net.mcreator.savusichka.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.savusichka.init.SavusichkaModTabs;

public class SoulstainedsteelsingularityItem extends Item {
	public SoulstainedsteelsingularityItem() {
		super(new Item.Properties().tab(SavusichkaModTabs.TAB_SOVUSIATAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
