package collection;

import java.util.ArrayList;



public class CRUDDemo {
	ArrayList<String> items = new ArrayList<>();

	public void create() {
		// created
		items.add("Apple");
		items.add("Mango");
		items.add("Banana");
		// read 
		System.out.println("List of items");
		for (String item : items) {
			System.out.println(item);
		}
		System.out.println();


	}
//Update
	public void update() {
		int indexToUpdate = 1 ;
		for(indexToUpdate <=0   &&   indexToUpdate <items.size()) {
			items.set(indexToUpdate,"Kiwi");
			System.out.println("Item at index"+indexToUpdate);
		}
		else {
			System.out.println("Invalid index for updating");
		}	
		
		System.out.println("List of items");
		
		
		for (String item : items) {
			System.out.println(item);
		}
		System.out.println();


	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRUDDemo demo = new CRUDDemo();
		demo.create();
	}

}
