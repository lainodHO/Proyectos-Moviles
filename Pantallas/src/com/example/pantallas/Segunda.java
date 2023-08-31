package com.example.pantallas;

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
		   Intent popo= new Intent (this,  Primera.class);
				startActivity(popo);
				finish();
}
}
