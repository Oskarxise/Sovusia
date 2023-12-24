package net.mcreator.savusichka.procedures;

import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.coordinates.BlockPosArgument;
import net.minecraft.commands.CommandSourceStack;

import java.util.concurrent.atomic.AtomicBoolean;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class EnergycommandProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
				return _retval.get();
			}
		}.canReceiveEnergy(world, new BlockPos(new Object() {
			public double getX() {
				try {
					return BlockPosArgument.getLoadedBlockPos(arguments, "name").getX();
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return 0;
				}
			}
		}.getX(), new Object() {
			public double getY() {
				try {
					return BlockPosArgument.getLoadedBlockPos(arguments, "name").getY();
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return 0;
				}
			}
		}.getY(), new Object() {
			public double getZ() {
				try {
					return BlockPosArgument.getLoadedBlockPos(arguments, "name").getZ();
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return 0;
				}
			}
		}.getZ()))) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "name").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX(), new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "name").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY(), new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "name").getZ();
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
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent(("\u041F\u0435\u0440\u0435\u0434\u0430\u043D\u043D\u043E:" + DoubleArgumentType.getDouble(arguments, "energy"))), false);
		}
	}
}
