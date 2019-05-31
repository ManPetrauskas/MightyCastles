package com.example.mightycastles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mightycastles.mightycastles.classes.Card;
import com.example.mightycastles.mightycastles.classes.Castle;

import java.util.ArrayList;
import java.util.List;

public class Gameplay extends AppCompatActivity {
    private Button handButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);

        handButton = (Button) findViewById(R.id.showHand);
        handButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCardsToggle();
            }
        });

        List<Card> cardCollection = new ArrayList<Card>();
            cardCollection.add( new Card (0, "Castle", 0, 3, 0, 10, "Castle", "@drawable/card_bricks"));
            cardCollection.add( new Card (1, "Drake", 21, 0, 0, 40, "Enemy_castle", "@drawable/card_drake"));
            cardCollection.add( new Card (2, "Thief", 0, 0, 21, 20, "All_resources", "@drawable/card_thief"));
            cardCollection.add( new Card (3, "Wall", 0, 3, 0, 10, "Wall", "@drawable/card_wall"));
            cardCollection.add( new Card (4, "Warrior", 0, 0, 10, 25, "Enemy_castle", "@drawable/card_warrior"));
            cardCollection.add( new Card (5, "Wizard", 21, 0, 0, 40, "Enemy_castle", "@drawable/card_wizard"));


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

    }
    public void showCardsToggle(){
        if (findViewById(R.id.card1Button).getVisibility() ==View.VISIBLE){
            findViewById(R.id.card2Button).setVisibility(View.INVISIBLE);
            findViewById(R.id.card3Button).setVisibility(View.INVISIBLE);
            findViewById(R.id.card4Button).setVisibility(View.INVISIBLE);
            findViewById(R.id.card5Button).setVisibility(View.INVISIBLE);
            findViewById(R.id.card6Button).setVisibility(View.INVISIBLE);
        }
        else{
            findViewById(R.id.card2Button).setVisibility(View.VISIBLE);
            findViewById(R.id.card3Button).setVisibility(View.VISIBLE);
            findViewById(R.id.card4Button).setVisibility(View.VISIBLE);
            findViewById(R.id.card5Button).setVisibility(View.VISIBLE);
            findViewById(R.id.card6Button).setVisibility(View.VISIBLE);
        }
    }
}
