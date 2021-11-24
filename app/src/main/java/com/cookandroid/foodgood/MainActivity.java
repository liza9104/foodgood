package com.cookandroid.foodgood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_morninggood;
    Button btn_lunchgood;
    Button btn_dinnergood;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_morninggood = findViewById(R.id.morninggood);
        btn_lunchgood = findViewById(R.id.lunchgood);
        btn_dinnergood = findViewById(R.id.dinnergood);


        btn_morninggood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"감사합니다!", Toast.LENGTH_SHORT).show();
            }
        });
        btn_lunchgood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"감사합니다!", Toast.LENGTH_SHORT).show();
            }
        });
        btn_dinnergood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"감사합니다!", Toast.LENGTH_SHORT).show();
            }
        });

    }


}