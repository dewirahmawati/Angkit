package com.dewi.angkot;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener {
	TextView textView3,textView4;
	String[] items = { "Terminal Arjosari", "Jl. Raden Intan", "Jl. Simpang R. Panji Suroso", "" +
			"Jl. Jend. A. Yani",  
			"Jl. Letjen S. Parman",
			"Jl. Letjen Sutoyo",
			"Jl. W. R. Supratman",
			"Jl. Panglima Sudirman", 
			"Jl. Patimura",
			"Jl. Trunojoyo",
			"Jl. Kertanegara",
			"Jl. Kahuripan",
			"Jl. Semeru", 
			"Jl. Ijen", 
			"Jl. Bandung", 
			"Jl. Terusan Bogor", 
			"Jl. Mayjen Panjahitan",
			"Jl. Mayjen Haryono",
			"Jl. Tlogomas",
			"Terminal Landung Sari" };
	String[] items2 = { "Jl. Raden Intan", "Jl. Simpang R. Panji Suroso", "" +
			"Jl. Jend. A. Yani",  
			"Jl. Letjen S. Parman",
			"Jl. Letjen Sutoyo",
			"Jl. W. R. Supratman",
			"Jl. Panglima Sudirman", 
			"Jl. Patimura",
			"Jl. Trunojoyo",
			"Jl. Kertanegara",
			"Jl. Kahuripan",
			"Jl. Semeru", 
			"Jl. Ijen", 
			"Jl. Bandung", 
			"Jl. Terusan Bogor", 
			"Jl. Mayjen Panjahitan",
			"Jl. Mayjen Haryono",
			"Jl. Tlogomas",
			"Terminal Landung Sari" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        textView3 = (TextView) findViewById(R.id.textView3);
        Spinner spin = (Spinner) findViewById(R.id.spinner1);
		spin.setOnItemSelectedListener(this);
		ArrayAdapter<String> a = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, items);
		a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spin.setAdapter(a);
		
		textView4 = (TextView) findViewById(R.id.textView4);		
		Spinner spin2 = (Spinner) findViewById(R.id.spinner2);
		spin2.setOnItemSelectedListener(this);
		ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, items2);
		aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spin2.setAdapter(aa);
		
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent a = new Intent(getApplicationContext(), R1.class);
				Intent b = new Intent(getApplicationContext(), R2.class);
				Intent c = new Intent(getApplicationContext(), R3.class);
				Intent d = new Intent(getApplicationContext(), R4.class);
				Intent e = new Intent(getApplicationContext(), R5.class);
				Intent f = new Intent(getApplicationContext(), R6.class);
				Intent g = new Intent(getApplicationContext(), R7.class);
				Intent h = new Intent(getApplicationContext(), R8.class);
				Intent i = new Intent(getApplicationContext(), R9.class);
				Intent j = new Intent(getApplicationContext(), R10.class);
				Intent k = new Intent(getApplicationContext(), R11.class);
				Intent l = new Intent(getApplicationContext(), R12.class);
				Intent m = new Intent(getApplicationContext(), R13.class);
				Intent n = new Intent(getApplicationContext(), R14.class);
				Intent o = new Intent(getApplicationContext(), R15.class);
				Intent p = new Intent(getApplicationContext(), R16.class);
				Intent q = new Intent(getApplicationContext(), R17.class);
				Intent r = new Intent(getApplicationContext(), R18.class);
				Intent s = new Intent(getApplicationContext(), R19.class);
				
				if(textView3.getText()=="Terminal Arjosari"&&textView4.getText()=="Jl. Raden Intan"){
				startActivity(a);
					}
				else if(textView3.getText()=="Terminal Arjosari"&&textView4.getText()=="Jl. Simpang R. Panji Suroso"){
				startActivity(b);
					}
				else if(textView3.getText()=="Terminal Arjosari"&&textView4.getText()=="Jl. Jend. A. Yani"){
					startActivity(c);
						}
				else if(textView3.getText()=="Terminal Arjosari"&&textView4.getText()=="Jl. Letjen S. Parman"){
					startActivity(d);
						}
				else if(textView3.getText()=="Terminal Arjosari"&&textView4.getText()=="Jl. Letjen Sutoyo"){
					startActivity(e);
						}
				else if(textView3.getText()=="Terminal Arjosari"&&textView4.getText()=="Jl. W. R. Supratman"){
					startActivity(f);
						}
				else if(textView3.getText()=="Terminal Arjosari"&&textView4.getText()=="Jl. Panglima Sudirman"){
					startActivity(g);
						}
				else if(textView3.getText()=="Terminal Arjosari"&&textView4.getText()=="Jl. Patimura"){
					startActivity(h);
						}
				else if(textView3.getText()=="Terminal Arjosari"&&textView4.getText()=="Jl. Trunojoyo"){
					startActivity(i);
						}
				else if(textView3.getText()=="Terminal Arjosari"&&textView4.getText()=="Jl. Kertanegara"){
					startActivity(j);
						}
				else if(textView3.getText()=="Terminal Arjosari"&&textView4.getText()=="Jl. Kahuripan"){
					startActivity(k);
						}
				else if(textView3.getText()=="Terminal Arjosari"&&textView4.getText()=="Jl. Semeru"){
					startActivity(l);
						}
				else if(textView3.getText()=="Terminal Arjosari"&&textView4.getText()=="Jl. Ijen"){
					startActivity(m);
						}
				else if(textView3.getText()=="Terminal Arjosari"&&textView4.getText()=="Jl. Bandung"){
					startActivity(n);
						}
				else if(textView3.getText()=="Terminal Arjosari"&&textView4.getText()=="Jl. Terusan Bogor"){
					startActivity(o);
						}
				else if(textView3.getText()=="Terminal Arjosari"&&textView4.getText()=="Jl. Mayjen Panjahitan"){
					startActivity(p);
						}
				else if(textView3.getText()=="Terminal Arjosari"&&textView4.getText()=="Jl. Mayjen Haryono"){
					startActivity(q);
						}
				else if(textView3.getText()=="Terminal Arjosari"&&textView4.getText()=="Jl. Tlogomas"){
					startActivity(r);
						}
				else if(textView3.getText()=="Terminal Arjosari"&&textView4.getText()=="Terminal Landung Sari"){
					startActivity(s);
						}
				else {
					textView3.setText("belum");
					textView4.setText("belum");
				}	
		}});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
		Spinner spin = (Spinner) findViewById(R.id.spinner1);
        int index = spin.getSelectedItemPosition();
        Spinner spin2 = (Spinner) findViewById(R.id.spinner2);
        int index2 = spin2.getSelectedItemPosition();
		String a=(items[index]);
		textView3.setText(a);
		String b=(items2[index2]);
		textView4.setText(b);
	}
	
	public void onNothingSelected(AdapterView<?> parent) {
		textView3.setText("belum");
		textView4.setText("belum");
}
}
