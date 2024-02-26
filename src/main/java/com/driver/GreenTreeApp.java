package com.driver;

import java.util.List;
import java.util.Scanner;

public class GreenTreeApp {
	public static void main(String[] args) {
        Ecosystem ecosystem = new Ecosystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Tree tree = createTree(scanner);
                    ecosystem.addTree(tree);
                    break;
                case 2:
                    displayEcosystem(ecosystem);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Choose an option:");
        System.out.println("1. Add Tree");
        System.out.println("2. Display Ecosystem");
        System.out.println("3. Exit");
    }

    public static Tree createTree(Scanner scanner) {
        System.out.println("Enter tree name: ");
        String name = scanner.next();
        Tree tree = new Tree(name);

        System.out.println("Enter the number of branches: ");
        int numBranches = scanner.nextInt();

        for (int i = 1; i <= numBranches; i++) {
            System.out.println("Enter length of branch " + i + ": ");
            int length = scanner.nextInt();

            System.out.println("Enter leaf shape for branch " + i + ": ");
            String leafShape = scanner.next();
            Leaf leaf = new Leaf(leafShape);

            tree.addBranch(length, leaf);
        }

        return tree;
    }

    public static void displayEcosystem(Ecosystem ecosystem) {
        List<Tree> trees = ecosystem.getTrees();

        for (Tree tree : trees) {
            System.out.println("Tree: " + tree.getName());
            List<Branch> branches = tree.getBranches();

            for (Branch branch : branches) {
                System.out.println("Branch Length: " + branch.getLength());
                System.out.println("Leaf Shape: " + branch.getLeaf().getShape());
            }

            System.out.println("------------------");
        }
    }
}
