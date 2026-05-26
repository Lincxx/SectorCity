package org.example;

public class Player {
    private String name;
    private int healthPoints;
    private int damage;
    private int defense;

    public Player(String name, int healthPoints, int damage, int defense) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.damage = damage;
        this.defense = defense;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getDamage() {
        return damage;
    }

    public int getDefense() {
        return defense;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPoints=" + healthPoints +
                ", damage=" + damage +
                ", defense=" + defense +
                '}';
    }
}
