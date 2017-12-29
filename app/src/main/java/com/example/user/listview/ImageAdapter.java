package com.example.user.listview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by User on 9/20/2017.
 */

public class ImageAdapter extends BaseAdapter {
    private Context context;

    public ImageAdapter(Context c)
    {
        context =c;

    }
    public int getCount()
    {
        return mThumbId.length;

    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertview, ViewGroup parent) {
        ImageView imageview;
    if (convertview == null){
        imageview = new ImageView(context);
        imageview.setLayoutParams(new GridView.LayoutParams(200 ,300));
        imageview.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageview.setPadding(8,8,8,8);

    }
    else

        imageview= (ImageView)convertview;
        imageview.setImageResource(mThumbId[position]);
        return imageview;

    }
    public Integer[]mThumbId = {
            R.drawable.sample_1,
            R.drawable.sample_2,
            R.drawable.sample_3,
            R.drawable.sample_4,
            R.drawable.sample_5,
            R.drawable.sample_6,
            R.drawable.sample_7,
            R.drawable.sample_8,
            R.drawable.sample_9,
            R.drawable.sample_1,
            R.drawable.sample_2,
            R.drawable.sample_3,
            R.drawable.sample_4,
            R.drawable.sample_5,
            R.drawable.sample_6,
            R.drawable.sample_7,
            R.drawable.sample_8,
            R.drawable.sample_9
    };





    }



