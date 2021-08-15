package com.example.trees.tree;

import com.example.trees.trunk.AbstractTrunk;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ThreadLocalRandom;

@Slf4j
public abstract class AbstractTree {

    private static final Double MAX_HEIGHT = 11500.;

    AbstractTrunk trunk;
    private Double height = 10.; //in cm

    public void grow() {
        trunk.grow();
        double growth = ThreadLocalRandom.current().nextDouble(2, 200);
        if (height + growth < MAX_HEIGHT) {
            height += growth;
            log.info("Tree grew {} cm", growth);
        } else
            height = MAX_HEIGHT;
        log.info("Tree is now {} cm tall", height);
    }

    public Double getHeight() {
        return height;
    }
}
