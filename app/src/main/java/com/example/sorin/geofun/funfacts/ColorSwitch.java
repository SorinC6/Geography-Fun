package com.example.sorin.geofun.funfacts;
import android.graphics.Color;

import java.util.Random;

public class ColorSwitch {

    public String[] colors = {
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7"
    };

    public int getColor(){
        String c;
        Random rand=new Random();
        int randLength=rand.nextInt(colors.length);
        c=colors[randLength];
        int colorAsString= Color.parseColor(c);
        return colorAsString;
    }
}