package com.example.meuprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_telaInicio;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_telaInicio = findViewById(R.id.btn_inicio);
        btn_telaInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abreTelaInicio();

            }
        });
    }

    private void abreTelaInicio() {
        Intent intent = new Intent(this, Activity_home.class);
        startActivity(intent);
    }


    public void abreTelaInicio(View view) {
        Intent intent = new Intent(this, Activity_home.class);
        startActivity(intent);
    }
}