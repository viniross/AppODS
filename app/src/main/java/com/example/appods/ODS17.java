package com.example.appods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ODS17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods17);

        TextView textods = findViewById(R.id.textods);
        TextView textods2 = findViewById(R.id.textods2);
        Button buttonODS = findViewById(R.id.buttonODS);

        buttonODS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             finish();

            }
        });
    }
}