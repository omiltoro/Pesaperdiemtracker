package com.limo.confconnect.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.limo.confconnect.gson.ExpenseTrackerExclusionStrategy;
import com.limo.confconnect.gson.ExpenseTrackerFieldNamingPolicy;




public class MyGson {

	public Gson get() {
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.setFieldNamingStrategy(new ExpenseTrackerFieldNamingPolicy());
		gsonBuilder.setExclusionStrategies(new ExpenseTrackerExclusionStrategy());
		return gsonBuilder.create(); 
	}
	
}
