package com.example.heartbeat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class profilbearbeiten extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profilbearbeiten);

        Spinner genresSp = findViewById(R.id.dd_Genres);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.genres, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genresSp.setAdapter(adapter);
        genresSp.setOnItemSelectedListener(this);


        Button registrierButton2 = (Button)findViewById(R.id.bearbEndBtn2);
        registrierButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profilbearbeiten.this, profil.class));
            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
