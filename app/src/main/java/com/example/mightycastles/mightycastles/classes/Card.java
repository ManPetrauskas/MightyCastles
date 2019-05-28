package com.example.mightycastles.mightycastles.classes;

public class Card {

   private int id;
   private String name;
   private int mana;
   private int bricks;
   private int weapons;

    public Card(int id, String name, int mana, int bricks, int weapons) {
        this.id = id;
        this.name = name;
        this.mana = mana;
        this.bricks = bricks;
        this.weapons = weapons;
    }
}
