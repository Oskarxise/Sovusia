package net.mcreator.savusichka.procedures;

import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.coordinates.BlockPosArgument;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class EnergycommandProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments) {
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos(new Object() {
				public double getX() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "block").getX();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getX(), new Object() {
				public double getY() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "block").getY();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getY(), new Object() {
				public double getZ() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "blcok").getZ();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getZ()));
			int _amount = (int) DoubleArgumentType.getDouble(arguments, "energy");
			if (_ent != null)
				_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
		}
	}
}
