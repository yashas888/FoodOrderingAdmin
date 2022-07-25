package com.foodorder.foodorderadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView south_indian1, north_indian1, italian1;
    private ImageView fast_food1, snacks1,cool_drinks1;
    private Button maintain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        south_indian1=(ImageView)findViewById(R.id.south_indian1);
        north_indian1=(ImageView)findViewById(R.id.north_indian1);
        fast_food1=(ImageView)findViewById(R.id.fast_food1);
        snacks1=(ImageView)findViewById(R.id.snacks1);
        cool_drinks1=(ImageView)findViewById(R.id.cool_drinks1);
        italian1=(ImageView)findViewById(R.id.italian1);
        maintain = findViewById(R.id.maintain);
        south_indian1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","south_indian");
                startActivity(intent);
            }
        });

        north_indian1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","north_indian");
                startActivity(intent);
            }
        });

        fast_food1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","fast_food");
                startActivity(intent);
            }
        });

        snacks1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","snacks");
                startActivity(intent);
            }
        });

        cool_drinks1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","cool_drinks");
                startActivity(intent);
            }
        });

        italian1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","italian");
                startActivity(intent);
            }
        });

        maintain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}