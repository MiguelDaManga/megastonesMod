
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.megastones.init;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.megastones.block.entity.CloningMachineBlockEntity;
import net.mcreator.megastones.MegastonesMod;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

public class MegastonesModBlockEntities {
	public static BlockEntityType<?> REINFORCED_CLONING_GLASS;

	public static void load() {
		REINFORCED_CLONING_GLASS = Registry.register(Registry.BLOCK_ENTITY_TYPE, new ResourceLocation(MegastonesMod.MODID, "reinforced_cloning_glass"),
				FabricBlockEntityTypeBuilder.create(CloningMachineBlockEntity::new, MegastonesModBlocks.REINFORCED_CLONING_GLASS).build(null));
	}
}
