package com.example.gourmetfromhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_create = findViewById(R.id.button2);
        Button button_order = findViewById(R.id.button1);
        button_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Create A Menu", Toast.LENGTH_SHORT).show();
                open_create_menu();

            }
        });

        button_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Order Food", Toast.LENGTH_SHORT).show();
                order_food();

            }
        });
    }


    public void open_create_menu(){
        Intent createMenu = new Intent(this, newMenu.class);
        startActivity(createMenu);
    }
    private void order_food() {
        Intent orderFood = new Intent(this, QRcode_scanner.class);
        startActivity(orderFood);
    }
}