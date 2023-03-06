
public class Counter extends Thread{
	public void run(){
		for(int i=10;i<=500;i++){
			System.out.println("Counter:"+i);
		}
	}

	
	public static void main(String args[]){
		Counter counter = new Counter();
		counter.start();
	}
	
}