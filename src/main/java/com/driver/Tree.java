package com.driver;

import java.util.ArrayList;
import java.util.List;

public class Tree {
	private String name;
    private List<Branch> branches;

    public Tree(String name) {
        // your code goes here
    }

    public void addBranch(int length, Leaf leaf) {
        // your code goes here
    }

    public List<Branch> getBranches() {
    	// your code goes here
        return branches;
    }
    
    public String getName() {
    	// your code goes here
    	return name;
    }
}
