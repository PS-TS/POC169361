package com.adventure.park;

public class TestAttraction {
    public static void main(String[] args){
        Attraction atr = new Attraction(3);
        System.out.println(atr.getDuration());
        atr.setDuration(300);
        System.out.println(atr.getDuration());
        atr.setDuration(30);
        System.out.println(atr.getDuration());
    }
}
