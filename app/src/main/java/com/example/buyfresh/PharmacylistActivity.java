package com.example.buyfresh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class PharmacylistActivity extends AppCompatActivity {

    List<Product> lstProduct ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacylist);

        // Making a array list in order to store value.
        lstProduct = new ArrayList<>();
        lstProduct.add(new Product("1000 IU vitamin D tablets, Essentials","240UN 1000 IU vitamin D tablets, Essentials","$10.99",R.drawable.vitamin));
        lstProduct.add(new Product("Chocolate Flavoured Meal Replacement, High Protein","6X237ml Chocolate Flavoured Meal Replacement, High Protein", "$11.49",R.drawable.boost));
        lstProduct.add(new Product("Chocolate chip energy bar","12X68gm Chocolate chip energy bar", "$18.99",R.drawable.choclatebar));
        lstProduct.add(new Product("High Protein Meal Replacement, Nutrium","6X237ml High Protein Meal Replacement, Nutrium", "$9.99",R.drawable.protein));

        //Assigning a new reclerview variable and setting layout using grid layout with 1 product per line.
        RecyclerView recyclev = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstProduct);
        recyclev.setLayoutManager(new GridLayoutManager(this,1));
        recyclev.setAdapter(myAdapter);
    }
}