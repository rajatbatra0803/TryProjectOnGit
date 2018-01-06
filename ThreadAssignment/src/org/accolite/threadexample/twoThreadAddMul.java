package org.accolite.threadexample;
import java.util.*;
public class twoThreadAddMul  {
	int a,b;
	//static int firstanswer;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ResultStore r = new ResultStore();
		String ch="a";

		
		while(ch!="s") {
			System.out.println("who wants to start");
			ch =sc.next();
		switch (ch)
		{
		case "p" :
			System.out.println("tell your quantity");
			int quantity = sc.nextInt();
			
			FirtsThread t = new FirtsThread(quantity,r);
			Thread t1 = new Thread(t);
			t1.start();
			try {
				t1.join();
				
				
			}
			catch(Exception e )
			{
				
			}
			break;
			
		case "c" :
			
			
			System.out.println("teell your fruit with quantity");
			String fruit = sc.nextLine();
			 quantity = sc.nextInt();
			SecondThread s = new SecondThread(fruit,quantity,r); 
			
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
		}
//		while()
		//twoThreadAddMul tt = new twoThreadAddMul();
	
		
		
		
		//System.out.println(r.ans);
		
		//System.out.println("output "+r.ans);
				
		
	}
}
	
	


