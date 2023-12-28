
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.savusichka.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.savusichka.block.entity.NeutroniumsolarpanelBlockEntity;
import net.mcreator.savusichka.SavusichkaMod;

public class SavusichkaModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, SavusichkaMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> NEUTRONIUM_SOLAR_PANEL = register("neutronium_solar_panel", SavusichkaModBlocks.NEUTRONIUM_SOLAR_PANEL, NeutroniumsolarpanelBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
