package oop2022_q3;

public class PlusThread implements Runnable {

	Object lock;
	int start;
	int range;
	
	public PlusThread(Object lock, int start, int range) {
		this.lock=lock;
		this.start=start;
		this.range=range;
		
	}
	public void addNumbers(Object lock,  int start,  int  range) {

		synchronized (lock) {
		for(int i=start; i<=range; i++) {
			
				
				try {
					lock.wait();
					lock.notify();
					String a= Thread.currentThread().getName();
					System.out.println(a+"=>"+i+" + "+i+"="+(i+i));
					Thread.sleep(1000);
					
					//notify();
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
		addNumbers(lock, start, range);

		
	}

}
