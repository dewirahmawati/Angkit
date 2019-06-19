package com.dewi.angkot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class R2 extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.r2);
		  Button button1 = (Button) findViewById(R.id.button1);
	        button1.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View view) {
					// Launching News Feed Screen
					Intent a = new Intent(getApplicationContext(), P2.class);
					startActivity(a);
			}});
}
}
