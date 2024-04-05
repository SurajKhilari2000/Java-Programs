package abstraction;

public abstract class Vehicle {
	public Vehicle() {
		System.out.println("Constructor in abstract class");
		
	}
	public void run() {
		System.out.println("Running safely...");
	}
	public abstract void changeGear();

}
