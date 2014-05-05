package com.limo.confconnect.gson;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.limo.pesaperdiemtracker.utils.Strings;


public class ExpenseTrackerExclusionStrategy implements ExclusionStrategy {

	@Override
	public boolean shouldSkipClass(Class<?> c) {
		return false;
	}

	@Override
	public boolean shouldSkipField(FieldAttributes f) {
//		if(Strings.equal(f.getName(), "fileToDownload")) {return true;}
		if(Strings.equal(f.getName(), "syncBit")) {return true;}
		if(Strings.equal(f.getName(), "id")) {return true;}
		return false;
	}

}
