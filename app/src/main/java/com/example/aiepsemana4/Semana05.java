package com.example.aiepsemana4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.firestore.FirebaseFirestore;

import kotlin.contracts.Returns;

public class Semana05 extends AppCompatActivity {
    //crear objetos que estan en activities
    private EditText lat1,lat2,long1,long2;
    TextView distancia;
    private Button limpiar,calcular;

    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semana05);
        // Castong de los objetos y asociarlos con activities
        lat1=(EditText)findViewById(R.id.textLatitud1);
        lat2=(EditText)findViewById(R.id.textLatitud2);
        long1=(EditText)findViewById(R.id.textLongitud1);
        long2=(EditText)findViewById(R.id.textLongitud2);
        limpiar=(Button)findViewById(R.id.botonLimpiar2);
        calcular=(Button)findViewById(R.id.botonCalcular2);
        resultado=(TextView)findViewById(R.id.textResultado2);

        FirebaseFirestore db = FirebaseFirestore.getInstance();

        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lat1.setText("");
                lat2.setText("");
                long1.setText("");
                long2.setText("");
                resultado.setText("0");
                lat1.requestFocus();  //cursor en ubicacion
            }
        });

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                distancia.setText(CalculoDistancia(lat1.getText().toString(),lat2.getText().toString(),long1.getText().toString(),long2.getText().toString()));
            }
        });
    }
// metodo, convertir en double
        private String CalculoDistancia(String la1,String la2, String lo1, String lo2)
        {
            String dist="";

            return dist;

        }
}