package com.example.adventure;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Cuarto extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cuarto);
	}

	   public void pasaral2 (View DHO){
		   Intent popo= new Intent (this,  Mal.class);
			startActivity(popo);
				finish();

		}
	   public void pasaral3 (View DHO){
		   Intent popo= new Intent (this,  Quinto.class);
				startActivity(popo);
				finish();

		}
	   public void pasaral4 (View DHO){
		   Intent popo= new Intent (this,  Mal.class);
			startActivity(popo);
			finish();

		}


}



