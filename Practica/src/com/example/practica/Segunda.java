package com.example.practica;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Segunda extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_segunda);
	}
	   public void volver (View DHO){
		   Intent popo= new Intent (this,  Primero.class);
				startActivity(popo);
				finish();
	   }
public void pasaral2 (View DHO){
Intent popo= new Intent (this,  Segunda1.class);
	startActivity(popo);
	finish();
}
public void pasaral3 (View DHO){
Intent popo= new Intent (this,  Tercera1.class);
	startActivity(popo);
	finish();
}
 public void pasaral4 (View DHO){
Intent popo= new Intent (this,  Cuarta1.class);
     startActivity(popo);
	finish();
}
  public void pasaral5 (View DHO){
Intent popo= new Intent (this,  Quinta1.class);
	startActivity(popo);
	finish();

}
  public void pasaral6 (View DHO){
Intent popo= new Intent (this,  Sexta1.class);
	startActivity(popo);
	finish();

}
  
public void cerrar_apli (View DHO){
	finish();
}
}
