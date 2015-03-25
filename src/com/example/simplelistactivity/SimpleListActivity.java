package com.example.simplelistactivity;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SimpleListActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_simple_list1);
	    ListView listView = (ListView)findViewById(R.id.simple_list1_listView);
	    
	    ArrayList<String> arrayList1 = new ArrayList<String>();
	    // TODO Auto-generated method stub
	    
	    arrayList1.add("������1");
	    arrayList1.add("������2");
	    arrayList1.add("������3");
	    arrayList1.add("������4");
	    arrayList1.add("������5");
	    arrayList1.add("������6");
	    
	    
	    ArrayAdapter<String> simpleAdapter1;
	    simpleAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList1);
	    listView.setAdapter(simpleAdapter1);
	}
}
