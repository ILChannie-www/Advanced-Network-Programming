public class WhyWait extends Thread
{
	public volatile int sum = 0;
	
	public void run()
	{
	
		synchronized(this) //use its own lock
		{
		/*	try{
			this.sleep(2000);
			}catch(InterruptedException e){
			} */
			
			System.out.println("ww");
			for(int i=0; i<10; i++)
			{
				sum = sum + i; //manipulates the sum variable
			}
		/*	try{
			this.sleep(2000);
			}catch(InterruptedException e){
			} */
			System.out.println("notify!");
			notify(); //notify any threads waiting on this monitor to wake up
			System.out.println(Thread.currentThread().getName() +"leave!");
		}
		
		
	}
	
	
	
}
