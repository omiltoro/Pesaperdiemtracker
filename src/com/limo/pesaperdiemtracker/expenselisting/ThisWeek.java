package com.limo.pesaperdiemtracker.expenselisting;

import com.limo.pesaperdiemtracker.R;
import com.limo.pesaperdiemtracker.helpers.DisplayDate;


public class ThisWeek extends TabLayoutListingAbstract {

	@Override
	protected boolean condition(DisplayDate mDisplayDate) {
		return mDisplayDate.isCurrentWeek();
	}
	
	@Override
	protected void setType() {
		type = R.string.sublist_thisweek;
	}

	@Override
	protected void setModifiedValues() {
		isModifiedThisYear = false;
		isModifiedThisMonth = false;
		isModifiedThisWeek = true;
		isModifiedAll = false;
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		if(!isModifiedThisWeek) {
			initListView();
		}
	}
	
}