package com.example.trees.trunk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DeciduousTrunkTest {

    @Test
    void grow() {
        DeciduousTrunk trunk = new DeciduousTrunk();

        double circumferenceBeforeGrow = trunk.getCircumference();
        int branchesBeforeGrow = trunk.getBranches().size();

        trunk.grow();

        assertTrue(circumferenceBeforeGrow <= trunk.getCircumference());
        assertTrue(branchesBeforeGrow <= trunk.getBranches().size());
    }
}