package com.example.buyfresh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SnacklistActivity extends AppCompatActivity {

    List<Product> lstProduct ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacklist);

        // Making a array list in order to store value.
        lstProduct = new ArrayList<>();
        lstProduct.add(new Product("Dorito Nacho cheese tortilla chips","Share these tasty flavoured tortilla chips with your friends! They were made with no trans fat.","$4.29",R.drawable.dorito));
        lstProduct.add(new Product("Planter Lightly salted cashews","20gm. Lightly salted cashews.", "$5.00",R.drawable.cashew));
        lstProduct.add(new Product("Nestle Chocolate bar, Kit Kat","Have a break with this KitKat® bar made with a light crispy wafer covered in milk chocolate. This product is made with natural flavours.", "$1.29",R.drawable.kitkat));
        lstProduct.add(new Product("Miss Vickie's Sea salt and malt vinegar chips","Miss Vickie's® kettle cooked chips are crafted with care since 1987. They do not contain artificial flavours or colours.", "$4.29",R.drawable.missvickie));

        //Assigning a new reclerview variable and setting layout using grid layout with 1 product per line.
        RecyclerView recyclev = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstProduct);
        recyclev.setLayoutManager(new GridLayoutManager(this,1));
        recyclev.setAdapter(myAdapter);
    }
}