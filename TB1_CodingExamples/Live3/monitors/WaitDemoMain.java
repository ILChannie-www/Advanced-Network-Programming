public class WaitDemoMain
{
	
	
	public static void main(String[] args)
	{
		
		WhyWait ww = new WhyWait();
		ww.start();
		
		try{
		Thread.sleep(1000);}
		catch(InterruptedException e){
		} 
		// Gets locks for ww before continuing
		synchronized(ww)
		{
			System.out.println("wait!");
			try {
				ww.wait(1);  //waits for notify signal from ww. We wait for a maximum of 100 ms
				System.out.println("out wait!");
			} 
			catch (InterruptedException e)
			{} //this catch should really do something useful (but for a simple demo, we leave it blank)
			
		}
		ww.sum=ww.sum+1;
		System.out.println("Sum = " + ww.sum);
	}
	
	
}