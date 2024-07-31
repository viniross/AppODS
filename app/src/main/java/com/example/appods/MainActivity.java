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
        Button btnODS13 = findViewById(R.id.btnODS13);
        btnODS13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnODS13 = new Intent(getApplicationContext(), ODS13.class);
                startActivity(btnODS13);
            }
        });
    }
}