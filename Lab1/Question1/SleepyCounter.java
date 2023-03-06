
public class SleepyCounter implements Runnable{
	public void run(){
		for(int i=10;i<=500;i++){
			System.out.println("SleepyCounter:"+i);
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
