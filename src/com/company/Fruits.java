package com.company;

public class Fruits extends Food{

    private Color color;
    private boolean isSweet;

    public Fruits(int age, Dangerous dangerous, Color color, boolean isSweet) {
        super(age, dangerous);
        this.color = color;
        this.isSweet = isSweet;
    }

    public Color getColor() {
        return color;
    }

    public boolean isSweet() {
        return isSweet;
    }

    final void getInfo(int age, boolean isSweet){
        System.out.println();
    }

     void getInfo(int age,Boolean dangerous, boolean isSweet, Color color){
        System.out.println("возраст "+getAge());
        System.out.println("Опасность "+getDangerous().isDangerous());
        System.out.println("Вкус "+isSweet());
        System.out.println("Цвет "+getColor());

    }

}
