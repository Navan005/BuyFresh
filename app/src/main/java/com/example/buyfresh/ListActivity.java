package com.example.buyfresh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    List<Product> lstProduct ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Making a array list in order to store value.
        lstProduct = new ArrayList<>();
        lstProduct.add(new Product("Banana","Origin : Colombia, Costa Rica, Ecuador, Guatemala, Honduras, Mexico","$0.33",R.drawable.banana));
        lstProduct.add(new Product("Raspberries","Origin : Canada, United States ", "$3.88",R.drawable.berry));
        lstProduct.add(new Product("Hothouse red pepper","Origin : Belgium, Canada, Spain, Mexico, Honduras, Morocco, Netherlands, Dominican Republic", "$1.83",R.drawable.redpepper));
        lstProduct.add(new Product("White mushrooms","Origin : Canada, United States", "$2.49",R.drawable.mushroom));
        lstProduct.add(new Product("Seedless mini cucumbers","Origin : Belgium, Canada, Spain, United States, Honduras, Morocco, Mexico, Netherlands, Dominican Republic", "$2.99",R.drawable.cucumber));

        //Assigning a new reclerview variable and setting layout using grid layout with 1 product per line.
        RecyclerView recyclev = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstProduct);
        recyclev.setLayoutManager(new GridLayoutManager(this,1));
        recyclev.setAdapter(myAdapter);
    }
}
