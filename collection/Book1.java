package collection;


public class Book1 implements Comparable<Book1>{

int id,quantity;
String name , author,publisher;
public Book1(int id, int quantity, String name, String author, String publisher) {
	super();
	this.id = id;
	this.quantity = quantity;
	this.name = name;
	this.author = author;
	this.publisher = publisher;
}
	
//implementing the abstract method
public int compareTo(Book1 b) {
	if(id>b.id) {
		return 1;
	}
	else if(id<b.id) {
		return -1;
	}else
		return 0;
}



	
}
