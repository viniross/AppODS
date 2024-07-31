package com.example.appods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnODS4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnODS4 = findViewById(R.id.btnODS4);
        btnODS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ods4 = new Intent(getApplicationContext(), ods4.class);
                startActivity(ods4);
            }
        });
    }

}