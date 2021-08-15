package com.example.trees.tree;

import com.example.trees.trunk.AbstractTrunk;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ConiferTreeTest {

    @Test
    void grow() {
        ConiferTree tree = new ConiferTree();

        tree.trunk = Mockito.mock(AbstractTrunk.class);
        Mockito.doNothing().when(tree.trunk).grow();

        double heightBeforeGrow = tree.getHeight();
        tree.grow();
        assertTrue(tree.getHeight() >= heightBeforeGrow);
    }

}