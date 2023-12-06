package org.flora.trees;

public class TestTree {
    public static void main(String[] args) {
        Tree drzewo1 = new Tree("Brzoza", "Zielony", false);
        Tree drzewo2 = new Tree();
        System.out.println(drzewo1.toString());
        System.out.println(drzewo1.equals(drzewo2));
        System.out.println(drzewo1.hashCode());
        System.out.println(drzewo1.species());
        System.out.println(drzewo1.leafColor());
        System.out.println(drzewo1.isEvergreen());
    }
}
