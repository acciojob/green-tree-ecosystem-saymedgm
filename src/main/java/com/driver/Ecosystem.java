package com.driver;

import java.util.ArrayList;
import java.util.List;

public class Ecosystem {
    private List<Tree> trees;

    public Ecosystem() {
        this.trees = new ArrayList<Tree>();
    }

    public void addTree(Tree tree) {
        trees.add(tree);
    }

    public List<Tree> getTrees() {
        return trees;
    }

    public String displayEcosystem() {
        StringBuilder result = new StringBuilder();

        // Iterate over the trees in the ecosystem and append their information to the result
        for (Tree tree : trees) {
            result.append("Tree Name: ").append(tree.getName()).append("\n");

            List<Branch> branches = tree.getBranches();
            for (Branch branch : branches) {
                result.append("  Branch Length: ").append(branch.getLength()).append("\n");
                result.append("  Leaf Shape: ").append(branch.getLeaf().getShape()).append("\n");
            }
        }

        return result.toString();
    }
}