package com.example.abhishek.menuexample1;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	
    	switch (item.getItemId()) {
		case R.id.register:
			Intent in=new Intent(this,Registration.class);
			startActivity(in);
			
			break;

		case R.id.login:
			Intent i1n=new Intent(this,Login.class);
			startActivity(i1n);break;
			
		case R.id.find:
			Intent in1=new Intent(this,Find.class);
			startActivity(in1);
			
			break;
		case R.id.records:
			Intent in2=new Intent(this,Record.class);
			startActivity(in2);
			
			break;
		default:
			break;
		}
    	
    	return true;
    }
    
    
}
