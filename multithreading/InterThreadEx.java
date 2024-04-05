package multithreading;

class Customer {
	private int balance = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw Rs. " + amount);
		if (balance < amount) {
			System.out.println("less balance . Waiting for deposit.....");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		balance -= amount;
		System.out.println("Withdraw completed . Balance : Rs." + balance);
	}

	synchronized void deposit(int amount) {
		System.out.println("Going to deposite Rs." + amount);
		balance += amount;
		System.out.println("Deposite completed .Balance :Rs." + balance);
		notify();
	}
}

public class InterThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		new Thread("Raj") {
			public void run() {
				customer.withdraw(15000);
			};
		}.start();

		new Thread("Riya") {
			public void run() {
				customer.deposit(20000);
			};
		}.start();

	}

}
