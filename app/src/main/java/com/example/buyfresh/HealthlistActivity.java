package com.example.buyfresh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HealthlistActivity extends AppCompatActivity {

    List<Product> lstProduct ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthlist);

        // Making a array list in order to store value.
        lstProduct = new ArrayList<>();
        lstProduct.add(new Product("Cool Mint™ antiseptic mouthwash","This antiseptic mouthwash kills up to 99.9% of germs that cause plaque, gingivitis and bad breath, and comes in a child resistant package.","$7.99",R.drawable.mouthwash));
        lstProduct.add(new Product("Ivory Original soap bars","Ivory® soap bars are 99,44% pure. This pack contains 10 bars of original soap.", "$4.79",R.drawable.ivorysoap));
        lstProduct.add(new Product("Dove Deep Moisture Nourishing Body Wash, Core","Deep Moisture nourishing body wash contains Nutrium Moisture® for softer and smoother skin after just one shower.", "$4.00",R.drawable.dove));
        lstProduct.add(new Product("Colgate Cavity protection toothpaste","This toothpaste contains fluoride to strengthen teeth and protect them from cavities.", "$1.79",R.drawable.colgate));

        //Assigning a new reclerview variable and setting layout using grid layout with 1 product per line.
        RecyclerView recyclev = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstProduct);
        recyclev.setLayoutManager(new GridLayoutManager(this,1));
        recyclev.setAdapter(myAdapter);
    }
}