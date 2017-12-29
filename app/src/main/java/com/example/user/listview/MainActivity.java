package com.example.user.listview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    Context cn;
    ArrayList petname;
    int[]petImages={R.drawable.sample_1,R.drawable.sample_2,R.drawable.sample_3,R.drawable.sample_4,R.drawable.sample_5};
   String[]name={"Dog","Cat","Lion","Rat","Rabbit"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cn = this;
        lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(new CustomAdapter(this, name, petImages));
    }


        @Override
        public boolean onCreateOptionsMenu(Menu menu){


           // getMenuInflater().inflate(R.menu.main);
            return true;
        }

        /*
        Grid view

        GridView gridView = (GridView)findViewById(R.id.griditem);
        gridView.setAdapter(new ImageAdapter(this));
        */

        /*List view*/
       /* ArrayAdapter adapter= new ArrayAdapter<String>(this, R.layout.listview,R.id.listviewlayout,mobileArray);
        ListView listv = (ListView) findViewById(R.id.Listitem);
        listv.setAdapter(adapter);
        listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String name = mobileArray[i];
                Toast.makeText(MainActivity.this,name+" "+i,Toast.LENGTH_SHORT).show();

            }
        });
      *//* listv.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(MainActivity.this,name+" "+i,Toast.LENGTH_SHORT).show();

           }
       });*/


    }

