
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.megastones.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.megastones.block.ReinforcedCloningGlassBlock;
import net.mcreator.megastones.block.NecrosmablockBlock;
import net.mcreator.megastones.block.CompressedGoldBlockBlock;
import net.mcreator.megastones.block.CompressedEmeraldBlockBlock;
import net.mcreator.megastones.block.CompressedBlockOfIronBlock;
import net.mcreator.megastones.block.CloningMachineBlock;
import net.mcreator.megastones.MegastonesMod;

public class MegastonesModBlocks {
	public static Block COMPRESSED_EMERALD_BLOCK;
	public static Block COMPRESSED_BLOCK_OF_IRON;
	public static Block NECROSMABLOCK;
	public static Block COMPRESSED_GOLD_BLOCK;
	public static Block REINFORCED_CLONING_GLASS;
	public static Block CLONING_MACHINE;

	public static void load() {
		COMPRESSED_EMERALD_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(MegastonesMod.MODID, "compressed_emerald_block"), new CompressedEmeraldBlockBlock());
		COMPRESSED_BLOCK_OF_IRON = Registry.register(Registry.BLOCK, new ResourceLocation(MegastonesMod.MODID, "compressed_block_of_iron"), new CompressedBlockOfIronBlock());
		NECROSMABLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(MegastonesMod.MODID, "necrosmablock"), new NecrosmablockBlock());
		COMPRESSED_GOLD_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(MegastonesMod.MODID, "compressed_gold_block"), new CompressedGoldBlockBlock());
		REINFORCED_CLONING_GLASS = Registry.register(Registry.BLOCK, new ResourceLocation(MegastonesMod.MODID, "reinforced_cloning_glass"), new CloningMachineBlock());
		CLONING_MACHINE = Registry.register(Registry.BLOCK, new ResourceLocation(MegastonesMod.MODID, "cloning_machine"), new ReinforcedCloningGlassBlock());
	}

	public static void clientLoad() {
		CompressedEmeraldBlockBlock.clientInit();
		CompressedBlockOfIronBlock.clientInit();
		NecrosmablockBlock.clientInit();
		CompressedGoldBlockBlock.clientInit();
		CloningMachineBlock.clientInit();
		ReinforcedCloningGlassBlock.clientInit();
	}
}
