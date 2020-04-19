package com.example.buyfresh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ProductActivity extends AppCompatActivity {

    ImageView fruits;
    ImageView dairy;
    ImageView beverage;
    ImageView snack;
    ImageView frozen;
    ImageView bread;
    ImageView beer;
    ImageView health;
    ImageView pharmacy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);



        //Imageviews are assigned to the declared variables.
        fruits = (ImageView)  findViewById(R.id.fruits_img);
        dairy = (ImageView)  findViewById(R.id.dairy_img);
        beverage = (ImageView)  findViewById(R.id.beverage_img);
        snack = (ImageView)  findViewById(R.id.snacks_img);
        frozen = (ImageView)  findViewById(R.id.frozen_img);
        bread = (ImageView)  findViewById(R.id.bread_img);
        beer = (ImageView)  findViewById(R.id.beer_img);
        health = (ImageView)  findViewById(R.id.health_img);
        pharmacy = (ImageView)  findViewById(R.id.pharmacy_img);

        // Fruits
        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, DescriptionActivity.class);
                startActivity(intent);
            }
        });

        //Dairy
        dairy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, DescriptionActivity.class);
                startActivity(intent);
            }
        });

        //Beverage
        beverage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, DescriptionActivity.class);
                startActivity(intent);
            }
        });


        //Snacks
        snack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, DescriptionActivity.class);
                startActivity(intent);
            }
        });

        //Frozen
        frozen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, DescriptionActivity.class);
                startActivity(intent);
            }
        });

        //Bread
        bread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, DescriptionActivity.class);
                startActivity(intent);
            }
        });


        //Beer
        beer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, DescriptionActivity.class);
                startActivity(intent);
            }
        });


        //Health
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProductActivity.this, DescriptionActivity.class);
                startActivity(intent);
            }
        });


        //Pharmacy
        pharmacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, DescriptionActivity.class);
                startActivity(intent);
            }
        });




    }


}
