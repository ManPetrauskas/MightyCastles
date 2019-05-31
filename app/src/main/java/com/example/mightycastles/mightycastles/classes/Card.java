package com.example.mightycastles.mightycastles.classes;

public class Card {

   private int id;
   private String name;
   private int price_mana;
   private int price_bricks;
   private int price_weapons;
   private int calculation;
   private String use;
   private String pictureName;

    public Card(int id, String name, int price_mana, int price_bricks, int price_weapons, int calculation, String use, String pictureName) {
        this.id = id;
        this.name = name;
        this.price_mana = price_mana;
        this.price_bricks = price_bricks;
        this.price_weapons = price_weapons;
        this.calculation = calculation;
        this.use = use;
        this.pictureName = pictureName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice_mana() {
        return price_mana;
    }

    public int getPrice_bricks() {
        return price_bricks;
    }

    public int getPrice_weapons() {
        return price_weapons;
    }

    public int getCalculation() {
        return calculation;
    }

    public String getUse() {
        return use;
    }

    public String getPictureName(){
        return pictureName;
    }
}
