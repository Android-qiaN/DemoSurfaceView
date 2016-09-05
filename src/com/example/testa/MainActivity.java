package com.example.testa;



import android.app.Activity;
import android.os.Bundle;


public class MainActivity extends Activity {
	
	DemoSurfaceView view;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(new DemoSurfaceView(this));
	
	}

}