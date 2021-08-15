package com.example.trees.tree;

import com.example.trees.trunk.AbstractTrunk;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DeciduousTreeTest {

    @Test
    void grow() {
        DeciduousTree tree = new DeciduousTree();

        tree.trunk = Mockito.mock(AbstractTrunk.class);
        Mockito.doNothing().when(tree.trunk).grow();

        double heightBeforeGrow = tree.getHeight();
        tree.grow();
        assertTrue(tree.getHeight() >= heightBeforeGrow);
    }
}