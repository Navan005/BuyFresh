package com.example.buyfresh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class BreadlistActivity extends AppCompatActivity {

    List<Product> lstProduct ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breadlist);

        // Making a array list in order to store value.
        lstProduct = new ArrayList<>();
        lstProduct.add(new Product("Ultra-soft™ sliced white bread","675Gm. The softest white bread in Québec for super club sandwiches is a new recipe. Sold in a duo pack.","$3.19",R.drawable.pombread));
        lstProduct.add(new Product("Hamburger Buns","12 pre-sliced hamburger buns.", "$2.00",R.drawable.bun));
        lstProduct.add(new Product("Ah Caramel!™ cakes","12Un. Taste the original Ah Caramel!™: a white cake coated with chocolate and filled with caramel and pastry creme.", "$3.89",R.drawable.caramel));
        lstProduct.add(new Product("White pita bread","225Gm, Trans fat and cholesterol free white pita bread.", "$1.79",R.drawable.pita));

        //Assigning a new reclerview variable and setting layout using grid layout with 1 product per line.
        RecyclerView recyclev = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstProduct);
        recyclev.setLayoutManager(new GridLayoutManager(this,1));
        recyclev.setAdapter(myAdapter);
    }
}