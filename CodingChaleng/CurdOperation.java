package CodingChaleng;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CurdOperation {
	List<Product> list = new ArrayList<Product>();

	void AddProduct() {
		list.add(new Product(1, "Apple", 100, "No Description"));
		list.add(new Product(2, "Mango", 400, "No Description"));
		list.add(new Product(3, "Grapes", 300, "No Description"));
		list.add(new Product(4, "Guava", 100, "No Description"));
		list.add(new Product(5, "Banana", 200, "No Description"));
		System.out.println("list : ");
		for (Product li : list) {
			System.out.println(li);
		}

	}

	void UpdateProduct(int productId, String newName, float newPrice, String newDescription) {
		for (Product p : list) {
			if (p.getId() == productId) {
				p.setName(newName);
				p.setPrice(newPrice);
				p.setDescription(newDescription);
				System.out.println("Product Update successfully");

				for (Product li : list) {
					System.out.println(li);
				}
				System.out.println("-------------------------------");
			}
		}
	}

	void DeleteProduct(int productId) {
		for (Product p : list) {
			if (p.getId() == productId) {
				list.remove(productId);
				for (Product li : list) {
					System.out.println(li);
				}
				System.out.println("Producct with id :" + productId + " Deleeted successfully...");

			}
		}
	}

	void SortByPrice() {
		Collections.sort(list, Comparator.comparing(Product::getPrice));
		System.out.println("Product sorted by price ");
		for (Product li : list) {
			System.out.println(li);
		}
	}

	void SortByName() {
		Collections.sort(list, Comparator.comparing(Product::getName));
		System.out.println("Product sorted by Name ");
		for (Product li : list) {
			System.out.println(li);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurdOperation obj = new CurdOperation();
		obj.AddProduct();
		obj.UpdateProduct(3, "Lemon", 80, "no discription");
		obj.DeleteProduct(4);
		obj.SortByPrice();
		obj.SortByName();
	}

}
