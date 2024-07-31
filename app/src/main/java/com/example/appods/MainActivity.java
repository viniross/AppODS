package com.example.appods;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ImageButton btnODS14 = findViewById(R.id.btnODS14);
    btnODS14.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent telaODS14 = new Intent(getApplicationContext(), ods14.class);
        startActivity(telaODS14);
      }
    });

    ImageButton btnODS4 = findViewById(R.id.btnODS4);
    btnODS4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent ods4 = new Intent(getApplicationContext(), ods4.class);
            startActivity(ods4);
        }
    });

    ImageButton ods5 = findViewById(R.id.btnODS5);
    ods5.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent main = new Intent(getApplicationContext(), ODS5.class);
        startActivity(main);
      }
    });

    ImageButton Btnods6 = findViewById(R.id.btnODS6);
    Btnods6.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent main = new Intent(getApplicationContext(), ods6.class);
        startActivity(main);
      }
    });

    ImageButton ods9 = findViewById(R.id.btnODS9);
    ods9.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
      Intent ods9 = new Intent(getApplicationContext(), com.example.appods.ods9.class);
      startActivity(ods9);
      }
    });

    ImageButton ods10Button = findViewById(R.id.btnODS10);
    ods10Button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, ODS10_Activity.class);
        startActivity(intent);
      }
    });

    ImageButton imgBtnODS11 = findViewById(R.id.btnODS11);
    imgBtnODS11.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent telaODS11 = new Intent(getApplicationContext(), ODS11.class);
        startActivity(telaODS11);
      }
    });

    ImageButton ODS13 = findViewById(R.id.btnODS13);
    ODS13.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent ODS13 = new Intent(getApplicationContext(), ODS13.class);
        startActivity(ODS13);
      }
    });

    ImageButton ODS15 = findViewById(R.id.btnODS15);
    ODS15.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent ODS15 = new Intent(getApplicationContext(), ODS15.class);
        startActivity(ODS15);
      }
    });

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