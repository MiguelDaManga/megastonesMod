
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.megastones.init;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.megastones.world.inventory.GUIMenu;
import net.mcreator.megastones.client.gui.GUIScreen;
import net.mcreator.megastones.MegastonesMod;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;

public class MegastonesModMenus {
	public static MenuType<GUIMenu> GUI;

	public static void load() {
		GUI = Registry.register(Registry.MENU, new ResourceLocation(MegastonesMod.MODID, "gui"), new ExtendedScreenHandlerType<>(GUIMenu::new));
		GUIScreen.screenInit();
	}
}
