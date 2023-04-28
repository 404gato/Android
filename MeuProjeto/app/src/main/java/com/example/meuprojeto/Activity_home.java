package com.example.meuprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_home extends AppCompatActivity {

    Button btn_VoltaCad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btn_VoltaCad = findViewById(R.id.btn_VoltaCad);
        btn_VoltaCad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abreTelaCadastro();

            }
        });
    }

    private void abreTelaCadastro() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}