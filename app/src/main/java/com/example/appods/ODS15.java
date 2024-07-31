package com.example.appods;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class ODS15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods15);

        Button Botao = findViewById(R.id.btnVoltar);

        Botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Main = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(Main);

            }
        });




        });
    }
}