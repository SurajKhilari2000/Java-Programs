package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("In", "India");
		map.put("Br", "Barzil");
		map.put("Ge", "Germany");
		map.put("Fr", "France");
		map.put(null, null);
		map.put(null, null);
		
		System.out.println("implementing hash map :");
		for(Map.Entry<String, String> entry :map.entrySet()) {
			System.out.println("Country Code : "+entry.getKey()+" , Country: "+entry.getValue());
			
		}
		System.out.println(map.get("Br"));
		
		
		Map<String , String> trMap= new TreeMap<String, String>();
		trMap.put("BR102", "Coffee");
		trMap.put("L207", "Chole-Puri");
		trMap.put("D305", "Pasta");
		trMap.put("BR105", "Tea");
		trMap.put("L212", "Biryani");
		//trMap.put(null, null);
		
		System.out.println("implementing tree map :");
		for(Map.Entry<String, String> entry :trMap.entrySet()) {
			System.out.println(" Code : "+entry.getKey()+" , Menu : "+entry.getValue());
			
		}
		
		Hashtable< String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("BR102", "Coffee");
		hashtable.put("l212", "Biryani");
		hashtable.put("l22", "Pizza");
		hashtable.put("D106", "Sandwitch");
		//hashtable.put(null, null);
		System.out.println("implementing tree map :");
		for(Map.Entry<String, String> entry :hashtable.entrySet()) {
			System.out.println(" Code :"+entry.getKey()+" , Menu : "+entry.getValue());
			
		}
	}

}
