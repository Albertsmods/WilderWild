package net.frozenblock.wilderwild.world.gen;

public class WildWorldGen {
    public static void generateWildWorldGen() {
        WildDaturaGeneration.generateFlowers();
        WildCarnationGeneration.generateFlowers();

        WildBirchGeneration.generateTrees();

    }
}
