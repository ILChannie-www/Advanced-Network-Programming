public class WhyWait extends Thread{
	static int sum;
	
	public void run(){
		System.out.println("ww!");
		synchronized(this){
			for(int i=1;i<10;i++) 
				sum=sum+1;
			notify();
		}
	}
	
	public static void main(String[] args) throws Exception{
			WhyWait ww=new WhyWait();
			ww.start();
			
		/*	try{
				System.out.println("main sleep");
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
		*/	
		
				try{
					ww.join();
					System.out.println("main!");
				}
				catch(InterruptedException ie){
					ie.printStackTrace();
					System.exit(1);
				}
				System.out.println("sum = "+ww.sum);
		}


}