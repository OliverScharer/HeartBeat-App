package com.example.heartbeat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class login1 extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login1);
        TextView wechsellinkTxt = (TextView) findViewById(R.id.wechsellinkTxt);
        wechsellinkTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(login1.this, register.class));
            }
        });

        Button registrierButton = (Button)findViewById(R.id.registrierButton2);
        registrierButton.setOnClickListener(new View.OnClickListener() {

            TextView txtMeldung2 = findViewById(R.id.txtMeldung2);

            @Override
            public void onClick(View v) {
                if( ((Profilliste) getApplication()).getProfil(findViewById(R.id.loginPasswort).toString(), findViewById(R.id.loginEmail).toString(),findViewById(R.id.loginEmail).toString()))
                    startActivity(new Intent(login1.this, profil.class));
                else
                    txtMeldung2.setText("Die Anmeldedaten sind nicht korrekt.");
            }
        });



    }

}
