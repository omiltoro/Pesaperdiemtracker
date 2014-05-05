package com.limo.pesaperdiemtracker.expenselisting;

import com.limo.pesaperdiemtracker.R;
import com.limo.pesaperdiemtracker.helpers.DisplayDate;

public class All extends TabLayoutListingAbstract {
	
	@Override
	protected boolean condition(DisplayDate mDisplayDate) {
		return true;
	}
	
	@Override
	protected void setType() {
		type = R.string.sublist_all;
	}

	@Override
	protected void setModifiedValues() {
		isModifiedThisYear = false;
		isModifiedThisMonth = false;
		isModifiedThisWeek = false;
		isModifiedAll = true;
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		if(!isModifiedAll) {
			initListView();
		}
	}
	
}
