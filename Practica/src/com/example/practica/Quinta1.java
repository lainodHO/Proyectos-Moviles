package com.example.practica;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Quinta1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cuarta1);
	}
	   public void volver (View DHO){
		   Intent popo= new Intent (this,  Segunda.class);
				startActivity(popo);
				finish();
	
	   }


}
