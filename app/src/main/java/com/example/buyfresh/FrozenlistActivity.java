package com.example.buyfresh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FrozenlistActivity extends AppCompatActivity {

    List<Product> lstProduct ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frozenlist);

        // Making a array list in order to store value.
        lstProduct = new ArrayList<>();
        lstProduct.add(new Product("Frozen wild blueberries with no added sugar","600gm WILD BLUEBERRIES.","$4.99",R.drawable.wildblueberries));
        lstProduct.add(new Product("Frozen 5 minutes shoestring fries, Superfries","650gm. Trans fat free Superfries® are ready in 5 minutes.", "$3.99",R.drawable.superfries));
        lstProduct.add(new Product("Frozen Buffalo Chicken Wings","550gm. These Buffalo chicken wings are cut, cooked, and seasoned. They contain 18% of meat protein and are made with 100% Quebec chicken.", "$9.99",R.drawable.chickenwings));
        lstProduct.add(new Product("Frozen Spinach Thin Crust Pizza, Ristorante","Share this Dr.Oetker thin crust spinach pizza!", "$5.99",R.drawable.pizza));

        //Assigning a new reclerview variable and setting layout using grid layout with 1 product per line.
        RecyclerView recyclev = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstProduct);
        recyclev.setLayoutManager(new GridLayoutManager(this,1));
        recyclev.setAdapter(myAdapter);
    }
}