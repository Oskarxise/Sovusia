
package net.mcreator.savusichka.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class NeutroniumcrystalItem extends Item {

	public NeutroniumcrystalItem() {
		super(new Item.Properties().tab(SavusichkaModTabs.TAB_SOVUSIATAB).stacksTo(64).rarity(Rarity.COMMON));
	}

}
