package com.example.adventure;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Egg extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_egg);
	}
	   public void pasaral2 (View DHO){
		   Intent popo= new Intent (this,  Quinto.class);
				startActivity(popo);
				finish();
		}
	

}
