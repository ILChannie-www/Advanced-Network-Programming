public class DaemonDemo implements Runnable {

	
	public void run()
	{
		//This will loop forever until it get forced to stop
		while(true)
		{
			System.out.println("I'm still running!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args)
	{
		Thread t = new Thread(new DaemonDemo());
		
		// We set Daemon to true, which means that t will be forced to stop when the Main thread finishes
		// Try setting daemon to false...
		t.setDaemon(false);      //守护线程
		System.out.println("start 1");
		t.start();
		System.out.println("Main begin");
		
		// Sleep for 5 secondss
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Main thread finishes before thread t finishes
		System.out.println("Main Thread now finishing");
		//As soon as Main thread finishes, Java automatically kills thread t (because setDaemon(true)
	}
}
