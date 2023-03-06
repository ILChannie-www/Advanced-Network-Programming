
public class CounterApp{
	public static void main(String args[]){
		Counter counter = new Counter();
		SleepyCounter sleepycounter = new SleepyCounter();
		Thread thread = new Thread(sleepycounter);
		thread.start();
		counter.start();
	}

}