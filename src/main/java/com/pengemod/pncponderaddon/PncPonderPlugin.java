package com.pengemod.pncponderaddon;

import net.createmod.ponder.api.registration.PonderPlugin;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.createmod.ponder.api.registration.PonderTagRegistrationHelper;
import net.createmod.ponder.api.PonderPalette;
import net.createmod.ponder.api.scene.SceneBuilder;
import net.createmod.ponder.api.scene.SceneBuildingUtil;

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

import com.pengemod.pncponderaddon.allpncponderscenes;








public class PncPonderPlugin implements PonderPlugin {

    @Override
    public String getModId() {
        return "pncponderaddon";
    }

    @Override
	public void registerScenes(PonderSceneRegistrationHelper<ResourceLocation> helper) {
	
    System.out.println("[PONDER DEBUG] Registering scenes...");

    	allpncponderscenes.register(helper);
	}

    @Override
    public void registerTags(PonderTagRegistrationHelper<ResourceLocation> helper) {
        // Tags will be added later. Consider compressors, machines, etc. Ref. Create/src/main/java/com/simibubi/create/infrastructure/ponder/AllCreatePonderTags.java later for inspo
    }

    @Override
    public void registerSharedText(SharedTextRegistrationHelper helper) {
        //shared text will be added later. Consider something  like "5 bar" etc. Ref.  create/foundation/ponder/CreatePonderPlugin.java for inspo
    }

    @Override
    public void indexExclusions(IndexExclusionHelper helper) {
        // Tbd. Not sure its needed
    
}}