package org.flora.trees;

public record Tree(String species, String leafColor, boolean isEvergreen) {
    public Tree(){
        this("Unknown","Unknown",false);
    }
}
