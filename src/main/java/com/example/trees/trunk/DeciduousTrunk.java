package com.example.trees.trunk;

import com.example.trees.branch.DeciduousBranch;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

@EqualsAndHashCode(callSuper = true)
@Data
@Slf4j
public class DeciduousTrunk extends AbstractTrunk {

    private Set<DeciduousBranch> branches;

    public DeciduousTrunk() {
        branches = new HashSet<>();
    }

    public void grow() {
        super.grow();
        branches.forEach(DeciduousBranch::grow);
        int addedBranches = ThreadLocalRandom.current().nextInt(10);
        log.info("{} branches were added to trunk", addedBranches);
        for (int i = 0; i < addedBranches; i++) {
            branches.add(new DeciduousBranch());
        }
    }
}
