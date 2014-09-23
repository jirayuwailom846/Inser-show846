package com.example.show_846;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class Show extends Activity {
	private ListView listView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.showw);
		listView = (ListView) findViewById(R.id.listView1);
		DB myDBClass = new DB(this);
		ArrayList<HashMap<String, String>> arrayList = myDBClass
				.SelectAllData();

		SimpleAdapter adapter;
		adapter = new SimpleAdapter(Show.this, arrayList,
				R.layout.show_item, new String[] { "MemberID", "Name", "Age" },
				new int[] { R.id.ColmemberID, R.id.Colname, R.id.Colage });
		listView.setAdapter(adapter);

	}
}
