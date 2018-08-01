package com.example.sorin.geofun.hartiariiprotejate;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.sorin.geofun.R;


public class ImageAdapter extends PagerAdapter {

    private Context context;
//    private int[] imageResorces=new int[] {R.drawable.ariiprotejatetotal,R.drawable.ariibucegi,R.drawable.ariicomana,R.drawable.ariimuntiiapuseni,R.drawable.ariiprotejatenationalenord,
//            R.drawable.ariiprotejatenationalese,R.drawable.ariiputnavrancea};

    private int[] imageResorces=new int[] {R.drawable.ariiprotejate,R.drawable.ariiprotejaten,R.drawable.ariiprotejatese,R.drawable.ariiprotejatesv,R.drawable.parculnaturalapuseni,R.drawable.parculnaturalbucegi,R.drawable.parculnaturalcomana,R.drawable.parculnaturalputnavrancea};


    public ImageAdapter(Context context){
        this.context=context;
    }
    @Override
    public int getCount() {
        return imageResorces.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView=new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(imageResorces[position]);
        container.addView(imageView,0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView)object);
    }
}
