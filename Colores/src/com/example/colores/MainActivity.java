package com.example.colores;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView j_text1;
	TextView j_text2;
	LinearLayout j_lay1;
	LinearLayout j_lay2;
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        j_text1 = (TextView) this.findViewById(R.id.text1);
        j_text2 = (TextView) this.findViewById(R.id.text2);
        j_lay1 = (LinearLayout) this.findViewById(R.id.lay1);
        j_lay2 = (LinearLayout) this.findViewById(R.id.lay2);
    }


    public void invertir (View KKK){
    	j_text1.setTextColor(Color.BLACK);
    	j_text1.setGravity(Gravity.CENTER_HORIZONTAL);
    	j_text1.setBackgroundColor(Color.rgb(255,  200, 50));
    	
    	j_text2.setTextColor(Color.BLACK);
    	j_text2.setGravity(Gravity.CENTER_HORIZONTAL);
    	j_text2.setBackgroundColor(Color.rgb(255,  200, 50));
    	
    	
    	 j_lay1.setBackgroundColor(Color.BLACK);
    	 j_lay2.setBackgroundColor(Color.BLACK);
    }
   	
    public void regresar(View KKK){
    	j_text1.setTextColor(Color.RED);
    	j_text1.setGravity(Gravity.CENTER_HORIZONTAL);
    	j_text1.setBackgroundColor(Color.rgb(255,  200, 50));
    	
    	j_text2.setTextColor(Color.YELLOW);
    	j_text2.setGravity(Gravity.CENTER_HORIZONTAL);
    	j_text2.setBackgroundColor(Color.rgb(255,  200, 50));
    	
    	
    	 j_lay1.setBackgroundColor(Color.RED);
    	 j_lay2.setBackgroundColor(Color.YELLOW);
    }
    
    
  
    
}