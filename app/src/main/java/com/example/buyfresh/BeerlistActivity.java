package com.example.buyfresh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class BeerlistActivity extends AppCompatActivity {

    List<Product> lstProduct ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beerlist);

        // Making a array list in order to store value.
        lstProduct = new ArrayList<>();
        lstProduct.add(new Product("Corona Mexican Beer","Corona® Lager is the perfect beverage for the simple pleasures of life. Simpy serve with a freshly sliced lime quarter. It contains 4.6% alcohol by volume.","$19.99",R.drawable.corona));
        lstProduct.add(new Product("Italian White Wine, Splendido","This Bù Splendido white wine from Italy is made from Chardonnay grapes. Fruity and vibrant, it contains 12.5% alcohol by volume.", "$13.99",R.drawable.italianbeer));
        lstProduct.add(new Product("Wallaroo Trail Australian red wine","This Wallaroo Trail red wine from Australia is made from Shiraz grapes. Aromatic and supple, it contains 13.9% alcohol by volume.", "$12.79",R.drawable.wallaroo));
        lstProduct.add(new Product("Nicolas laloux Canadian dry white wine","Delicate and light, this Nicolas Laloux white wine from Canada contains 11% alcohol by volume.", "$9.99",R.drawable.nicolas));

        //Assigning a new reclerview variable and setting layout using grid layout with 1 product per line.
        RecyclerView recyclev = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstProduct);
        recyclev.setLayoutManager(new GridLayoutManager(this,1));
        recyclev.setAdapter(myAdapter);
    }
}