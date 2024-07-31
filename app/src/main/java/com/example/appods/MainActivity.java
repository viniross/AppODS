package com.example.appods;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnODS14 = findViewById(R.id.btnODS14);
        btnODS14.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS14 = new Intent(getApplicationContext(), ods14.class);
                startActivity(telaODS14);
            }
        });
    }
}