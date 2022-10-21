package com.example.gourmetfromhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class finish_new_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_new_menu);

        Button finishMenu = findViewById(R.id.finish_menu);
        Button backPrevious = findViewById(R.id.back_previous);

        finishMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        backPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backPreviousStep();

            }
        });

    }

    public void backPreviousStep(){
        Intent newMenuPage = new Intent(this, newMenu.class);
        startActivity(newMenuPage);
    }
}