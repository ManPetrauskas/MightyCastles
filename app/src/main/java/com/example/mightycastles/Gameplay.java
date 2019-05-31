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

        //cum

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
