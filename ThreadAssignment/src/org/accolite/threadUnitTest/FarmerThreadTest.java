package org.accolite.threadUnitTest;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.accolite.threadexample.Farmer_Thread;
import org.accolite.threadexample.ResultStore;
import org.junit.Test;

public class FarmerThreadTest {

	
	
	@Test
	public void checkState() throws InterruptedException
	{
		ResultStore r = new ResultStore();
		Farmer_Thread ft = new Farmer_Thread(5,r);
		ft.run();
		
        TimeUnit.SECONDS.sleep(10000);
		
		assertEquals(Thread.State.WAITING,Thread.currentThread().getState());
		

	}

}
