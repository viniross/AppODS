package com.example.appods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ods1 = findViewById(R.id.btnODS1);
        ods1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ods1 = new Intent(getApplicationContext(), ODS1.class);
                startActivity(ods1);
            }
        });
    }
}