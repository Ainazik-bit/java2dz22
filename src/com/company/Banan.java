package com.company;

public final class Banan extends Fruits{

    private String fresh;

    public Banan(int age, Dangerous dangerous, Color color, boolean isSweet, String fresh) {
        super(age, dangerous, color, isSweet);
        this.fresh = fresh;
    }

    public String getFresh() {
        return fresh;
    }

    @Override
    void getInfo(int age, Boolean dangerous, boolean isSweet, Color color) {
        super.getInfo(age, dangerous, isSweet, color);
        System.out.println("Свежость "+getFresh());

    }
}

