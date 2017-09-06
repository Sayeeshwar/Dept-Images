package com.example.departmentimages;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ECEActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ece);
	
		Button b6=(Button) findViewById(R.id.button6);
		b6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i1= new Intent(ECEActivity.this,MainActivity.class);
				startActivity(i1);
				
			}
		} );
	}

}
