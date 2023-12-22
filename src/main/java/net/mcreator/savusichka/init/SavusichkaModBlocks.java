
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.savusichka.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.savusichka.block.SdsdsdsBlock;
import net.mcreator.savusichka.block.BlcokBlock;
import net.mcreator.savusichka.SavusichkaMod;

public class SavusichkaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SavusichkaMod.MODID);
	public static final RegistryObject<Block> BLCOK = REGISTRY.register("blcok", () -> new BlcokBlock());
	public static final RegistryObject<Block> SDSDSDS = REGISTRY.register("sdsdsds", () -> new SdsdsdsBlock());
}
