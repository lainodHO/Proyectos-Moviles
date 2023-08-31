package com.example.examen;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Principal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }


    public void on_manzanas (View DHO){
    	   Intent popo= new Intent (this,  ManzanasJava.class);
    			startActivity(popo);
    			finish();
    	}

    public void on_naranjass (View DHO){
    	   Intent popo= new Intent (this,  NaranjasJava.class);
    			startActivity(popo);
    			finish();
    	}

    public void on_salir (View DHO){
    			finish();
    	}
}
