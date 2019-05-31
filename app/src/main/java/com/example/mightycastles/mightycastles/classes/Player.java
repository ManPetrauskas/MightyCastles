package com.example.mightycastles.mightycastles.classes;

public class Player {
    private int id;
    private Card[] cardsInHand;
    private Card[] cardsInDeck;
    private Castle playerCastle;

    public Player(int id, Card[] cardsInHand, Card[] cardsInDeck, Castle playerCastle) {
        this.id = id;
        this.cardsInHand = cardsInHand;
        this.cardsInDeck = cardsInDeck;
        this.playerCastle = playerCastle;
    }

    public int getId() {
        return id;
    }

    public Card[] getCardsInHand() {
        return cardsInHand;
    }

    public Card[] getCardsInDeck() {
        return cardsInDeck;
    }

    public Castle getPlayerCastle() {
        return playerCastle;
    }

    public void setCardsInHand(Card[] cardsInHand) {
        this.cardsInHand = cardsInHand;
    }

    public void setCardsInDeck(Card[] cardsInDeck) {
        this.cardsInDeck = cardsInDeck;
    }
    public void setOneCardsInHand(Card cardsInHand,int index) {
        this.cardsInHand[index] = cardsInHand;
    }

    public void setOneCardsInDeck(Card cardsInDeck,int index) {
        this.cardsInDeck[index] = cardsInDeck;
    }

    public void setPlayerCastle(Castle playerCastle) {
        this.playerCastle = playerCastle;
    }
}
