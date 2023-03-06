
public class BufferApp{
	public static void main(String args[]){
		Buffer buffer = new Buffer(50);
		Producer p = new Producer(buffer);
		Consumer c = new Consumer(buffer);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
		
	}

}