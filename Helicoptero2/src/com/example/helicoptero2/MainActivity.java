package com.example.helicoptero2;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
int x=230;
ImageView j_helicoptero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        j_helicoptero= (ImageView) this.findViewById(R.id.helicoptero);
        
    }
@SuppressLint("NewApi")
public void subir (View DHO){
	if(x>0){
x = x - 5;
j_helicoptero.setTop(x);
	}
}
	 @SuppressLint("NewApi") 
	 public void bajar (View HOD){
			if(x<0){
				x = x + 5;
				j_helicoptero.setTop(x);
	 }
	 }
}

