package CoreJavaBrushup1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//checking if array has multiple of 2
		int[] a2 = {4,7,8,2,56,9,21,66,11,2,46};
		
		for (int i =0;i<a2.length; i++)
		{
			if (a2[i]%2 == 0)
			{
				System.out.println(a2[i]);
			}
			else
				System.out.println(a2[i]+ "is not multiple of 2.");
		}

		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Java");
		a.add("Basics");
		a.add("Training");
		a.add("Self");
		System.out.println(a.get(3));
		
		for (int i = 0;i<a.size();i++ )
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("$$$$$$$$$$$$");
		
		for (String name : a)
		{
			System.out.println(name);
		}
		
		// item present in arraylist
		System.out.println(a.contains("Training"));
		
		String[] name= {"pavi","pappu","prayaan"};
		List<String> namearray = Arrays.asList(name);
		System.out.println(namearray.contains("pappu"));
}
}
