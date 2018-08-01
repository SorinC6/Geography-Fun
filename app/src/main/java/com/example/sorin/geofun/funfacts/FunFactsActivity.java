package com.example.sorin.geofun.funfacts;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.example.sorin.geofun.R;

public class FunFactsActivity extends AppCompatActivity {
    private Button backButton;
    private ColorSwitch colorSwitch=new ColorSwitch();
    private FactBook factBook=new FactBook();
    private TextView textInfo;
    private TextView textFunFact;
    private Button factButton;
    private RelativeLayout relativeLayout;
    private ConstraintLayout constraintLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        
        //configurareButtonBack();

        textInfo=(TextView)findViewById(R.id.textInfoId);
        textFunFact=(TextView)findViewById((R.id.TextFunFactId));
        factButton=(Button)findViewById(R.id.buttonSwitch);

        factButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact=factBook.getFacts();
                //String fact="Gografie";
                int color=colorSwitch.getColor();
                textFunFact.setText(fact);
               // constraintLayout.setBackgroundColor(color);
                //relativeLayout.setBackgroundColor(color);
                factButton.setTextColor(color);
            }
        });
    }

    private void configurareButtonBack() {
        backButton=findViewById(R.id.buttonBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
