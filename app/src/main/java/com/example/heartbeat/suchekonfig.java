package com.example.heartbeat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class suchekonfig extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    TextView tv;
    EditText sw;
    Button btnSubmit;
    SeekBar entf_bar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.suchekonfig);


        // Zurueck Button
        ImageView z4 = (ImageView) findViewById(R.id.zurueck);
        z4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(suchekonfig.this, profil.class));
            }

        });
        // Ende zurück

        // Standort
       tv = (TextView) findViewById(R.id.tw_standord);
       sw = (EditText) findViewById(R.id.sw);
       btnSubmit = findViewById(R.id.btnSubmit);
       btnSubmit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String t = sw.getText().toString();
               tv.setText(t);
           }
       });
        // Ende Standort




        // Dropdown menüs
        Spinner spinner = findViewById(R.id.dd_sex);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.sex, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        Spinner spinner2 = findViewById(R.id.dd_age);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.age, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(this);

        //Entfernung
        final TextView entf = (TextView)  findViewById(R.id.tw_entf);
        int maxentf = 300;
        entf_bar = (SeekBar) findViewById(R.id.entf_bar);
        entf_bar.setMax(maxentf);
        entf_bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            entf.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        //Ende Entfernung

    } // Ende onCreate--------------------------------------------------------------------------------------------
    //Dropdown menü 2
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


        ((TextView) parent.getChildAt(0)).setTextColor(Color.WHITE);
        ((TextView) parent.getChildAt(0)).setTextSize(18);
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();

        ((TextView) parent.getChildAt(0)).setTextColor(Color.WHITE);
        ((TextView) parent.getChildAt(0)).setTextSize(18);
        String text1 = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text1, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    //Ende Drodownmeüs




}