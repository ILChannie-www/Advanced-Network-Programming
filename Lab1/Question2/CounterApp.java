
/* Question2 a b
public class CounterApp{
	public static void main(String args[]){
		Counter counter = new Counter();
		SleepyCounter sleepycounter = new SleepyCounter();
		Thread thread = new Thread(sleepycounter);
		thread.start();
		counter.start();
		thread.interrupt();
	}

}
*/


/*Question2 c
public class CounterApp{
	public static void main(String args[]){
		Counter counter = new Counter();
		SleepyCounter sleepycounter = new SleepyCounter();
		Thread thread = new Thread(sleepycounter);
		thread.start();
		counter.start();
	//	thread.interrupt();
		try{
			thread.join();
		}catch (Exception e) {
				e.printStackTrace();
		}
		System.out.println("Finished");
	}

}
*/

/*Question2 d*/
public class CounterApp{

	public static void main(String args[]){
		Counter counter = new Counter();
		SleepyCounter sleepycounter = new SleepyCounter();
		Thread thread = new Thread(sleepycounter);
		CounterApp counterapp = new CounterApp();
		thread.start();
		counter.start();
		while(Thread.currentThread().isInterrupted()==false){
			try{
				thread.join();
			}catch (InterruptedException e) {
					e.printStackTrace();
			}	
			System.out.println("Finished");
		//	counterapp.pleaseFinish();
		}
	}
	
	public void pleaseFinish(){
		Thread.currentThread().interrupt();
	}

}
