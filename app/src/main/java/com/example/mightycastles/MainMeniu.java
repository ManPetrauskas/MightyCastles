package com.example.mightycastles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMeniu extends AppCompatActivity {
    private Button menuPlayButton;
    private Button menuOptionsButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_meniu);
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
            openOptionActivity();
        }
        });
    }
    public void openPlayActivity(){
        Intent intent = new Intent(this, Play.class);
        startActivity(intent);
    }
    public void openOptionActivity(){
        Intent intent = new Intent(this, Options.class);
        startActivity(intent);
    }
}
