package com.example.trees.trunk;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ThreadLocalRandom;

@Slf4j
public abstract class AbstractTrunk {

    private Double circumference = 1.;  //in cm

    public void grow() {
        double growth = ThreadLocalRandom.current().nextDouble(0.5, 5.);
        log.info("Trunk circumference grew by {} cm", growth);
        circumference += growth;
        log.info("Trunk circumference is now {} cm", circumference);
    }

    public Double getCircumference() {
        return circumference;
    }
}
