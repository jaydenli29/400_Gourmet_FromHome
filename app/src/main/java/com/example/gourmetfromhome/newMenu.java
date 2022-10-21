package com.example.gourmetfromhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class newMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_menu);
        Button back_home = findViewById(R.id.backHome);
        Button add_more = findViewById(R.id.addMore);
        Button next = findViewById(R.id.next);

        back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back_main_pape();

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish_new_menu();
            }
        });

    }

    public void back_main_pape(){
        Intent mainPage = new Intent(this, MainActivity.class);
        startActivity(mainPage);
    }

    public void finish_new_menu(){
        Intent finishMenu = new Intent(this, finish_new_menu.class);
        startActivity(finishMenu);
    }
}