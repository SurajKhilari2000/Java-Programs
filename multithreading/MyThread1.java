package multithreading;

public class MyThread1 extends Thread {
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
			System.out.println("executing thread : "+getName());
		}
	}public static void main(String[] args) {
		MyThread1 thread1=new MyThread1();
		thread1.setName("Thread1");
		thread1.start();
		
		MyThread1 thread2=new MyThread1();
		thread2.setName("Thread2");
		thread2.start(); 
	}

}
