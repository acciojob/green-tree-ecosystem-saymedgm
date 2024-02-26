package com.driver;

public class Branch {
    private int length;
    private Leaf leaf;

    public Branch(int length, Leaf leaf) {
        this.length = length;
        this.leaf = leaf;
    }

    public int getLength() {
        return length;
    }

    public Leaf getLeaf() {
        return leaf;
    }
}