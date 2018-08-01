package com.example.sorin.geofun.mainthing;


import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sorin.geofun.R;
import com.example.sorin.geofun.busola.Busola;
import com.example.sorin.geofun.funfacts.FunFactsActivity;
import com.example.sorin.geofun.hartiariiprotejate.PictureActivity;
import com.example.sorin.geofun.jocuridemunte.JocuriActivity;
import com.example.sorin.geofun.trivia.TriviaActivity;
import com.example.sorin.geofun.webcrawler.WebCrawlerActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textField;
    private EditText editTextSearchWord;
    private Button buttonSearch;
    private Button buttonFunFacts;
    private Button buttonTrivia;
    private Button buttonHarti;
    private Button buttonJocuri;
    private Button buttonBuola;
    protected Button buttonAbout;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        configurareButonCrawler();

        configurareButonFunFacts();

        confiurareButonHarti();

        configurareButonTrivia();

        configurareButtonJocuri();

        configurareButonBusola();

        configurareButonAbout();

    }

    private void configurareButtonJocuri() {
        buttonJocuri = findViewById(R.id.buttonJocuriID);
        buttonJocuri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, JocuriActivity.class);
                startActivity(intent);
            }
        });
    }
    private void configurareButonBusola() {

        buttonBuola=findViewById(R.id.buttonBusolaID);
        buttonBuola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Busola.class);
                startActivity(intent);
            }
        });

    }


    private void configurareButonCrawler() {
        editTextSearchWord=findViewById(R.id.textSearch);
        buttonSearch=findViewById(R.id.buttonSearch);
        buttonSearch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String cuvantCautat=editTextSearchWord.getText().toString();
               // Toast.makeText(getApplicationContext(),cuvantCautat,Toast.LENGTH_LONG).show();
                Intent i=new Intent(MainActivity.this,WebCrawlerActivity.class);
                i.putExtra("EXTRA_MESSAGE",cuvantCautat);
                startActivity(i);
            }
        });
    }
    private void configurareButonFunFacts() {
        buttonFunFacts=findViewById(R.id.buttonFunFacts);

        buttonFunFacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,FunFactsActivity.class);
                startActivity(i);
            }
        });
    }

    private void confiurareButonHarti() {
        buttonHarti=findViewById(R.id.buttonHarti);

        buttonHarti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, PictureActivity.class);
                startActivity(intent);
            }
        });
    }
    private void configurareButonTrivia() {
        buttonTrivia=findViewById(R.id.buttonTrivia);
        buttonTrivia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,TriviaActivity.class);
                startActivity(i);
            }
        });
    }
    private void configurareButonAbout() {
        buttonAbout=findViewById(R.id.buttonAbout);
        buttonAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,AboutActivity.class);
                startActivity(i);
            }
        });
    }


}
