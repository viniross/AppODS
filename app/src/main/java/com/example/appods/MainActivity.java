package com.example.appods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ImageButton ODS16 = findViewById(R.id.btnODS16);
    ODS16.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent ODS16 = new Intent(getApplicationContext(), ODS16.class);
        startActivity(ODS16);
      }
    });

    ImageButton ODS17 = findViewById(R.id.btnODS17);
    ODS17.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent ODS17 = new Intent(getApplicationContext(), ODS17.class);
        startActivity(ODS17);
      }
    });
  }
}