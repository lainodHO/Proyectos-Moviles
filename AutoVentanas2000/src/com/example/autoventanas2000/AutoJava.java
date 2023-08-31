package com.example.autoventanas2000;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AutoJava extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auto_android);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.auto_java, menu);
        return true;
    }
    
}
