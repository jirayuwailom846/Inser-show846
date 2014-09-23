package com.example.show_846;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddActivity extends Activity {

	private Button btn_add;
	private EditText edt_name, edt_age;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add);
		btn_add = (Button) findViewById(R.id.btn_add);
		btn_add.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				SaveData();

			}

		});
	}

	private void SaveData() {
		edt_name = (EditText) findViewById(R.id.txt_name);
		edt_age = (EditText) findViewById(R.id.txt_age);
		DB db = new DB(this);
		long saveSatus = db.InsertData(edt_name.getText().toString(),
				edt_age.getText().toString());
		if(saveSatus <= 0){
			Log.d("Save Error...","Error....");
			
		}
	Toast.makeText(getApplicationContext(), "Add Data Successfully", 
			Toast.LENGTH_SHORT).show();
	
	}
}
