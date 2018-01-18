package org.accolite.threadexample;
import java.util.*;
public class Farmer_Thread implements Runnable {
	int quantity;
	//Integer i;
	ResultStore r;
	Scanner sc = new Scanner(System.in);
	public Farmer_Thread(int quantity,ResultStore r)
	
	{
		this.quantity=quantity;
		this.r=r;
		
	}
	public void run()
	{
		if(quantity>(r.empty))
		{
			System.out.println("But available market is" + r.empty+", market is full,sorry!!");
		}
		else
		{
			Random rand = new Random();
			
			int fruit_index = rand.nextInt(4); 
			System.out.print("farmer add "+ (String)r.market.keySet().toArray()[fruit_index]);
			System.out.println(" " +quantity  +" units");
			System.out.println("current market : ");
			r.market.put((String)r.market.keySet().toArray()[fruit_index] ,r.market.get(r.market.keySet().toArray()[fruit_index])+quantity);
			
		
			System.out.println(r.market);
			//sc.nextLine();
			
			r.empty-=quantity;
			r.full+=quantity;
		}
			}
		}
		
	
	
	


