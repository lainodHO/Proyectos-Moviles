package com.example.adventure;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class Sexto extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sexto);
	}

	 public void cerrar_apli (View DHO){
			finish();
	}

}
