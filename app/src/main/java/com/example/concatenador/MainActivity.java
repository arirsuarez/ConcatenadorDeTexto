package com.example.concatenador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textoAMostrar;
    private EditText primeraMitad;
    private EditText segundaMitad;
    private Button buttonConcatenar;
    private String textoFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonConcatenar = findViewById(R.id.buttonConcatenar);
        segundaMitad = findViewById(R.id.editTextSegundaMitad);
        primeraMitad = findViewById(R.id.editTextPrimeraMitad);
        textoAMostrar = findViewById(R.id.texViewFrase);


        buttonConcatenar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String textoUno = primeraMitad.getText().toString();
                String textoDos = segundaMitad.getText().toString();
                textoFinal = textoUno + " " + textoDos;
                textoAMostrar.setText(textoFinal);
            }
        });
    }
}
