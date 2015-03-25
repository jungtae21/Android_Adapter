package com.example.simplelistactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	private Button mButtonSimple1;
	private Button mButtonSimple2;
	private Button mButtonCustomList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mButtonSimple1 = (Button) findViewById(R.id.simple_list1);
		mButtonSimple2 = (Button) findViewById(R.id.simple_list2);
		mButtonCustomList = (Button) findViewById(R.id.custom_list);
		
		mButtonSimple1.setOnClickListener(this);
		mButtonSimple2.setOnClickListener(this);
		mButtonCustomList.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()) {
		case R.id.simple_list1:
			Intent intentSimpleList1 = new Intent(this,
					SimpleListActivity.class);
			startActivity(intentSimpleList1);
			break;
		case R.id.simple_list2:
			Intent intentSimpleList2 = new Intent(this,
					SimpleList2Activity.class);
			startActivity(intentSimpleList2);
			break;
		case R.id.custom_list:
			Intent intenCustomList = new Intent(this, CustomListActivity.class);
			startActivity(intenCustomList);
			break;
		}
	}

}
