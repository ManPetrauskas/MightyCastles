package com.example.mightycastles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Play extends AppCompatActivity {
    private Button playGame;
    private EditText player1Name;
    private EditText player2Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        playGame = (Button) findViewById(R.id.playGameButton);
        playGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGameplayActivity();
            }
        });
    }
    public void openGameplayActivity(){
        player1Name= findViewById(R.id.player1NameText);
        player2Name= findViewById(R.id.player2NameText);
        Intent intent = new Intent(this, Gameplay.class);
        intent.putExtra("GetPlayer1Name",player1Name.getText());
        intent.putExtra("GetPlayer2Name",player2Name.getText());
        startActivity(intent);
    }
}
