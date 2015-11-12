package com.example.facebookui;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	CheckBox c;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		c=(CheckBox)findViewById(R.id.checkBox1);
		c.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		
		CheckBox t= (CheckBox) v;
		
		if (t.isChecked()) {
			
			Toast.makeText(this,"u checked me....", Toast.LENGTH_SHORT).show();;
			
		}
		else{
			Toast.makeText(this,"u unchecked me....", Toast.LENGTH_SHORT).show();;
			
			
		}
		
	}

	

}
