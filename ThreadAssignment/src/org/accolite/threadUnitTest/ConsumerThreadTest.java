package org.accolite.threadUnitTest;


import java.util.concurrent.TimeUnit;

import org.accolite.threadexample.Consumer_Thread;
import org.accolite.threadexample.ResultStore;
import org.junit.Test;
import static org.junit.Assert.*;


 class ConsumerThreadTest {

	public ConsumerThreadTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void checkState() throws InterruptedException
	{
		ResultStore r = new ResultStore();
		Consumer_Thread  ct = new Consumer_Thread(0,5,r);
		ct.run();
		
		TimeUnit.SECONDS.sleep(1);
		
		assertEquals(Thread.State.WAITING,Thread.currentThread().getState());
		

		
	}

	
	
}
