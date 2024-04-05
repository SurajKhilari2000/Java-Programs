package multithreading;

public class MyThread2 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 myThread2 = new MyThread2();
		Thread thread= new Thread(myThread2);
		thread.setName("Thread1");
		thread.start();
		
		Thread thread1= new Thread(myThread2);
		thread1.setName("Thread2");
		thread1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {       
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("executing thread :"+Thread.currentThread().getName());
		}
		
	}

}
