package jaava8features;

import java.util.ArrayList;
import java.util.Collections;

class Product {
	int productid;
	String prroductName;
	float productPrice;

	public Product(int productid, String prroductName, float productPrice) {
		super();
		this.productid = productid;
		this.prroductName = prroductName;
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", prroductName=" + prroductName + ", productPrice=" + productPrice
				+ "]";
	}
}

public class LambdaaComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Product(101, "Keyboard", 3300));
		list.add(new Product(102, "Printer ", 5400));
		list.add(new Product(103, "Laptop", 63000));
		list.add(new Product(104, "MousePad", 1200));
		list.add(new Product(105, "Pendrive", 2400));
		list.add(new Product(106, "Speaker", 1700));

		Collections.sort(list, (p1, p2) -> {
			return p1.prroductName.compareTo(p2.prroductName);
		});
		list.forEach(p -> System.out.println(p));
		System.out.println("--------------------------------------------------");
		Collections.sort(list, (p1, p2) -> {
			if (p1.productPrice == p2.productPrice) {
				return 0;
			} else if (p1.productPrice > p2.productPrice) {
				return 1;
			} else
				return -1;

		});
		list.forEach(p -> System.out.println(p));

	}

}
