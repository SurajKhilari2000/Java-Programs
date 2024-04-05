package multithreading;

public class DaemonThreadEx extends Thread {

	public static void main(String[] args) {
		DaemonThreadEx t1 = new DaemonThreadEx();
		DaemonThreadEx t2 = new DaemonThreadEx();
		DaemonThreadEx t3 = new DaemonThreadEx();
		t1.setDaemon(true);
		t2.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}

	@Override
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon thread works !");
		} else {
			System.out.println("User thread works!");
		}
	}

}
