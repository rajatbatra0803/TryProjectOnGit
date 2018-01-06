package org.accolite.threadexample;

public class SecondThread implements Runnable {
	
	String fruit;
	int quantity;
	ResultStore r;
	public SecondThread(String fruit,int quantity,ResultStore r)
	{
		this.fruit=fruit;
		this.quantity=quantity;
		this.r=r;
	}
	public void run()
	{
		int avail_fruit = r.market.get(fruit);
		if(avail_fruit<=quantity)
		{
			System.out.println("sorry not available");
		}
		else
		{
			r.market.put(fruit,r.market.get(fruit)-quantity);
			r.empty+=quantity;
			r.full-=quantity;
		}
	}

}
