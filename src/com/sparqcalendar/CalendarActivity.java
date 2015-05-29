package com.sparqcalendar;

import org.joda.time.DateTime;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class CalendarActivity extends Activity {
	private final String TAG = "CalendarActivity";

	DateTime now;
	ImageView nextDay;
	ImageView prevDay;
	ImageView calendar;
	TextView date;
	TextView space, monday, tuesday, wednesday, thursday, friday;
	ListView classListView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calendar);
		
		nextDay = (ImageView) findViewById(R.id.next_day);
		prevDay = (ImageView) findViewById(R.id.prev_day);
		calendar = (ImageView) findViewById(R.id.calendar);
		date = (TextView) findViewById(R.id.date);
		space = (TextView) findViewById(R.id.space_day);
		monday = (TextView) findViewById(R.id.monday);
		tuesday = (TextView) findViewById(R.id.tuesday);
		wednesday = (TextView) findViewById(R.id.wednesday);
		thursday = (TextView) findViewById(R.id.thursday);
		friday = (TextView) findViewById(R.id.friday);
		classListView = (ListView) findViewById(R.id.classListView);
		
	}

	@Override
	protected void onResume() {
		super.onResume();
		
		now = DateTime.now();
	}

	@Override
	protected void onPause() {
		super.onPause();
	}

	@Override
	public void onBackPressed() {
		super.onBackPressed();
	}
	
	public void onClick(View v) {
		
		switch(v.getId()) {
		case R.id.prev_day:
			break;
		case R.id.next_day:
			break;
		case R.id.calendar:
			break;
		case R.id.date:
			break;
		case R.id.space_day:
			break;
		case R.id.monday:
			break;
		case R.id.tuesday:
			break;
		case R.id.wednesday:
			break;
		case R.id.thursday:
			break;
		case R.id.friday:
			break;
		}
	}
}
