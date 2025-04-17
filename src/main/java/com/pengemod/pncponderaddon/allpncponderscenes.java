package com.pengemod.pncponderaddon;

import net.createmod.ponder.api.registration.PonderPlugin;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.createmod.ponder.api.registration.PonderTagRegistrationHelper;
import net.createmod.ponder.api.PonderPalette;

import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import me.desht.pneumaticcraft.common.registry.ModBlocks;
import me.desht.pneumaticcraft.common.registry.ModBlocks;
import me.desht.pneumaticcraft.common.registry.ModItems;
import me.desht.pneumaticcraft.common.registry.ModFluids;
import me.desht.pneumaticcraft.common.registry.ModSounds;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

import me.desht.pneumaticcraft.common.registry.ModBlocks;
import net.createmod.ponder.api.level.PonderLevel;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.createmod.ponder.api.registration.PonderTagRegistrationHelper;
import net.createmod.ponder.api.registration.SharedTextRegistrationHelper;
import net.createmod.ponder.api.registration.IndexExclusionHelper;
import net.createmod.ponder.api.scene.SceneBuilder;
import net.createmod.ponder.api.scene.SceneBuildingUtil;
import net.minecraft.resources.ResourceLocation;
import net.createmod.ponder.api.level.PonderLevel;
import net.createmod.ponder.api.registration.IndexExclusionHelper;
import net.createmod.ponder.api.registration.PonderPlugin;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.createmod.ponder.api.registration.PonderTagRegistrationHelper;
import net.createmod.ponder.api.registration.SharedTextRegistrationHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.core.registries.BuiltInRegistries;

import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.entry.ItemProviderEntry;
import com.tterrag.registrate.util.entry.RegistryEntry;




public class allpncponderscenes {

    public static void register(PonderSceneRegistrationHelper<ResourceLocation> helper) {
        ResourceLocation valveId = BuiltInRegistries.BLOCK.getKey(ModBlocks.PRESSURE_CHAMBER_VALVE.get());

        helper.forComponents(valveId)
              .addStoryBoard("pressure_chamber_basic", allpncponderscenes::pressureChamberScene);
    }

    public static void pressureChamberScene(SceneBuilder scene, SceneBuildingUtil util) {
    scene.title("pressure_chamber_basic", "Pressure Chamber Basics");

    // Aligns the baseplate size and camera position
    scene.configureBasePlate(0, 0, 5);

    // Shows the structure in the .nbt file one layer at a time
    scene.world().showSection(util.select().fromTo(0, 1, 0, 4, 3, 4), Direction.NORTH);


    scene.idle(20);

    scene.overlay().showText(60)
        .text("This is a PneumaticCraft Pressure Chamber Valve.")
        .placeNearTarget();
}
    }
		