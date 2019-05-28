package com.example.mightycastles.mightycastles.classes;

public class Castle {
    private int id;
    private  String name;
    private int castleHealth;
    private int wallHealth;
    private int bricks;
    private int builders;
    private int mana;
    private int magic;
    private int weapons;
    private int blacksmith;

    public Castle(int id, String name, int castleHealth, int wallHealth, int bricks, int builders, int mana, int magic, int weapons, int blacksmith) {
        this.id = id;
        this.name = name;
        this.castleHealth = castleHealth;
        this.wallHealth = wallHealth;
        this.bricks = bricks;
        this.builders = builders;
        this.mana = mana;
        this.magic = magic;
        this.weapons = weapons;
        this.blacksmith = blacksmith;
    }
}
