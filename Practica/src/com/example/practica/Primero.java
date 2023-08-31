package com.example.practica;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Primero extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primero);
    }

    
    
   public void pasaral2 (View DHO){
   Intent popo= new Intent (this,  Segunda.class);
		startActivity(popo);
		finish();
}
   public void pasaral3 (View DHO){
   Intent popo= new Intent (this,  Tercera.class);
		startActivity(popo);
		finish();
   }
     public void pasaral4 (View DHO){
    Intent popo= new Intent (this,  Cuarta.class);
	     startActivity(popo);
		finish();
}
      public void pasaral5 (View DHO){
	Intent popo= new Intent (this,  Quinta.class);
		startActivity(popo);
		finish();

}
   public void cerrar_apli (View DHO){
		finish();
}
}
