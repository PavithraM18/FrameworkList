package practiceCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class DuplicateElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sort the array and check for multiple same value
		// later find the duplicate elements 
		int[] a = {9,7,2,3,3,5,5,6,8,9,0};
		 usingSetMethod(a);
		 usingForloop(a);

	}

	private static void usingForloop(int[] a) {
		Arrays.sort(a);
		for(int i = 0; i<a.length;i++)
		{
			for(int j = i+1; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					System.out.println("Duplicate Elements: " + a[j]);
				}
				
			}
		}
		
	}

	private static void usingSetMethod(int[] a) {
		HashSet<Integer> hm = new HashSet<>();
		 HashSet<Integer> dup = new HashSet<>();
			Arrays.sort(a);
			for(int i = 0 ; i<a.length;i++)
			{
				if (!hm.contains(a[i]))
				{
					hm.add(a[i]);
				}
				else
				{
					 boolean duplicate = dup.add(a[i]);
					hm.remove(a[i]);
				}
			char[] duplicate = null;
			
			}
			System.out.println(dup);
			System.out.println(hm);
	}
}
