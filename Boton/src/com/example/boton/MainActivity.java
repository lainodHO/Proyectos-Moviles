package com.example.boton;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView j_primero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        j_primero = (TextView) this.findViewById(R.id.primero);
    }


    public void chango (View KKK){
    	j_primero.setText("ROSALES");
    	j_primero.setTextColor(Color.CYAN);
    	j_primero.setTextSize(27);
    	j_primero.setGravity(Gravity.CENTER_HORIZONTAL);
    	j_primero.setBackgroundColor(Color.rgb(255,  200, 50));
    	
    	
   	
    	
    }
    
    
}
