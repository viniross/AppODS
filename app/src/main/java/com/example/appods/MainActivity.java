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
        Button ods9 = findViewById(R.id.btnODS9);

        ods9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ods9 = new Intent(getApplicationContext(), com.example.appods.ods9.class);
                startActivity(ods9);
            }
        });
    }
}