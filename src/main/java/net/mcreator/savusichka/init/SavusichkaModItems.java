
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.savusichka.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.savusichka.item.TerrastellsingularityItem;
import net.mcreator.savusichka.item.NeutroniumcrystalItem;
import net.mcreator.savusichka.item.NeutroniumcoreItem;
import net.mcreator.savusichka.item.InfinitycoreItem;
import net.mcreator.savusichka.item.DraconiumsingularityItem;
import net.mcreator.savusichka.item.AwekeneddraconiumsingularityItem;
import net.mcreator.savusichka.item.AlphstalsingularityItem;
import net.mcreator.savusichka.SavusichkaMod;

public class SavusichkaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SavusichkaMod.MODID);
	public static final RegistryObject<Item> AWEKENEDDRACONIUMSINGULARITY = REGISTRY.register("awekeneddraconiumsingularity", () -> new AwekeneddraconiumsingularityItem());
	public static final RegistryObject<Item> NEUTRONIUMCORE = REGISTRY.register("neutroniumcore", () -> new NeutroniumcoreItem());
	public static final RegistryObject<Item> NEUTRONIUMCRYSTAL = REGISTRY.register("neutroniumcrystal", () -> new NeutroniumcrystalItem());
	public static final RegistryObject<Item> INFINITYCORE = REGISTRY.register("infinitycore", () -> new InfinitycoreItem());
	public static final RegistryObject<Item> ALPHSTALSINGULARITY = REGISTRY.register("alphstalsingularity", () -> new AlphstalsingularityItem());
	public static final RegistryObject<Item> DRACONIUMSINGULARITY = REGISTRY.register("draconiumsingularity", () -> new DraconiumsingularityItem());
	public static final RegistryObject<Item> TERRASTELLSINGULARITY = REGISTRY.register("terrastellsingularity", () -> new TerrastellsingularityItem());
}
