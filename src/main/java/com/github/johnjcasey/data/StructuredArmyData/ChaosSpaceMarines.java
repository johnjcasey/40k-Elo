package com.github.johnjcasey.data.StructuredArmyData;

import java.util.List;

public class ChaosSpaceMarines implements StructuredArmyData.FactionData {

    public static ChaosSpaceMarines INSTANCE = new ChaosSpaceMarines();

    private ChaosSpaceMarines() {
    }

    @Override
    public Class<? extends StructuredArmyData.DetachmentList> getDetachments() {
        return Detachments.class;
    }

    @Override
    public Class<? extends StructuredArmyData.DataSheetList> getDataSheets() {
        return DataSheets.class;
    }

    enum Detachments implements StructuredArmyData.DetachmentList {
        Slaves_to_Darkness("Slaves to Darkness", List.of("Eye of Tzeentch", "Intoxicating Elixir", "Liber Hereticus", "Orbs of Unlife", "Talisman of Burning Blood"));

        public final String name;

        public final List<String> enhancements;

        @Override
        public String getName() {
            return name;
        }

        @Override
        public List<String> getEnhancements() {
            return enhancements;
        }


        Detachments(String name, List<String> enhancements) {
            this.name = name;
            this.enhancements = enhancements;
        }
    }

    public enum DataSheets implements StructuredArmyData.DataSheetList {
        Abaddon_the_Despoiler("Abaddon the Despoiler"),
        Accursed_Cultists("Accursed Cultists"),
        Chaos_Bikers("Chaos Bikers"),
        Chaos_Land_Raider("Chaos Land Raider"),
        Chaos_Lord("Chaos Lord"),
        Chaos_Lord_in_Terminator_Armour("Chaos Lord in Terminator Armour"),
        Chaos_Predator_Annihilator("Chaos Predator Annihilator"),
        Chaos_Predator_Destructor("Chaos Predator Destructor"),
        Chaos_Rhino("Chaos Rhino"),
        Chaos_Spawn("Chaos Spawn"),
        Chaos_Terminator_Squad("Chaos Terminator Squad"),
        Chaos_Vindicator("Chaos Vindicator"),
        Chosen("Chosen"),
        Cultist_Mob("Cultist Mob"),
        Cypher("Cypher"),
        Dark_Apostle("Dark Apostle"),
        Dark_Commune("Dark Commune"),
        Defiler("Defiler"),
        Exalted_Champion("Exalted Champion"),
        Fabius_Bile("Fabius Bile"),
        Fellgor_Beastmen("Fellgor Beastmen"),
        Forgefiend("Forgefiend"),
        Haarken_Worldclaimer("Haarken Worldclaimer"),
        Havocs("Havocs"),
        Helbrute("Helbrute"),
        Heldrake("Heldrake"),
        Heretic_Astartes_Daemon_Prince("Heretic Astartes Daemon Prince"),
        Heretic_Astartes_Daemon_Prince_with_Wings("Heretic Astartes Daemon Prince with Wings"),
        Huron_Blackheart("Huron Blackheart"),
        Khorne_Lord_of_Skulls("Khorne Lord of Skulls"),
        Legionaries("Legionaries"),
        Lord_Discordant_on_Helstalker("Lord Discordant on Helstalker"),
        Lucius_the_Eternal("Lucius the Eternal"),
        Master_of_Executions("Master of Executions"),
        Master_of_Possession("Master of Possession"),
        Maulerfiend("Maulerfiend"),
        Noctilith_Crown("Noctilith Crown"),
        Noise_Marines("Noise Marines"),
        Obliterators("Obliterators"),
        Possessed("Possessed"),
        Raptors("Raptors"),
        Sorcerer("Sorcerer"),
        Sorcerer_in_Terminator_Armour("Sorcerer in Terminator Armour"),
        Traitor_Enforcer("Traitor Enforcer"),
        Traitor_Guardsmen_Squad("Traitor Guardsmen Squad"),
        Vashtorr_the_Arkifane("Vashtorr the Arkifane"),
        Venomcrawler("Venomcrawler"),
        Warp_Talons("Warp Talons"),
        Warpsmith("Warpsmith");

        public String name;

        DataSheets(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }
}