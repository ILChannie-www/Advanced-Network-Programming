/* Question2 a
public class SleepyCounter implements Runnable{
	public void run(){
		for(int i=10;i<=500;i++){
			System.out.println("SleepyCounter:"+i);
			System.out.println("Interrupt flag:"+Thread.currentThread().isInterrupted());
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String args[]){
		SleepyCounter sleepycounter = new SleepyCounter();
		Thread thread = new Thread(sleepycounter);
		thread.start();
	}

}
*/

/* Question2 b*/
public class SleepyCounter implements Runnable{
	public void run(){
		for(int i=10;i<=500;i++){
			if(Thread.currentThread().isInterrupted()!=true){
				System.out.println("SleepyCounter:"+i);
			}
			else{
				System.out.println("SleepyCounter is died");
				return;
			}
		}
	}
	
	public static void main(String args[]){
		SleepyCounter sleepycounter = new SleepyCounter();
		Thread thread = new Thread(sleepycounter);
		thread.start();
	}

}