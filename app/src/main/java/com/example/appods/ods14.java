package com.example.appods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ods14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods14);

        Button btnods14 = findViewById(R.id.btnods14);
        btnods14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaPrincipal = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(telaPrincipal);
            }
        });
    }

}