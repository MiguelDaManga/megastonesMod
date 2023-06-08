
package net.mcreator.megastones.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.megastones.init.MegastonesModTabs;

public class AshGreninjaItem extends Item {
	public AshGreninjaItem() {
		super(new Item.Properties().tab(MegastonesModTabs.TAB_MEGASTONES).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
