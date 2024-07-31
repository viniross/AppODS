package com.example.appods;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class ODS8 extends AppCompatActivity {

    Button btnSAIR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods8);

            btnSAIR = findViewById(R.id.btnSAIR);
            btnSAIR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proximaTela = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(proximaTela);
            }
        });
    };
}