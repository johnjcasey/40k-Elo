package com.github.johnjcasey.data.StructuredArmyData;

import java.util.List;

public class AdeptusCustodes implements StructuredArmyData.FactionData {

    public static AdeptusCustodes INSTANCE = new AdeptusCustodes();

    private AdeptusCustodes() {
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
        return List.of(StructuredArmyData.Faction.Agents_Of_The_Imperium, StructuredArmyData.Faction.Imperial_Knights);
    }

    enum Detachments implements StructuredArmyData.DetachmentList {
        Auric_Champions("Auric Champions", List.of("Blade Imperator", "Inspirational Exemplar", "Martial Philosopher", "Veiled Blade")),
        Null_Maiden_Vigil("Null Maiden Vigil", List.of("Enhanced Voidsheen Cloak", "Huntress’ Eye", "Oblivion Knight", "Raptor Blade")),
        Shield_Host("Shield Host", List.of("Auric Mantle", "Castellan’s Mark", "From the Hall of Armouries", "Panoptispex")),
        Talons_of_the_Emperor("Talons of the Emperor", List.of("Aegis Projector", "Champion of the Imperium", "Gift of Terran Artifice", "Radiant Mantle"));

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
        Aleya("Aleya"),
        Allarus_Custodians("Allarus Custodians"),
        Anathema_Psykana_Rhino("Anathema Psykana Rhino"),
        Blade_Champion("Blade Champion"),
        Custodian_Guard("Custodian Guard"),
        Custodian_Wardens("Custodian Wardens"),
        Knight_Centura("Knight-Centura"),
        Prosecutors("Prosecutors"),
        Shield_Captain("Shield-Captain"),
        Shield_Captain_in_Allarus_Terminator_Armour("Shield-Captain in Allarus Terminator Armour"),
        Shield_Captain_on_Dawneagle_Jetbike("Shield-Captain on Dawneagle Jetbike"),
        Trajann_Valoris("Trajann Valoris"),
        Valerian("Valerian"),
        Venerable_Contemptor_Dreadnought("Venerable Contemptor Dreadnought"),
        Venerable_Land_Raider("Venerable Land Raider"),
        Vertus_Praetors("Vertus Praetors"),
        Vigilators("Vigilators"),
        Witchseekers("Witchseekers"),
        Agamatus_Custodians("Agamatus Custodians"),
        Aquilon_Custodians("Aquilon Custodians"),
        Ares_Gunship("Ares Gunship"),
        Caladius_Grav_tank("Caladius Grav-tank"),
        Contemptor_Achillus_Dreadnought("Contemptor-Achillus Dreadnought"),
        Contemptor_Galatus_Dreadnought("Contemptor-Galatus Dreadnought"),
        Coronus_Grav_carrier("Coronus Grav-carrier"),
        Custodian_Guard_with_Adrasite_and_Pyrithite_Spears("Custodian Guard with Adrasite and Pyrithite Spears"),
        Orion_Assault_Dropship("Orion Assault Dropship"),
        Pallas_Grav_attack("Pallas Grav-attack"),
        Sagittarum_Custodians("Sagittarum Custodians"),
        Telemon_Heavy_Dreadnought("Telemon Heavy Dreadnought"),
        Venatari_Custodians("Venatari Custodians");

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
