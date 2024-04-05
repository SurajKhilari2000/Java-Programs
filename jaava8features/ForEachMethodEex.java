package jaava8features;

import java.util.ArrayList;

public class ForEachMethodEex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Thane");
		list.add("Pune");
		list.add("Mumbai");
		list.add("Delhi");
		list.add("Chennai");
		list.add("Baanglore");
		list.forEach(sttr ->System.out.println(sttr));

	}

}
