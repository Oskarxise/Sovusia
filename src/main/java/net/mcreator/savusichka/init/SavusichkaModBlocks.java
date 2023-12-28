
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.savusichka.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.savusichka.block.NeutroniumsolarpanelBlock;
import net.mcreator.savusichka.block.ChargeddraconiumblockBlock;
import net.mcreator.savusichka.block.BloodysteelenergizedblockBlock;
import net.mcreator.savusichka.SavusichkaMod;

public class SavusichkaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SavusichkaMod.MODID);
	public static final RegistryObject<Block> BLOODY_STEEL_ENERGIZED_BLOCK = REGISTRY.register("bloody_steel_energized_block", () -> new BloodysteelenergizedblockBlock());
	public static final RegistryObject<Block> CHARGEDDRACONIUMBLOCK = REGISTRY.register("chargeddraconiumblock", () -> new ChargeddraconiumblockBlock());
	public static final RegistryObject<Block> NEUTRONIUM_SOLAR_PANEL = REGISTRY.register("neutronium_solar_panel", () -> new NeutroniumsolarpanelBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			NeutroniumsolarpanelBlock.registerRenderLayer();
		}
	}
}
