
package net.mcreator.megastones.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.megastones.init.MegastonesModTabs;

public class MewTailItem extends Item {
	public MewTailItem() {
		super(new Item.Properties().tab(MegastonesModTabs.TAB_MEGASTONES).stacksTo(16).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
