package com.github.johnjcasey.data.StructuredArmyData;

import java.util.List;

public class TauEmpire implements StructuredArmyData.FactionData {

    public static TauEmpire INSTANCE = new TauEmpire();

    private TauEmpire() {
    }

    @Override
    public Class<? extends StructuredArmyData.DetachmentList> getDetachments() {
        return Detachments.class;
    }

    @Override
    public Class<? extends StructuredArmyData.DataSheetList> getDataSheets() {
        return DataSheets.class;
    }

    @Override
    public List<StructuredArmyData.Faction> getAllies() {
        return List.of();
    }

    enum Detachments implements StructuredArmyData.DetachmentList {
        Kauyon("Kauyon", List.of("Exemplar of the Kauyon", "Precision of the Patient Hunter", "Puretide Engram Neurochip", "Through Unity, Devastation", "Solid-image Projection Unit")),
        Kroot_Hunting_Pack("Kroot Hunting Pack", List.of("Borthrod Gland", "Kroothawk Flock", "Nomadic Hunter", "Root-carved Weapons")),
        //Abbreviated to "Mont" because of the unusual ’ character that GW uses probably doesn't show up consistently in apps
        Montka("Mont", List.of("Coordinated Exploitation", "Exemplar of the Mont’ka", "Strategic Conqueror", "Strike Swiftly")),
        Retaliation_Cadre("Retaliation Cadre", List.of("Internal Grenade Racks", "Prototype Weapon System", "Puretide Engram Neurochip", "Starflare Ignition System"));

        public final String name;

        public final List<String> enhancements;

        Detachments(String name, List<String> enhancements) {
            this.name = name;
            this.enhancements = enhancements;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public List<String> getEnhancements() {
            return enhancements;
        }
    }

    public enum DataSheets implements StructuredArmyData.DataSheetList {
        AunShi("Aun’Shi"),
        AunVa("Aun’Va"),
        Breacher_Team("Breacher Team"),
        Broadside_Battlesuits("Broadside Battlesuits"),
        Cadre_Fireblade("Cadre Fireblade"),
        Commander_Farsight("Commander Farsight"),
        Commander_in_Coldstar_Battlesuit("Commander in Coldstar Battlesuit"),
        Commander_in_Crisis_Battlesuit("Commander in Crisis Battlesuit"),
        Commander_in_Enforcer_Battlesuit("Commander in Enforcer Battlesuit"),
        Commander_Shadowsun("Commander Shadowsun"),
        Crisis_Battlesuits("Crisis Battlesuits"),
        Crisis_Fireknife_Battlesuits("Crisis Fireknife Battlesuits"),
        Crisis_Starscythe_Battlesuits("Crisis Starscythe Battlesuits"),
        Crisis_Sunforge_Battlesuits("Crisis Sunforge Battlesuits"),
        Darkstrider("Darkstrider"),
        Devilfish("Devilfish"),
        Ethereal("Ethereal"),
        Firesight_Team("Firesight Team"),
        Ghostkeel_Battlesuit("Ghostkeel Battlesuit"),
        Hammerhead_Gunship("Hammerhead Gunship"),
        Kroot_Carnivores("Kroot Carnivores"),
        Kroot_Farstalkers("Kroot Farstalkers"),
        Kroot_Hounds("Kroot Hounds"),
        Kroot_Shaper("Kroot Shaper"),
        Kroot_Flesh_Shaper("Kroot Flesh Shaper"),
        Kroot_Trail_Shaper("Kroot Trail Shaper"),
        Kroot_War_Shaper("Kroot War Shaper"),
        Kroot_Lone_spear("Kroot Lone-spear"),
        Krootox_Riders("Krootox Riders"),
        Krootox_Rampagers("Krootox Rampagers"),
        Longstrike("Longstrike"),
        Pathfinder_Team("Pathfinder Team"),
        Piranha("Piranha"),
        Razorshark_Strike_Fighter("Razorshark Strike Fighter"),
        Riptide_Battlesuit("Riptide Battlesuit"),
        Sky_Ray_Gunship("Sky Ray Gunship"),
        Stealth_Battlesuits("Stealth Battlesuits"),
        Stormsurge("Stormsurge"),
        Strike_Team("Strike Team"),
        Sun_Shark_Bomber("Sun Shark Bomber"),
        Tactical_Drones("Tactical Drones"),
        Tidewall_Droneport("Tidewall Droneport"),
        Tidewall_Gunrig("Tidewall Gunrig"),
        Tidewall_Shieldline("Tidewall Shieldline"),
        Vespid_Stingwings("Vespid Stingwings"),
        AX10_Tiger_Shark("AX-1-0 Tiger Shark"),
        Barracuda("Barracuda"),
        Manta("Manta"),
        Remora_Stealth_Drones("Remora Stealth Drones"),
        Rvarna_Battlesuit("R’varna Battlesuit"),
        Taunar_Supremacy_Armour("Ta’unar Supremacy Armour"),
        Tetras("Tetras"),
        Tiger_Shark("Tiger Shark"),
        Yvahra_Battlesuit("Y’vahra Battlesuit");

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