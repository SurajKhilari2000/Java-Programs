package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set< String> set= new HashSet<String>();
		set.add("Riya");
		set.add("Ravi");
		set.add("Riya");
		set.add("Merra");
		set.add(null);
		
		System.out.println("implenting hashSet : ");
		for(String string : set) {
			System.out.println(string);
		}
        
		LinkedHashSet<String > linkedHashSet= new  LinkedHashSet<String>();
		linkedHashSet.add("Mango");
		linkedHashSet.add("Banana");
		linkedHashSet.add("Mango");
		linkedHashSet.add("Guava");
		linkedHashSet.add(null);
		
		System.out.println("Implementing linkedhashset : \n"+linkedHashSet);
		
		TreeSet<String > treeSet= new TreeSet<String>();
		treeSet.add("Pizza");
		treeSet.add("Burger");
		treeSet.add("Coffee");
		treeSet.add("Burger");
		//treeSet.add(null);
		System.out.println("Implementing treeset : \n"+treeSet);

		


	}

}
