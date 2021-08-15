package com.example.trees.branch;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

@Slf4j
public class ConiferBranch extends AbstractBranch {

    private final Set<ConiferBranch> branches;

    public ConiferBranch() {
        branches = new HashSet<>();
    }

    @Override
    public void grow() {
        int newLeaves = ThreadLocalRandom.current().nextInt(0, 100);
        log.info("{} new leaves added to branch", newLeaves);
        leaves += newLeaves;
        branches.forEach(ConiferBranch::grow);
        int addedBranches = ThreadLocalRandom.current().nextInt(5);
        log.info("{} new branches added to branch", addedBranches);
        for (int i = 0; i < addedBranches; i++) {
            branches.add(new ConiferBranch());
        }
    }

    public Set<ConiferBranch> getBranches() {
        return branches;
    }
}
