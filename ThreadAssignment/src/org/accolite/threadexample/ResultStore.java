package org.accolite.threadexample;

import java.util.HashMap;

public class ResultStore {

	int size=10;
	int empty=10;
	int full=0;
	public HashMap<String,Integer> market;
	
 public ResultStore()
	{
		market = new HashMap<>();
		market.put("apple", 0);
		market.put("orange",0);
		market.put("grape",0);
		market.put("watermelon", 0);
	}
}
