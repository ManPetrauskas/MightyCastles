package com.example.mightycastles;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.mightycastles.mightycastles.classes.Card;
import com.example.mightycastles.mightycastles.classes.Castle;
import com.example.mightycastles.mightycastles.classes.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gameplay extends AppCompatActivity {
    //buttons
    private Button handButton;
    private Button player1DeckButton;
    private Button player2DeckButton;
    //Card buttons
    private ImageButton cardButton1;
    private ImageButton  cardButton2;
    private ImageButton  cardButton3;
    private ImageButton  cardButton4;
    private ImageButton  cardButton5;
    private ImageButton  cardButton6;
    //Cards
    private List<Card> player1Deck;
    private List<Card> player2Deck;
    private List<Card> player1Hand;
    private List<Card> player2Hand;
    //show
    private boolean showMyHand;
    //textView
    TextView resourceText;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);
        showMyHand=false;
        //Button declaration

        this.cardButton1 = findViewById(R.id.card1Button);
        this.cardButton2 = findViewById(R.id.card2Button);
        this.cardButton3 = findViewById(R.id.card3Button);
        this.cardButton4 = findViewById(R.id.card4Button);
        this.cardButton5 = findViewById(R.id.card5Button);
        this.cardButton6 = findViewById(R.id.card6Button);

        //Buttons
        this.handButton = (Button) findViewById(R.id.showHand);
        this.handButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCardsToggle();
            }
        });

        this.player1DeckButton = (Button) findViewById(R.id.player1DeckButton);
        this.player1DeckButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player1Draw();
            }
        });

        this.player2DeckButton = (Button) findViewById(R.id.player2DeckButton);
        this.player2DeckButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player2Draw();
            }
        });

        //Card List creation
        List<Card> cardCollection = new ArrayList<Card>();
            cardCollection.add( new Card (0, "Castle", 0, 3, 0, 10, "Castle", "CastleCard"));
            cardCollection.add( new Card (1, "Drake", 21, 0, 0, -40, "Enemy_castle", "DrakeCard"));
            cardCollection.add( new Card (2, "Thief", 0, 0, 21, 20, "All_resources", "ThiefCard"));
            cardCollection.add( new Card (3, "Wall", 0, 3, 0, 10, "Wall", "WallCard"));
            cardCollection.add( new Card (4, "Warrior", 0, 0, 10, -25, "Enemy_castle", "WarriorCard"));
            cardCollection.add( new Card (5, "Wizard", 21, 0, 0, -40, "Enemy_castle", "WizardCard"));


        //Player 1
        Castle player1Castle = new Castle(
                1,
                "Player1",
                25,
                0,
                10,
                2,
                10,
                2,
                10,
                2
        );
        this.player1Deck=new ArrayList<>();
        this.player1Hand=new ArrayList<>();
        this.player1Deck.add(cardCollection.get(5));
        this.player1Deck.add(cardCollection.get(4));
        this.player1Deck.add(cardCollection.get(3));
        this.player1Deck.add(cardCollection.get(2));
        this.player1Deck.add(cardCollection.get(1));
        this.player1Deck.add(cardCollection.get(0));
        this.player1Deck.add(cardCollection.get(1));
        this.player1Deck.add(cardCollection.get(2));
        this.player1Deck.add(cardCollection.get(3));
        this.player1Deck.add(cardCollection.get(4));
        this.player1Deck.add(cardCollection.get(5));
        this.player1Deck.add(cardCollection.get(4));
        this.player1Deck.add(cardCollection.get(3));
        this.player1Deck.add(cardCollection.get(2));
        this.player1Deck.add(cardCollection.get(1));

        Player player1 = new Player(0, this.player1Hand, this.player1Deck, player1Castle);
        //Player  2
        Castle player2Castle = new Castle(
                2,
                "Player2",
                25,
                0,
                10,
                2,
                10,
                2,
                10,
                2
        );

        this.player2Deck = new ArrayList<>();
        this.player2Hand = new ArrayList<>();
        this.player2Deck.add(cardCollection.get(5));
        this.player2Deck.add(cardCollection.get(4));
        this.player2Deck.add(cardCollection.get(3));
        this.player2Deck.add(cardCollection.get(2));
        this.player2Deck.add(cardCollection.get(1));
        this.player2Deck.add(cardCollection.get(0));
        this.player2Deck.add(cardCollection.get(1));
        this.player2Deck.add(cardCollection.get(2));
        this.player2Deck.add(cardCollection.get(3));
        this.player2Deck.add(cardCollection.get(4));
        this.player2Deck.add(cardCollection.get(5));
        this.player2Deck.add(cardCollection.get(4));
        this.player2Deck.add(cardCollection.get(3));
        this.player2Deck.add(cardCollection.get(2));
        this.player2Deck.add(cardCollection.get(1));

        Player player2 = new Player(1, this.player2Hand, this.player2Deck, player2Castle);

    }

    public void showCardsToggle(Player player){
        if (this.showMyHand){
            refreshHandPlayer1(player);
            this.showMyHand=false;
        }
        else{
            findViewById(R.id.card2Button).setVisibility(View.VISIBLE);
            findViewById(R.id.card3Button).setVisibility(View.VISIBLE);
            findViewById(R.id.card4Button).setVisibility(View.VISIBLE);
            findViewById(R.id.card5Button).setVisibility(View.VISIBLE);
            findViewById(R.id.card6Button).setVisibility(View.VISIBLE);
            this.showMyHand=true;
        }
    }
    public void player1Draw(Player player1){
        Random r = new Random();
        int rMax = this.player1Deck.size() - 1;
        int randomNumber = r.nextInt((rMax)+1);

        if (rMax >= 0 && this.player1Hand.size()<5 && this.player1Deck.size()>=1){
            this.player1Hand.add(this.player1Deck.get(randomNumber));
            this.player1Deck.remove(randomNumber);
        }
        refreshHandPlayer1(player1);
    }

    public void player2Draw(Player player){  //your turn yugi, draw your last pathetic card
        Random r = new Random();
        int rMax = this.player2Deck.size() - 1;
        int randomNumber = r.nextInt((rMax)+1);

        if (rMax >= 0 && this.player2Hand.size()<5 && this.player2Deck.size()>=1){
            this.player2Hand.add(this.player2Deck.get(randomNumber));
            this.player2Deck.remove(randomNumber);
        }
        refreshHandPlayer1(player);
    }

    public void refreshHandPlayer1(Player player1){
        if(player1.getCardsInHand().size()>=1){
            this.cardButton1.setImageResource(findPictureId(player1.getCardsInHand().get(0).getPictureName()));
            this.cardButton1.setVisibility(View.VISIBLE);
            if(player1.getCardsInHand().size()>=2){
                this.cardButton2.setImageResource(findPictureId(player1.getCardsInHand().get(1).getPictureName()));
                this.cardButton2.setVisibility(View.VISIBLE);
                if(player1.getCardsInHand().size()>=3){
                    this.cardButton3.setImageResource(findPictureId(player1.getCardsInHand().get(2).getPictureName()));
                    this.cardButton3.setVisibility(View.VISIBLE);
                    if(player1.getCardsInHand().size()>=4){
                        this.cardButton4.setImageResource(findPictureId(player1.getCardsInHand().get(3).getPictureName()));
                        this.cardButton4.setVisibility(View.VISIBLE);
                        if(player1.getCardsInHand().size()>=5){
                            this.cardButton5.setImageResource(findPictureId(player1.getCardsInHand().get(4).getPictureName()));
                            this.cardButton5.setVisibility(View.VISIBLE);
                            if(player1.getCardsInHand().size()==6){
                                this.cardButton2.setImageResource(findPictureId(player1.getCardsInHand().get(6).getPictureName()));
                                this.cardButton2.setVisibility(View.VISIBLE);
                            }
                            else {
                                this.cardButton6.setVisibility(View.INVISIBLE);
                            }
                        }
                        else {
                            this.cardButton5.setVisibility(View.INVISIBLE);
                            this.cardButton6.setVisibility(View.INVISIBLE);
                        }
                    }
                    else {
                        this.cardButton4.setVisibility(View.INVISIBLE);
                        this.cardButton5.setVisibility(View.INVISIBLE);
                        this.cardButton6.setVisibility(View.INVISIBLE);
                    }
                }
                else {
                    this.cardButton3.setVisibility(View.INVISIBLE);
                    this.cardButton4.setVisibility(View.INVISIBLE);
                    this.cardButton5.setVisibility(View.INVISIBLE);
                    this.cardButton6.setVisibility(View.INVISIBLE);
                }
            }
            else {
                this.cardButton2.setVisibility(View.INVISIBLE);
                this.cardButton3.setVisibility(View.INVISIBLE);
                this.cardButton4.setVisibility(View.INVISIBLE);
                this.cardButton5.setVisibility(View.INVISIBLE);
                this.cardButton6.setVisibility(View.INVISIBLE);
            }
        }
        else{
            this.cardButton1.setVisibility(View.INVISIBLE);
            this.cardButton2.setVisibility(View.INVISIBLE);
            this.cardButton3.setVisibility(View.INVISIBLE);
            this.cardButton4.setVisibility(View.INVISIBLE);
            this.cardButton5.setVisibility(View.INVISIBLE);
            this.cardButton6.setVisibility(View.INVISIBLE);
        }
    }
    public int findPictureId(String imageName){
        switch (imageName){
            case "CastleCard":
                return R.drawable.card_castle;

            case "DrakeCard":
                return R.drawable.card_drake;
            case "ThiefCard":
                return R.drawable.card_thief;

            case "WallCard":
                return R.drawable.card_wall;
            case "WarriorCard":
                return R.drawable.card_warrior;
            case "WizzardCard":
                return R.drawable.card_wizard;
        }
        return R.drawable.icon_castle;
    }
    //new
    public void refreshResources(Player plr1,Player plr2){
        //refresh player1
        this.resourceText=(TextView)findViewById(R.id.player1Bricks);
        resourceText.setText(plr1.getPlayerCastle().getBricks());
        this.resourceText=(TextView)findViewById(R.id.player1Worker);
        resourceText.setText(plr1.getPlayerCastle().getBuilders());
        this.resourceText=(TextView)findViewById(R.id.player1Mana);
        resourceText.setText(plr1.getPlayerCastle().getMana());
        this.resourceText=(TextView)findViewById(R.id.player1Magic);
        resourceText.setText(plr1.getPlayerCastle().getMagic());
        this.resourceText=(TextView)findViewById(R.id.player1Weapons);
        resourceText.setText(plr1.getPlayerCastle().getWeapons());
        this.resourceText=(TextView)findViewById(R.id.player1Blacksmith);
        resourceText.setText(plr1.getPlayerCastle().getBlacksmith());
        //refresh player2
        this.resourceText=(TextView)findViewById(R.id.player2Bricks);
        resourceText.setText(plr2.getPlayerCastle().getBricks());
        this.resourceText=(TextView)findViewById(R.id.player2Worker);
        resourceText.setText(plr2.getPlayerCastle().getBuilders());
        this.resourceText=(TextView)findViewById(R.id.player2Mana);
        resourceText.setText(plr2.getPlayerCastle().getMana());
        this.resourceText=(TextView)findViewById(R.id.player2Magic);
        resourceText.setText(plr2.getPlayerCastle().getMagic());
        this.resourceText=(TextView)findViewById(R.id.player2Weapons);
        resourceText.setText(plr2.getPlayerCastle().getWeapons());
        this.resourceText=(TextView)findViewById(R.id.player2Blacksmith);
        resourceText.setText(plr2.getPlayerCastle().getBlacksmith());
    }

    public void useCardButton1(Player player1, Player player2){
        if (player1.getCardsInHand().size() >= 1){
            cardUse(player1.getCardsInHand().get(0), player1, player2);
            player1.getCardsInHand().remove(0);
            refreshHandPlayer1();
        }
    }

    public void useCardButton2(Player player1, Player player2){
        if (player1.getCardsInHand().size() >= 2){
            cardUse(player1.getCardsInHand().get(1), player1, player2);
            player1.getCardsInHand().remove(1);
            refreshHandPlayer1();
        }
    }

    public void useCardButton3(Player player1, Player player2){
        if (player1.getCardsInHand().size() >= 3){
            cardUse(player1.getCardsInHand().get(2), player1, player2);
            player1.getCardsInHand().remove(2);
            refreshHandPlayer1();
        }
    }

    public void useCardButton4(Player player1, Player player2){
        if (player1.getCardsInHand().size() >= 4){
            cardUse(player1.getCardsInHand().get(3), player1, player2);
            player1.getCardsInHand().remove(3);
            refreshHandPlayer1();
        }
    }

    public void useCardButton5(Player player1, Player player2){
        if (player1.getCardsInHand().size() >= 5){
            cardUse(player1.getCardsInHand().get(4), player1, player2);
            player1.getCardsInHand().remove(4);
            refreshHandPlayer1();
        }
    }

    public void useCardButton6(Player player1, Player player2){
        if (player1.getCardsInHand().size() >= 6){
            cardUse(player1.getCardsInHand().get(5), player1, player2);
            player1.getCardsInHand().remove(5);
            refreshHandPlayer1();
        }
    }

    public void cardUse(Card card, Player player1, Player player2){
        switch (card.getUse()){
            case "Castle":
                player1.getPlayerCastle().addCastleHealth(card.getCalculation());
                break;
            case "Enemy_Castle":
                player2.getPlayerCastle().addCastleHealth(card.getCalculation());
                break;
            case "All_resources":
                if(player2.getPlayerCastle().getBricks() >= card.getCalculation()){
                    player2.getPlayerCastle().addBricks(card.getCalculation()*-1);
                    player1.getPlayerCastle().addBricks(card.getCalculation());
                }
                else{
                    player1.getPlayerCastle().addBricks(player2.getPlayerCastle().getBricks());
                    player2.getPlayerCastle().addBricks(player2.getPlayerCastle().getBricks()*-1);
                }
                if(player2.getPlayerCastle().getMana() >= card.getCalculation()){
                    player2.getPlayerCastle().addMana(card.getCalculation()*-1);
                    player1.getPlayerCastle().addMana(card.getCalculation());
                }
                else{
                    player1.getPlayerCastle().addMana(player2.getPlayerCastle().getMana());
                    player2.getPlayerCastle().addMana(player2.getPlayerCastle().getMana()*-1);
                }
                if(player2.getPlayerCastle().getWeapons() >= card.getCalculation()){
                    player2.getPlayerCastle().addWeapons(card.getCalculation()*-1);
                    player1.getPlayerCastle().addWeapons(card.getCalculation());
                }
                else{
                    player1.getPlayerCastle().addWeapons(player2.getPlayerCastle().getWeapons());
                    player2.getPlayerCastle().addWeapons(player2.getPlayerCastle().getWeapons()*-1);
                }
                break;
            case "Wall":
                if(player1.getPlayerCastle().getWallHealth()>=card.getCalculation()){
                    player1.getPlayerCastle().addWallHealth(card.getCalculation());
                }
                else{
                    player1.getPlayerCastle().setWallHealth(0);
                }
                break;

        }
    }
}
