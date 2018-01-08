package org.accolite.threadexample;
import java.util.*;
public class MainClass  {
	int a,b;
	//static int firstanswer;
	

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		ResultStore r = new ResultStore();
		int ch=0;

		System.out.println("start");
		System.out.println();
		int a=100;
		while(a>0) {
			
			ch =rand.nextInt(2);
		switch (ch)
		{
		case 0 :
			System.out.println("Farmer " );
			int quantity = rand.nextInt(10);
			System.out.println("Farmer wants to add " + quantity  +" quantity of fruits");
			Farmer_Thread t = new Farmer_Thread(quantity,r);
			Thread t1 = new Thread(t);
			t1.start();
			try {
				t1.join();
				
				
			}
			catch(Exception e )
			{
				
			}
			break;
			
		case 1 :
			
			System.out.println("consumer");
			int fruit = rand.nextInt(4);
			 quantity = rand.nextInt(10);
			 
			

			 System.out.println("consumer wants " + quantity + " "+(String)r.market.keySet().toArray()[fruit] );
			 
				
			Consumer_Thread s = new Consumer_Thread(fruit,quantity,r); 
			
			Thread t2 = new Thread(s);
			
			
			t2.start();
			try
			{
				t2.join();
			}
			catch(Exception e)
			{
				
			}
			
		}
		a--;
		}

				
		
	}
}
	
	


