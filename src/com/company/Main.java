package com.company;

public class Main {

    public static void main(String[] args) {

        Dangerous dangerous = new Dangerous(true);

        Fruits objectA = new Fruits(2, dangerous, Color.RED, true);
        Banan objectB = new Banan(3,new Dangerous(false),Color.YELLOW, true, "yes");
        Banan objectC = new Banan(4,new Dangerous(true),Color.GREEN, false, "no");

        objectA.getInfo(objectA.getAge(), objectA.getDangerous().isDangerous(), objectA.isSweet(), objectA.getColor());
        System.out.println("_____________");
        objectB.getInfo(objectB.getAge(), objectB.getDangerous().isDangerous(), objectB.isSweet(), objectB.getColor());
        System.out.println("_____________");
        objectC.getInfo(objectC.getAge(), objectC.getDangerous().isDangerous(), objectC.isSweet(), objectC.getColor());
        System.out.println("_____________");


    }
}
