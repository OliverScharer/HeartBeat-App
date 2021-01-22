package com.example.heartbeat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class register extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        TextView wechsellinkTxt = findViewById(R.id.wechsellinkTxt);

        Spinner sexAusrichtSp = findViewById(R.id.dd_sexAusricht);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.sex, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sexAusrichtSp.setAdapter(adapter);
        sexAusrichtSp.setOnItemSelectedListener(this);

        wechsellinkTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(register.this, login1.class));
            }
        });

        //registriervorgang
        Button registrierButton = (Button)findViewById(R.id.bearbEndBtn2);
        registrierButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pwKorrekt = false;

                TextView txtMeldung = findViewById(R.id.txtMeldung);

                EditText benET = findViewById(R.id.benutzername);
                EditText mailET = findViewById(R.id.liebKuenstET);
                EditText pwET = findViewById(R.id.gebJahrET);
                EditText pwBestET = findViewById(R.id.registerbestPasswort);

                String benS = benET.getText().toString();
                String mailS = mailET.getText().toString();
                String pwS = pwET.getText().toString();
                String pwBestS = pwBestET.getText().toString();

                if(pwS.contentEquals(pwBestS))
                    pwKorrekt = true;

                if (!benS.isEmpty() && !mailS.isEmpty() && pwKorrekt)
                {
                    startActivity(new Intent(register.this, profilanlegen.class));
                }
                else if (!pwKorrekt)
                    txtMeldung.setText("Die beiden Passwörter stimmen nicht überein");

                else
                    txtMeldung.setText("Bitte geben Sie vollständige Daten an");
            }
        });

    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


        ((TextView) parent.getChildAt(0)).setTextColor(Color.BLACK);
        ((TextView) parent.getChildAt(0)).setTextSize(18);
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
