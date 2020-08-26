package com.opusidea.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GameOverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        if (getIntent().hasExtra("com.opusidea.demoapp.MSG")) {
            TextView textView = (TextView) findViewById(R.id.textView2);
            String text = getIntent().getExtras().getString("com.opusidea.demoapp.MSG");
            textView.setText(text);
        }


    }

}