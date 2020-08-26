package com.opusidea.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

/*    private Car[] cars = {
            new Car(1999, "Volvo", true),
            new Car(2009, "Sandero", false),
            new Car(2015, "Yaris", true),
    };*/


    private boolean on = true;
    private int count = 0;

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean newOn) {
        on = newOn;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // Association entre l'activité et le layout ciblé
        setContentView(R.layout.activity_main);

        // Ciblage d'un élément UI
        //TextView tv = (TextView) findViewById(R.id.textView);
        //tv.setText("Ciao"); // utilisation d'un setter pour modifier le texte

        Button btnChange = (Button) findViewById(R.id.btnChange);

        // Ecoute événementielle
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = (TextView) findViewById(R.id.textView);
                // utilisation d'un setter pour modifier le texte

                count = count + 1;

                if (getOn() == true) {
                    tv.setText("Bonjour " + count);
                    setOn(false);
                } else {
                    tv.setText("Bonsoir");
                    setOn(true);
                }

                // chargement d'une autre activité (sous condition)
                if (count > 3) {
                    Intent intent = new Intent(getApplicationContext(), GameOverActivity.class);

                    // passage de données entre activités
                    // possibilité de passer différents types de données (y compris tableaux d'objets)
                    intent.putExtra("com.opusidea.demoapp.MSG", "Buna ziua");


                    startActivity(intent);
                }

            }
        });
    }


}