package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// can accept duplicate values
		//ArraList,LinkedList,vector- Implementing List interface
		//array have fixed size where as array list can grow dynamicaly
		//you can access and insert any value in any index
		ArrayList<String> a = new ArrayList<String>();
			a.add("pappu");
			a.add("prayaan");
			a.add("abi");
			 Collections.sort(a); 
			System.out.println(a);
			a.remove(2);
			System.out.println(a);
			a.add("pavi");
			a.add("kanishka");
			
			System.out.println(a.get(1));
			System.out.println(a.contains("kanishka"));
			System.out.println(a.indexOf("pavi"));
			a.add(1, "sample");
			a.add("pappu");
			System.out.println(a);
			System.out.println(a.isEmpty());
			System.out.println(a.size());
			
	
			
	}

}
