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
<<<<<<< HEAD:app/src/main/java/com/example/appods/ODS7.java

    }
=======
    };
>>>>>>> 176703d106c0bca01f6d6fdae45850593ee67eed:app/src/main/java/com/example/appods/ODS8.java
}