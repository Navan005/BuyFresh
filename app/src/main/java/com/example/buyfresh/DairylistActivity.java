package com.example.buyfresh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class DairylistActivity extends AppCompatActivity {

    List<Product> lstProduct ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dairylist);

        // Making a array list in order to store value.
        lstProduct = new ArrayList<>();
        lstProduct.add(new Product("Large Eggs","Our dozen large eggs are indispensable for your favourite breakfasts and meals.","$3.79",R.drawable.eggs));
        lstProduct.add(new Product("Salted Butter","454GM. Selection salted butter.", "$4.69",R.drawable.butter));
        lstProduct.add(new Product("Lactania 2% Milk, PurFiltre 2L","Lactantia® PurFiltre® partly skimmed milk has a creamier taste than ever, as well as added vitamins A and D, and is an excellent source of calcium.", "$4.99",R.drawable.milk));
        lstProduct.add(new Product("QUÉBON 2% Milk 4L","Québon® partly skimmed milk is the product of a rich heritage and tradition in the province of Quebec. It combines the fresh and refreshing flavour of milk with many vitamins and minerals necessary for the maintenance of good health.", "$6.68",R.drawable.quebonmilk));

        //Assigning a new reclerview variable and setting layout using grid layout with 1 product per line.
        RecyclerView recyclev = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstProduct);
        recyclev.setLayoutManager(new GridLayoutManager(this,1));
        recyclev.setAdapter(myAdapter);
    }
}