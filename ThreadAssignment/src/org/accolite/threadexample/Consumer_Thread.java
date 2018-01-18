package org.accolite.threadexample;

import java.lang.Thread.State;

public class Consumer_Thread implements Runnable {
	
	int fruit;
	int quantity;
	ResultStore r;
	public Consumer_Thread(int fruit,int quantity,ResultStore r)
	{
		this.fruit=fruit;
		this.quantity=quantity;
		this.r=r;
	}
	public void addFruits(ResultStore r,int fruit,int quantity)
	{
		System.out.println(r.market.put((String)r.market.keySet().toArray()[fruit],r.market.get(r.market.keySet().toArray()[fruit])-quantity));
		r.empty+=quantity;
		r.full-=quantity;
	}
	public void run()
	{
		int avail_fruit = r.market.get(r.market.keySet().toArray()[fruit]);
		System.out.println( " But market have " + avail_fruit + " quantity left ");

		if(avail_fruit<=quantity)
		{
			System.out.println("sorry !! consumer has to wait");
		}
		else
		{
			System.out.println("consumer consume");
			System.out.println("left fruits in market");
			System.out.println(r.market);
			System.out.println();
			addFruits(r,fruit,quantity);
			
			
		}
	}
	
	

}
