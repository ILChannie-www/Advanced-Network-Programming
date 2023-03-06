//https://www.javatpoint.com/interrupting-a-thread
public class InterruptingThread4 extends Thread {
	public void run() {
		for (int i = 1; i <= 2; i++) {
			System.out.println("i = " + i +" for thread "+ Thread.currentThread().getName() );
			if (Thread.interrupted()) { //interrupted重置当前线程的中断状态
				System.out.println("code for interrupted thread " + Thread.currentThread().getName());
				System.out.println(Thread.currentThread().interrupted());
			} else {
				System.out.println("code for normal thread " + Thread.currentThread().getName());
				System.out.println(Thread.currentThread().isInterrupted());
			}
		} // end of for loop
	}

	public static void main(String args[]) {
		InterruptingThread4 t1 = new InterruptingThread4();
		InterruptingThread4 t2 = new InterruptingThread4();
		t1.start();
		t1.interrupt();
		t2.start();
	}
}