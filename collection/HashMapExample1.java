package collection;

import java.security.KeyStore.Entry;
import java.util.HashMap;

public class HashMapExample1 {
	public void HashMapdemo() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grapes");
		System.out.println("Iterating HashMap....");
		System.out.println(" key " + " " + " Value");
		for (java.util.Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(" " + m.getKey() + " " + m.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapExample1 hashMapExample1 = new HashMapExample1();
		hashMapExample1.HashMapdemo();

	}

}
