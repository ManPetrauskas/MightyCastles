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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCastleHealth() {
        return castleHealth;
    }

    public int getWallHealth() {
        return wallHealth;
    }

    public int getBricks() {
        return bricks;
    }

    public int getBuilders() {
        return builders;
    }

    public int getMana() {
        return mana;
    }

    public int getMagic() {
        return magic;
    }

    public int getWeapons() {
        return weapons;
    }

    public int getBlacksmith() {
        return blacksmith;
    }

    public void setCastleHealth(int castleHealth) {
        this.castleHealth = castleHealth;
    }

    public void setWallHealth(int wallHealth) {
        this.wallHealth = wallHealth;
    }

    public void setBricks(int bricks) {
        this.bricks = bricks;
    }

    public void setBuilders(int builders) {
        this.builders = builders;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setWeapons(int weapons) {
        this.weapons = weapons;
    }

    public void setBlacksmith(int blacksmith) {
        this.blacksmith = blacksmith;
    }
}
