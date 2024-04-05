package ClassAndObject;

public class ThisConstructor {

	
		String str;
		int n;

	public ThisConstructor() {
			this("Hello User!!!!");
		}

	public ThisConstructor(String str) {
		this(10);
		this.str = str;
	}

	public ThisConstructor(int n) {
		this.n = n;
	}

	public void print() {
		System.out.println(n + " " + str);
	}

	public static void main(String[] args) {
		ThisConstructor m = new ThisConstructor();
		m.print();
	}

}
