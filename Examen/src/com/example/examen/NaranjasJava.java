package com.example.examen;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class NaranjasJava extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_naranjas_java);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.naranjas_java, menu);
		return true;
	}

}
