package com.example.mightycastles.mightycastles.classes;

import java.util.List;

public class Player {
    private int id;
    private List<Card> cardsInHand;
    private List<Card> cardsInDeck;
    private Castle playerCastle;

    public Player(int id, List<Card> cardsInHand, List<Card> cardsInDeck, Castle playerCastle) {
        this.id = id;
        this.cardsInHand = cardsInHand;
        this.cardsInDeck = cardsInDeck;
        this.playerCastle = playerCastle;
    }

    public int getId() {
        return id;
    }

    public List<Card> getCardsInHand() {
        return cardsInHand;
    }

    public List<Card> getCardsInDeck() {
        return cardsInDeck;
    }

    public Castle getPlayerCastle() {
        return playerCastle;
    }

    public void setCardsInHand(List<Card> cardsInHand) {
        this.cardsInHand = cardsInHand;
    }

    public void setCardsInDeck(List<Card> cardsInDeck) {
        this.cardsInDeck = cardsInDeck;
    }
    public void setOneCardsInHand(Card cardsInHand,int index) {
        this.cardsInHand.set(index,cardsInHand);
    }

    public void setOneCardsInDeck(Card cardsInDeck,int index) {
        this.cardsInDeck.set(index,cardsInDeck);
    }

    public void setPlayerCastle(Castle playerCastle) {
        this.playerCastle = playerCastle;
    }
}
