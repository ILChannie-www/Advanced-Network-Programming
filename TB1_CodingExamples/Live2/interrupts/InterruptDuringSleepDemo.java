public class InterruptDuringSleepDemo implements Runnable
{
		
	public void run()
	{
		System.out.println("I'm starting the thread");

		while(Thread.currentThread().isInterrupted() == false)
		{
			System.out.println("not interrupt");
			// Do stuff, e.g. processing data
			try {
				System.out.println("not sleep");
				Thread.sleep(1000); //Sleep for 1 second
				System.out.println("sleep");
			} catch (InterruptedException e) {
				System.out.println("I've been interrupted!");
				Thread.currentThread().interrupt(); //We have to launch this interrupt again
													//Because Thread.sleep will have already	
													//set it back to false using interrupted()
			}
		}
		
		System.out.println("I'm ending the thread");
	}
	
		
	public static void main(String[] args)
	{
		InterruptDuringSleepDemo t = new InterruptDuringSleepDemo();
		Thread thread = new Thread(t);
		thread.start();
		
		//Note that you shouldn't usually ignore InterruptedExceptions like below
		//But we're doing it just as a demo
		try {
			Thread.sleep(1000);
			System.out.println("Main!");
		Thread.sleep(10000);
		System.out.println("make it sleep");} catch (InterruptedException e) {}
		
		//After waiting for 2 seconds, this Main Thread calls interrupt on the InterruptExampleThread
		thread.interrupt();
	
	}
}
