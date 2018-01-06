package org.accolite.threadexample;
import java.util.*;
public class FirtsThread implements Runnable {
	int quantity;
	//Integer i;
	ResultStore r;
	Scanner sc = new Scanner(System.in);
	FirtsThread(int quantity,ResultStore r)
	
	{
		this.quantity=quantity;
		this.r=r;
		
	}
	public void run()
	{
		if(quantity>(r.empty))
		{
			System.out.println("market is full,sorry!!");
		}
		else
		{
			
			
			
			String fruit="asd";
			while(fruit!="no") {
				System.out.println("Tell your fruits and quantity");
				fruit = sc.nextLine();
				if(fruit=="no")
					break;
			
			 
		
			int quauntity =  sc.nextInt();
			sc.nextLine();
			r.market.put(fruit,(r.market.get(fruit))+quantity);
			r.empty-=quantity;
			r.full+=quantity;
			System.out.println("ght");
			}
			
			
			}
		}
		
	
	}
	


