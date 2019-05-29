package com.example.mightycastles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main_menu_activity extends AppCompatActivity {
    private Button menuPlayButton;
    private Button menuOptionsButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_activity);
        menuPlayButton = (Button) findViewById(R.id.playButton);
        menuPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayActivity();
            }
        });
        menuOptionsButton= findViewById(R.id.optionButtno);
        menuOptionsButton.setOnClickListener(new View.OnClickListener(){@Override
            public void onClick(View v) {
                openPlayActivity();
            }
        });


    }
    public void openPlayActivity(){
        Intent intent = new Intent(this, Play.class);
        startActivity(intent);
    }
}
