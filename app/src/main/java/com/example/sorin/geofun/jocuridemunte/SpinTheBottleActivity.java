package com.example.sorin.geofun.jocuridemunte;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.sorin.geofun.R;

import java.util.Random;

public class SpinTheBottleActivity extends AppCompatActivity {

    public static final Random RANDOM = new Random();
    private View main;
    private ImageView bottle;
    private int lastAngle = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spin_the_bottle);
        main = findViewById(R.id.root);
        bottle = (ImageView) findViewById(R.id.bottle);

        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spinTheBottle();
            }
        });

        Toast.makeText(this, "Invarte Sticla", Toast.LENGTH_SHORT).show();
    }



    private void spinTheBottle() {
        int angle = RANDOM.nextInt(3600 - 360) + 360;
        float pivotX = bottle.getWidth() / 2;
        float pivotY = bottle.getHeight() / 2;

        final Animation animRotate = new RotateAnimation(lastAngle == -1 ? 0 : lastAngle, angle, pivotX, pivotY);
        lastAngle = angle;
        animRotate.setDuration(2500);
        animRotate.setFillAfter(true);

        bottle.startAnimation(animRotate);
    }

    private void resetTheBottle() {
        float pivotX = bottle.getWidth() / 2;
        float pivotY = bottle.getHeight() / 2;

        final Animation animRotate = new RotateAnimation(lastAngle == -1 ? 0 : lastAngle, 0, pivotX, pivotY);
        lastAngle = -1;
        animRotate.setDuration(2000);
        animRotate.setFillAfter(true);

        bottle.startAnimation(animRotate);
    }
}
