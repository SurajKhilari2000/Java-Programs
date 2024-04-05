package collection;

import java.util.HashMap;

public class HashMapCRUDEEx {
public void CRUD() {
	HashMap<Integer, String> bookMap=new HashMap<Integer, String>();
	//create books 
	Book b1 = new Book(101, "Let us C ", "Yaswant Kanetkar");
	Book b2 = new Book(102, "Data Communication & Networking", "Yaswant Kanetkar");
	Book b3 = new Book(103, "Operating System  ", "Galvin");
	
	//add books

	bookMap.put(b1.getId(), b1);
	bookMap.put(b2.getId(), b2);
	bookMap.put(b3.getId(), b3);
	
	//read books 

	Book read1 = bookMap.get(101);
	Book read2 = bookMap.get(102);
	Book read3 = bookMap.get(103);
	
	//Display books 
	System.out.println("******************Books list*******************");
	System.out.println(read1);
	System.out.println("-----------------------------------------------");
	System.out.println(read2);
	System.out.println("-------------------------------------------------");
	System.out.println(read3);
	System.out.println("-------------------------------------------------");
	
	
	//update book
	if(read1 ! =null) {
		read1.setTitle("Neew title");
		bookMap.put(read1.getId(),read1);
		System.out.println("********Updated books list**************");
		System.out.println("Update book: "+read1);
		
	}
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
