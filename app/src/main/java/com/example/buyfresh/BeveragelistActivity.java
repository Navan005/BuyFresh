package com.example.buyfresh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class BeveragelistActivity extends AppCompatActivity {

    List<Product> lstProduct ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beveragelist);

        // Making a array list in order to store value.
        lstProduct = new ArrayList<>();
        lstProduct.add(new Product("Orange Juice Without Pulp, Premium","1.65L. Oasis® Premium 100% pure orange juice without pulp is not made from concentrate and does not have added sugar.","$3.00",R.drawable.oasis));
        lstProduct.add(new Product("ESKA Natural Spring Water","24X500 ML. Eska® natural spring water comes from St-Mathieu d'Harricana, Quebec.", "$4.00",R.drawable.eska));
        lstProduct.add(new Product("Unsweetened almond fortified beverage","1.89L. Silk® original unsweetened almond beverage is dairy, gluten and soy free. It contains 35 calories per serving. This fortified almond beverage has no GMO and has no sugar added.", "$4.49",R.drawable.silk));
        lstProduct.add(new Product("Original vegetable juice, Garden Cocktail","945ML. Made with 100% vegetable juice from concentrate and added ingredients, original Mott's™ Garden Cocktail™ contains 45 calories and 2 servings of vegetables per 250 mL glass.", "$2.00",R.drawable.gardenjuice));

        //Assigning a new reclerview variable and setting layout using grid layout with 1 product per line.
        RecyclerView recyclev = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstProduct);
        recyclev.setLayoutManager(new GridLayoutManager(this,1));
        recyclev.setAdapter(myAdapter);
    }
}