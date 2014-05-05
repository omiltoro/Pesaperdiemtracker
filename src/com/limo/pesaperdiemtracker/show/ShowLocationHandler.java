package com.limo.pesaperdiemtracker.show;

import com.limo.pesaperdiemtracker.R;

import android.app.Activity;
import android.widget.TextView;



public class ShowLocationHandler {

	private TextView showLocation;

	public ShowLocationHandler(Activity activity, String location) {
		showLocation = (TextView) activity.findViewById(R.id.show_location);
		showLocation.setText(location);
	}

}
