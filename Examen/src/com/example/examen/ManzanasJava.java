package com.example.examen;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ManzanasJava extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_manzanas_java);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.manzanas_java, menu);
		return true;
	}

}
