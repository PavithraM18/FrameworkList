package JavaCollections;

import java.util.ArrayList;

public class AssignmentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<String> a = new ArrayList<String>();
			a.add("apple");
			a.add("banana");
			a.add("cherry");
			a.add("mango");
			a.add("apple");
			System.out.println("Printing the whole arraylist: "+ a);
			a.remove(0);
			System.out.println("After the duplicate removal: "+ a);
			
			if(a.contains("orange")) {
				System.out.println("Orange is found on the list");
				}
			else
			{
				System.out.println("Orange is not found on the list");
			}
			System.out.println("Size of the arraylist :" + a.size());
			
			for(int i = 0; i<a.size() ; i++)
			{
				System.out.println("Index value "+ i +" "+a.get(i));   
				
			}
			}
	}
