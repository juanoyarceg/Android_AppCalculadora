package com.example.proyectocalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Sumar(View v){
        EditText auxNum1 = (EditText) findViewById(R.id.txtNumero1);
        EditText auxNum2 = (EditText) findViewById(R.id.txtNumero2);
        EditText auxRes = (EditText) findViewById(R.id.txtResultado);

        OperacionesMatematicas op = new OperacionesMatematicas();
        op.setNum1(Double.parseDouble(String.valueOf(auxNum1.getText())));
        op.setNum2(Double.parseDouble(String.valueOf(auxNum2.getText())));

        double resultado = op.Sumar();

        auxRes.setText(String.valueOf(resultado));
    }

    public void Restar(View v){
        try
        {
            EditText auxNum1 = (EditText) findViewById(R.id.txtNumero1);
            EditText auxNum2 = (EditText) findViewById(R.id.txtNumero2);
            EditText auxRes = (EditText) findViewById(R.id.txtResultado);

            OperacionesMatematicas op = new OperacionesMatematicas();
            op.setNum1(Double.parseDouble(String.valueOf(auxNum1.getText())));
            op.setNum2(Double.parseDouble(String.valueOf(auxNum2.getText())));

            double resultado = op.Restar();
            auxRes.setText(String.valueOf(resultado));
        }
        catch(NumberFormatException ex)
        {
            this.Mensaje("Error en el ingreso de los datos");
        }
    }

    public void Multiplicar(View v){
        EditText auxNum1 = (EditText) findViewById(R.id.txtNumero1);
        EditText auxNum2 = (EditText) findViewById(R.id.txtNumero2);
        EditText auxRes = (EditText) findViewById(R.id.txtResultado);

        OperacionesMatematicas op = new OperacionesMatematicas();
        op.setNum1(Double.parseDouble(String.valueOf(auxNum1.getText())));
        op.setNum2(Double.parseDouble(String.valueOf(auxNum2.getText())));

        double resultado = op.Multiplicar();

        auxRes.setText(String.valueOf(resultado));
    }

    public void Dividir(View v){
        EditText auxNum1 = (EditText) findViewById(R.id.txtNumero1);
        EditText auxNum2 = (EditText) findViewById(R.id.txtNumero2);
        EditText auxRes = (EditText) findViewById(R.id.txtResultado);

        if (Double.parseDouble(String.valueOf(auxNum2.getText())) == 0 ) {
            this.Mensaje("No es posible dividir por 0");
        }
        OperacionesMatematicas op = new OperacionesMatematicas();
        op.setNum1(Double.parseDouble(String.valueOf(auxNum1.getText())));
        op.setNum2(Double.parseDouble(String.valueOf(auxNum2.getText())));

        double resultado = op.Dividir();

        auxRes.setText(String.valueOf(resultado));
    }

    private void Mensaje(String texto){
        Toast.makeText(this,texto,Toast.LENGTH_LONG).show();
    }


}

