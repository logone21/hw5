package com.company;

public class Hero {
    private int health;
    private int damage;
    private String supers;

    public Hero(int health, int damage, String supers) {
        this.health = health;
        this.damage = damage;
        this.supers = supers;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSupers() {
        return supers;
    }
}
