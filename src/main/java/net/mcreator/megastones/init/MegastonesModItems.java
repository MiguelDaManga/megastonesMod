
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.megastones.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.megastones.item.ZygardeCellItem;
import net.mcreator.megastones.item.ZapdosOrbItem;
import net.mcreator.megastones.item.UltracompressedEmeraldItem;
import net.mcreator.megastones.item.ShadowEssenceItem;
import net.mcreator.megastones.item.SHASOWCUBEItem;
import net.mcreator.megastones.item.OrbWithoutMegaEvolutionItem;
import net.mcreator.megastones.item.OmegaRubyItem;
import net.mcreator.megastones.item.NecrosmashardItem;
import net.mcreator.megastones.item.MoltresOrbItem;
import net.mcreator.megastones.item.MewTailpItem;
import net.mcreator.megastones.item.MewTailItem;
import net.mcreator.megastones.item.MarshadowArmorItem;
import net.mcreator.megastones.item.GenieLampItem;
import net.mcreator.megastones.item.EmptyOrbItem;
import net.mcreator.megastones.item.CharizardYItem;
import net.mcreator.megastones.item.CharizardXItem;
import net.mcreator.megastones.item.AshGreninjaItem;
import net.mcreator.megastones.item.ArticunoOrbItem;
import net.mcreator.megastones.item.AlphaSapphireItem;
import net.mcreator.megastones.MegastonesMod;

public class MegastonesModItems {
	public static Item CHARIZARD_Y;
	public static Item CHARIZARD_X;
	public static Item ASH_GRENINJA;
	public static Item OMEGA_RUBY;
	public static Item ALPHA_SAPPHIRE;
	public static Item ORB_WITHOUT_MEGA_EVOLUTION;
	public static Item MEW_TAIL;
	public static Item ZYGARDE_CELL;
	public static Item COMPRESSED_EMERALD_BLOCK;
	public static Item ULTRACOMPRESSED_EMERALD;
	public static Item COMPRESSED_BLOCK_OF_IRON;
	public static Item NECROSMASHARD;
	public static Item NECROSMABLOCK;
	public static Item MOLTRES_ORB;
	public static Item ARTICUNO_ORB;
	public static Item ZAPDOS_ORB;
	public static Item EMPTY_ORB;
	public static Item SHADOW_ESSENCE;
	public static Item MARSHADOW_ARMOR_CHESTPLATE;
	public static Item COMPRESSED_GOLD_BLOCK;
	public static Item GENIE_LAMP;
	public static Item REINFORCED_CLONING_GLASS;
	public static Item CLONING_MACHINE;
	public static Item SHASOWCUBE;
	public static Item MEW_TAILP;

	public static void load() {
		CHARIZARD_Y = Registry.register(Registry.ITEM, new ResourceLocation(MegastonesMod.MODID, "charizard_y"), new CharizardYItem());
		CHARIZARD_X = Registry.register(Registry.ITEM, new ResourceLocation(MegastonesMod.MODID, "charizard_x"), new CharizardXItem());
		ASH_GRENINJA = Registry.register(Registry.ITEM, new ResourceLocation(MegastonesMod.MODID, "ash_greninja"), new AshGreninjaItem());
		OMEGA_RUBY = Registry.register(Registry.ITEM, new ResourceLocation(MegastonesMod.MODID, "omega_ruby"), new OmegaRubyItem());
		ALPHA_SAPPHIRE = Registry.register(Registry.ITEM, new ResourceLocation(MegastonesMod.MODID, "alpha_sapphire"), new AlphaSapphireItem());
		ORB_WITHOUT_MEGA_EVOLUTION = Registry.register(Registry.ITEM, new ResourceLocation(MegastonesMod.MODID, "orb_without_mega_evolution"), new OrbWithoutMegaEvolutionItem());
		MEW_TAIL = Registry.register(Registry.ITEM, new ResourceLocation(MegastonesMod.MODID, "mew_tail"), new MewTailItem());
		ZYGARDE_CELL = Registry.register(Registry.ITEM, new ResourceLocation(MegastonesMod.MODID, "zygarde_cell"), new ZygardeCellItem());
		COMPRESSED_EMERALD_BLOCK = Registry.register(Registry.ITEM, new ResourceLocation(MegastonesMod.MODID, "compressed_emerald_block"),
				new BlockItem(MegastonesModBlocks.COMPRESSED_EMERALD_BLOCK, new Item.Properties().tab(MegastonesModTabs.TAB_MEGASTONES)));
		ULTRACOMPRESSED_EMERALD = Registry.register(Registry.ITEM, new ResourceLocation(MegastonesMod.MODID, "ultracompressed_emerald"), new UltracompressedEmeraldItem());
		COMPRESSED_BLOCK_OF_IRON = Registry.register(Registry.ITEM, new ResourceLocation(MegastonesMod.MODID, "compressed_block_of_iron"),
				new BlockItem(MegastonesModBlocks.COMPRESSED_BLOCK_OF_IRON, new Item.Properties().tab(MegastonesModTabs.TAB_MEGASTONES)));
		NECROSMASHARD = Registry.register(Registry.ITEM, new ResourceLocation(MegastonesMod.MODID, "necrosmashard"), new NecrosmashardItem());
		NECROSMABLOCK = Registry.register(Registry.ITEM, new ResourceLocation(MegastonesMod.MODID, "necrosmablock"), new BlockItem(MegastonesModBlocks.NECROSMABLOCK, new Item.Properties().tab(MegastonesModTabs.TAB_MEGASTONES)));
		MOLTRES_ORB = Registry.register(Registry.ITEM, new ResourceLocation(MegastonesMod.MODID, "moltres_orb"), new MoltresOrbItem());
		ARTICUNO_ORB = Registry.register(Registry.ITEM, new ResourceLocation(MegastonesMod.MODID, "articuno_orb"), new ArticunoOrbItem());
		ZAPDOS_ORB = Registry.register(Registry.ITEM, new ResourceLocation(MegastonesMod.MODID, "zapdos_orb"), new ZapdosOrbItem());
		EMPTY_ORB = Registry.register(Registry.ITEM, new ResourceLocation(MegastonesMod.MODID, "empty_orb"), new EmptyOrbItem());
		SHADOW_ESSENCE = Registry.register(Registry.ITEM, new ResourceLocation(MegastonesMod.MODID, "shadow_essence"), new ShadowEssenceItem());
		MARSHADOW_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(MegastonesMod.MODID, "marshadow_armor_chestplate"), new MarshadowArmorItem.Chestplate());
		COMPRESSED_GOLD_BLOCK = Registry.register(Registry.ITEM, new ResourceLocation(MegastonesMod.MODID, "compressed_gold_block"),
				new BlockItem(MegastonesModBlocks.COMPRESSED_GOLD_BLOCK, new Item.Properties().tab(MegastonesModTabs.TAB_MEGASTONES)));
		GENIE_LAMP = Registry.register(Registry.ITEM, new ResourceLocation(MegastonesMod.MODID, "genie_lamp"), new GenieLampItem());
		REINFORCED_CLONING_GLASS = Registry.register(Registry.ITEM, new ResourceLocation(MegastonesMod.MODID, "reinforced_cloning_glass"),
				new BlockItem(MegastonesModBlocks.REINFORCED_CLONING_GLASS, new Item.Properties().tab(MegastonesModTabs.TAB_MEGASTONES)));
		CLONING_MACHINE = Registry.register(Registry.ITEM, new ResourceLocation(MegastonesMod.MODID, "cloning_machine"), new BlockItem(MegastonesModBlocks.CLONING_MACHINE, new Item.Properties().tab(MegastonesModTabs.TAB_MEGASTONES)));
		SHASOWCUBE = Registry.register(Registry.ITEM, new ResourceLocation(MegastonesMod.MODID, "shasowcube"), new SHASOWCUBEItem());
		MEW_TAILP = Registry.register(Registry.ITEM, new ResourceLocation(MegastonesMod.MODID, "mew_tailp"), new MewTailpItem());
	}
}
