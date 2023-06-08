
package net.mcreator.megastones.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.megastones.init.MegastonesModTabs;

public class OrbWithoutMegaEvolutionItem extends Item {
	public OrbWithoutMegaEvolutionItem() {
		super(new Item.Properties().tab(MegastonesModTabs.TAB_MEGASTONES).stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
