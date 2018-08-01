package com.example.sorin.geofun.jocuridemunte;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sorin.geofun.R;

public class JocuriActivity extends AppCompatActivity {



    private Button buttonSpinTheBottle;
    private Button buttonXsiO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jocuri);

        buttonXsiO=findViewById( R.id.buttonJocXsiOID );

        buttonXsiO.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(JocuriActivity.this,XsiOActivity.class);
                startActivity( intent );
            }
        } );


        buttonSpinTheBottle=findViewById(R.id.buttonJocSpinTheBottleID);
        buttonSpinTheBottle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(JocuriActivity.this,SpinTheBottleActivity.class);
                startActivity(intent);
            }
        });
    }


}
