package com.example.mightycastles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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

        List<Card> cardCollection = Array.asList(
                new card (0, "Castle_plus", 0, 3, 0, 3, "Bricks", "@drawable/card_bricks"),
                new card (1, "Drake", 21, 0, 0, 21, "Mana", "@drawable/card_drake"),
                new card (2, "Thief", 0, 0, 21, 21, "Weapons", "@drawable/card_thief")
                
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
