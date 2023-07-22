package oop2022_q3;

public class MultiplyThread implements Runnable{
	
	Object lock;
	int start;
	int range;
	

	public MultiplyThread(Object lock, int start, int range) {
	this.lock=lock;
	this.start=start;
	this.range=range;
		
	}
	
	public void multiplyNumbers(Object lock,int start, int range) {
		synchronized (lock) {
			
			for(int i=start;i<=range; i++) {
				
				try {
					lock.notify();
					String b = Thread.currentThread().getName();
					System.out.println(b+"=>"+i+" * "+i+ " = "+ (i*i));
					Thread.sleep(1000);
					lock.wait();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		multiplyNumbers(lock, start, range);
	}

}
