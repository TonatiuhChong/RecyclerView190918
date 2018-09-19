package com.wehouse.tchong.recyclerview190918;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private String[] countries = {
            "Switch",
            "Presencia",
            "Ambiental",
            "Puerta",
            "Ventana",
            "Iluminación",
            "Otro"
    };
    private int [] images = {
            R.drawable.uno,
            R.drawable.dos,
            R.drawable.tres,
            R.drawable.cuatro,
            R.drawable.cinco,
            R.drawable.seis,
            R.drawable.siete
    };



private List<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayout.HORIZONTAL,false));
        listItems=new ArrayList<>();
//        Uri[] uris = new Uri[images.length];
//        for (int i = 0; i <uris.length; i++) {
//            uris[i] = Uri.parse("android.resource://"+this.getPackageName()+"/drawable/"+images[i]);
//
//        }


        for (int i=0; i<images.length; i++){
            ListItem listItem=new ListItem(
                    countries[i], images[i]
            );

            listItems.add(listItem);

        }
        adapter=new adapter(listItems,this);

        recyclerView.setAdapter(adapter);



    }
}
