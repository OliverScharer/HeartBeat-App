package com.example.heartbeat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class register extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        TextView wechsellinkTxt = (TextView) findViewById(R.id.wechsellinkTxt);
        wechsellinkTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(register.this, login1.class));
            }
        });

        //registriervorgang
        Button registrierButton = (Button)findViewById(R.id.registrierButton);
        registrierButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pwKorrekt = false;

                TextView txtMeldung = findViewById(R.id.txtMeldung);

                EditText benET = findViewById(R.id.benutzername);
                EditText mailET = findViewById(R.id.registerEmail);
                EditText pwET = findViewById(R.id.registerPasswort);
                EditText pwBestET = findViewById(R.id.registerbestPasswort);

                String benS = benET.getText().toString();
                String mailS = mailET.getText().toString();
                String pwS = pwET.getText().toString();
                String pwBestS = pwBestET.getText().toString();

                if(pwS.contentEquals(pwBestS))
                    pwKorrekt = true;

                if (!benS.isEmpty() && !mailS.isEmpty() && pwKorrekt)
                {
                    Profilklasse pr = new Profilklasse(benS, mailS, pwS);
                    startActivity(new Intent(register.this, profilanlegen.class));
                }
                else if (!pwKorrekt)
                    txtMeldung.setText("Die beiden Passwörter stimmen nicht überein");

                else
                    txtMeldung.setText("bitte geben Sie vollständige Daten an");
            }
        });

    }
}
