package com.example.pantallas;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Primera extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera);
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
   public void cerrar_apli (View DHO){
		finish();
}
}