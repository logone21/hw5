package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(800);
        boss.setDamage(80);
        boss.setTypeOfBlock("Сильная");
        System.out.println("Health " + boss.getHealth() + "Damage " + boss.getDamage() + "Тип защиты " + boss.getTypeOfBlock());
        createHero();
        for (int i = 0; i < createHero().length; i++) {
            System.out.println("Health " + createHero()[i].getHealth() + " Damage " + createHero()[i].getDamage() + " Supers" + createHero()[i].getSupers());
        }
    }

    public static Hero[] createHero() {
        Hero spiderMan = new Hero(400, 60, "Паутина");
        Hero ironMan = new Hero(500, 120, "Mark2");
        Hero blackWidow = new Hero(300, 30);
        Hero[] avengers = {spiderMan, ironMan, blackWidow};
        return avengers;
    }
}
