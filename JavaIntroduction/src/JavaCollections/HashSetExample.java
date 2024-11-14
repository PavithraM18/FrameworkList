package JavaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("first");
		hs.clone();
		hs.add("second");
		hs.add("thrid");
		hs.add(" ");
		hs.add("fourth");
		hs.add("fifth");
		System.out.println(hs.hashCode());
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println(hs.remove("fourth"));
		
		Iterator<String> i = hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
