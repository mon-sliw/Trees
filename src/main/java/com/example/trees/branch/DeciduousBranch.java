package com.example.trees.branch;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

@Slf4j
public class DeciduousBranch extends AbstractBranch {

    private final Set<DeciduousBranch> branches;

    public DeciduousBranch() {
        branches = new HashSet<>();
    }

    @Override
    public void grow() {
        int newLeaves = ThreadLocalRandom.current().nextInt(0, 10);
        log.info("{} new leaves added to branch", newLeaves);
        leaves += newLeaves;
        branches.forEach(DeciduousBranch::grow);
        int addedBranches = ThreadLocalRandom.current().nextInt(5);
        log.info("{} new branches added to branch", addedBranches);
        for (int i = 0; i < addedBranches; i++) {
            branches.add(new DeciduousBranch());
        }
    }

    public Set<DeciduousBranch> getBranches() {
        return branches;
    }
}