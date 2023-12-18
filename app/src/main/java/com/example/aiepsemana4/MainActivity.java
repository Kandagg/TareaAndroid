package com.example.aiepsemana4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {
    //crear objetos que estan en activities
private EditText texto1;
private EditText pass;
private Button limpiar,accion,calcular;

private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Castong de los objetos y asociarlos con activities
        texto1=(EditText)findViewById(R.id.cajaTexto);
        pass=(EditText)findViewById(R.id.cajaPass);
        limpiar=(Button)findViewById(R.id.botonLimpiar);
        accion=(Button)findViewById(R.id.botonAccion);
        resultado=(TextView)findViewById(R.id.cajaResultado);
        calcular=(Button)findViewById(R.id.botonCalcular);

        FirebaseFirestore db = FirebaseFirestore.getInstance();

        //programacion eventos
        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texto1.setText("");
                pass.setText("");
                resultado.setText("");
                texto1.requestFocus();
            }
        });
        accion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texto1.setText("Hola Mundo Android");
            }
        });

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=10;
                int b=Integer.parseInt(texto1.getText().toString());
                int r=a+b;
                resultado.setText(String.valueOf(r));
            }
        });

    }

    }
