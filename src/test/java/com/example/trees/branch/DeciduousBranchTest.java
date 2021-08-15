package com.example.trees.branch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DeciduousBranchTest {

    @Test
    void grow() {
        DeciduousBranch branch = new DeciduousBranch();

        int leavesBeforeGrow = branch.getLeaves();
        int branchesBeforeGrow = branch.getBranches().size();

        branch.grow();

        assertTrue(leavesBeforeGrow <= branch.getLeaves());
        assertTrue(branchesBeforeGrow <= branch.getBranches().size());
    }
}