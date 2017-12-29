package com.example.user.listview;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;

/**
 * Created by User on 9/21/2017.
 */

public class CustomAdapter extends BaseAdapter {

    String[] result;
    Context context;
    int[] imgId;
    private  static LayoutInflater inflate=null;


    public CustomAdapter(MainActivity mainActivity, String[] name, int[] petImages) {

        result= name;
        context =  mainActivity;
        imgId= petImages;
        inflate= (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return result.length;
    }

    @Override
    public Object getItem(int pos) {
        return pos;
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    public class Holder{
        TextView tv;
        ImageView imv;
    }
    @Override
    public View getView(final int pos, View convertview, ViewGroup parent) {


        Holder holder=new Holder();
        View rowView;
        rowView = inflate.inflate(R.layout.customadapter, null);
        holder.tv=(TextView) rowView.findViewById(R.id.textView1);
        holder.imv=(ImageView) rowView.findViewById(R.id.imageView1);
        holder.tv.setText(result[pos]);
        holder.imv.setImageResource(imgId[pos]);
        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, "You Clicked "+result[pos], Toast.LENGTH_LONG).show();
            }
        });
        return rowView;
    }
}
