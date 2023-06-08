
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.megastones.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class MegastonesModTabs {
	public static CreativeModeTab TAB_MEGASTONES;

	public static void load() {
		TAB_MEGASTONES = FabricItemGroupBuilder.create(new ResourceLocation("megastones", "megastones")).icon(() -> new ItemStack(MegastonesModItems.ASH_GRENINJA)).build();
	}
}
