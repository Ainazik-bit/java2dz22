package com.company;

public class Food {

    private int age;
    private Dangerous dangerous;

    public Food(int age, Dangerous dangerous) {
        this.age = age;
        this.dangerous = dangerous;
    }

    public int getAge() {
        return age;
    }

    public Dangerous getDangerous() {
        return dangerous;
    }
}
