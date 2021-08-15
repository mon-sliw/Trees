package com.example.trees.branch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ConiferBranchTest {

    @Test
    void grow() {
        ConiferBranch branch = new ConiferBranch();

        int leavesBeforeGrow = branch.getLeaves();
        int branchesBeforeGrow = branch.getBranches().size();

        branch.grow();

        assertTrue(leavesBeforeGrow <= branch.getLeaves());
        assertTrue(branchesBeforeGrow <= branch.getBranches().size());
    }
}