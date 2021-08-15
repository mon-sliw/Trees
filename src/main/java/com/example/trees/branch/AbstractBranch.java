package com.example.trees.branch;

public abstract class AbstractBranch {

    Integer leaves = 0;

    public abstract void grow();

    public Integer getLeaves() {
        return leaves;
    }
}
