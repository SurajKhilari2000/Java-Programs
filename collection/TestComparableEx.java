package collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparableEx {

	void ComparatorDemo() {
		ArrayList<Book1> list = new ArrayList<Book1>();
		list.add(new Book1(3, 5, "Book3", "author3", "publisher3"));
		list.add(new Book1(1, 6, "Book1", "author1", "publisher1"));
		list.add(new Book1(5, 4, "Book5", "author5", "publisher5"));
		list.add(new Book1(4, 5, "Book4", "author4", "publisher4"));
		list.add(new Book1(2, 1, "Book2", "author2", "publisher2"));
		System.out.println("**********Befor sorting *************");
		for(Book1 bk:list) {
			System.out.println(bk.id+" "+bk.quantity+" "+bk.name+" "+bk.author+" "+bk.publisher);
		}
		Collections.sort(list);
		System.out.println("*****After sorting ******");
		for(Book1 bk:list) {
			System.out.println(bk.id+" "+bk.quantity+" "+bk.name+" "+bk.author+" "+bk.publisher);
		}
	}
	public static void main(String[] args) {
		TestComparableEx testComparatorEx= new TestComparableEx();
		testComparatorEx.ComparatorDemo();
	}
}
