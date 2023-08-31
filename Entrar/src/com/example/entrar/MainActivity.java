package com.example.entrar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView j_nombre,j_edad;
	TextView j_resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        j_nombre= (EditText) this.findViewById(R.id.a_nombre);
        j_edad= (EditText) this.findViewById(R.id.a_edad);
        j_resultado= (EditText) this.findViewById(R.id.a_resultado);
        
    }
    public void subir (View DHO){
   String nombre;
   int edad;
   nombre =  j_nombre.getText(). toString();
   edad = Integer.parseInt(j_edad.getText().toString());
   if(edad > 30){
	   j_resultado.setText(nombre+" tienes ya"+edad+" estas ruco");
   }
   else{
   j_resultado.setText(nombre+" apenas tienes "+edad+" estas chavo");
}
}
}
