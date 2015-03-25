package com.example.simplelistactivity;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class SimpleList2Activity extends Activity{

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_simple_list2);
	    // TODO Auto-generated method stub
	    ListView listView = (ListView)findViewById(R.id.simple_list2_listView);
	    
	    ArrayList<HashMap<String, String>> hashMapList1 = new ArrayList<HashMap<String, String>>(2);
	    
	    for(int i=0 ; i<10 ; i++){
	    	HashMap<String, String> map = new HashMap<String, String>();
	    	map.put("line1", "ù��° ���� "+i+"��");
	    	map.put("line2", "�ι�° ���� "+i+"��");
	    	hashMapList1.add(map);
	    }
	    
	    String[] from = {"line1", "line2"};
	    
	    int[] to = {android.R.id.text1, android.R.id.text2};
	    
	    SimpleAdapter simpleAdapter2 = new SimpleAdapter(this, hashMapList1, android.R.layout.simple_list_item_2, from, to);
	    
	    listView.setAdapter(simpleAdapter2);
	    }
	}
