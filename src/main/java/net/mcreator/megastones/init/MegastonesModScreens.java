
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.megastones.init;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.megastones.client.gui.GUIScreen;

public class MegastonesModScreens {
	public static void load() {
		MenuScreens.register(MegastonesModMenus.GUI, GUIScreen::new);
	}
}
