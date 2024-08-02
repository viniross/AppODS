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

        Button ods8 = findViewById(R.id.btnODS8);

        ods8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ods8 = new Intent(getApplicationContext(), ODS8.class);
                startActivity(ods8);
            }
        });

    }


}