
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.savusichka.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.savusichka.item.NeutroniumcrystalItem;
import net.mcreator.savusichka.SavusichkaMod;

public class SavusichkaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SavusichkaMod.MODID);
	public static final RegistryObject<Item> NEUTRONIUMCRYSTAL = REGISTRY.register("neutroniumcrystal", () -> new NeutroniumcrystalItem());
}
