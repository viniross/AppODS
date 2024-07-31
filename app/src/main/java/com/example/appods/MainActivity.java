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

        Button ods7 = findViewById(R.id.btnODS7);

        ods7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ods7 = new Intent(getApplicationContext(), ODS7.class);
                startActivity(ods7);
            }
        });

    }


}