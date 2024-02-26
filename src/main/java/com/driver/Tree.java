package com.driver;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private String name;
    private List<Branch> branches;

    public Tree(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public void addBranch(int length, Leaf leaf) {
        branches.add(new Branch(length, leaf));
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public String getName() {
        return name;
    }
}