
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.savusichka.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.savusichka.item.ZincsingularityItem;
import net.mcreator.savusichka.item.TerrastellsingularityItem;
import net.mcreator.savusichka.item.SoulstainedsteelsingularityItem;
import net.mcreator.savusichka.item.RubberItem;
import net.mcreator.savusichka.item.NeutroniumcrystalItem;
import net.mcreator.savusichka.item.NeutroniumcoreItem;
import net.mcreator.savusichka.item.NeutroniumcapacitorItem;
import net.mcreator.savusichka.item.InfinitycoreItem;
import net.mcreator.savusichka.item.ImossivedustItem;
import net.mcreator.savusichka.item.DraconiumsingularityItem;
import net.mcreator.savusichka.item.CapacitorinfinityItem;
import net.mcreator.savusichka.item.BloodysteelenergizedItem;
import net.mcreator.savusichka.item.AwekeneddraconiumsingularityItem;
import net.mcreator.savusichka.item.AndesitesingularityItem;
import net.mcreator.savusichka.item.AlphstalsingularityItem;
import net.mcreator.savusichka.SavusichkaMod;

public class SavusichkaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SavusichkaMod.MODID);
	public static final RegistryObject<Item> NEUTRONIUMCRYSTAL = REGISTRY.register("neutroniumcrystal", () -> new NeutroniumcrystalItem());
	public static final RegistryObject<Item> NEUTRONIUMCORE = REGISTRY.register("neutroniumcore", () -> new NeutroniumcoreItem());
	public static final RegistryObject<Item> INFINITYCORE = REGISTRY.register("infinitycore", () -> new InfinitycoreItem());
	public static final RegistryObject<Item> AWEKENEDDRACONIUMSINGULARITY = REGISTRY.register("awekeneddraconiumsingularity", () -> new AwekeneddraconiumsingularityItem());
	public static final RegistryObject<Item> ALPHSTALSINGULARITY = REGISTRY.register("alphstalsingularity", () -> new AlphstalsingularityItem());
	public static final RegistryObject<Item> DRACONIUMSINGULARITY = REGISTRY.register("draconiumsingularity", () -> new DraconiumsingularityItem());
	public static final RegistryObject<Item> TERRASTELLSINGULARITY = REGISTRY.register("terrastellsingularity", () -> new TerrastellsingularityItem());
	public static final RegistryObject<Item> ANDESITESINGULARITY = REGISTRY.register("andesitesingularity", () -> new AndesitesingularityItem());
	public static final RegistryObject<Item> ZINCSINGULARITY = REGISTRY.register("zincsingularity", () -> new ZincsingularityItem());
	public static final RegistryObject<Item> SOULSTAINEDSTEELSINGULARITY = REGISTRY.register("soulstainedsteelsingularity", () -> new SoulstainedsteelsingularityItem());
	public static final RegistryObject<Item> IMOSSIVE_DUST = REGISTRY.register("imossive_dust", () -> new ImossivedustItem());
	public static final RegistryObject<Item> RUBBER = REGISTRY.register("rubber", () -> new RubberItem());
	public static final RegistryObject<Item> BLOODY_STEEL_ENERGIZED = REGISTRY.register("bloody_steel_energized", () -> new BloodysteelenergizedItem());
	public static final RegistryObject<Item> BLOODY_STEEL_ENERGIZED_BLOCK = block(SavusichkaModBlocks.BLOODY_STEEL_ENERGIZED_BLOCK, SavusichkaModTabs.TAB_SOVUSIATAB);
	public static final RegistryObject<Item> CHARGEDDRACONIUMBLOCK = block(SavusichkaModBlocks.CHARGEDDRACONIUMBLOCK, SavusichkaModTabs.TAB_SOVUSIATAB);
	public static final RegistryObject<Item> CAPACITOR_NEUTRONIUM = REGISTRY.register("capacitor_neutronium", () -> new NeutroniumcapacitorItem());
	public static final RegistryObject<Item> CAPACITOR_INFINITY = REGISTRY.register("capacitor_infinity", () -> new CapacitorinfinityItem());
	public static final RegistryObject<Item> NEUTRONIC_SOLAR_PANEL = block(SavusichkaModBlocks.NEUTRONIC_SOLAR_PANEL, SavusichkaModTabs.TAB_SOVUSIATAB);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
