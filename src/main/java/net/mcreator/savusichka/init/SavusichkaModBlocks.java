
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.savusichka.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.savusichka.block.ChargeddraconiumblockBlock;
import net.mcreator.savusichka.block.BloodysteelenergizedblockBlock;
import net.mcreator.savusichka.SavusichkaMod;

public class SavusichkaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SavusichkaMod.MODID);
	public static final RegistryObject<Block> BLOODY_STEEL_ENERGIZED_BLOCK = REGISTRY.register("bloody_steel_energized_block", () -> new BloodysteelenergizedblockBlock());
	public static final RegistryObject<Block> CHARGEDDRACONIUMBLOCK = REGISTRY.register("chargeddraconiumblock", () -> new ChargeddraconiumblockBlock());
}
