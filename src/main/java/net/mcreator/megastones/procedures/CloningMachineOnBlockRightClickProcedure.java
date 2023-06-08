package net.mcreator.megastones.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.megastones.MegastonesMod;

import java.util.Map;

public class CloningMachineOnBlockRightClickProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MegastonesMod.LOGGER.warn("Failed to load dependency entity for procedure CloningMachineOnBlockRightClick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performPrefixedCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "clear @s megastones:mew_tail");
		}
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performPrefixedCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute at @s run spawnpokemon mewtwo level=100");
		}
	}
}
