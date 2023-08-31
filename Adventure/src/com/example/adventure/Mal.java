package com.example.adventure;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Mal extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mal);
	}

	   public void pasaral2 (View DHO){
		   Intent popo= new Intent (this,  Primero.class);
				startActivity(popo);
				finish();
		}

}
