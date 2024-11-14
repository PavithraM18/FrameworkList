package drivePractise;

import java.util.HashSet;

public class FirstRepeatingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 5, 3, 4, 3, 5, 6}; 
        printFirstRepeating(arr); 
	}

	private static void printFirstRepeating(int[] arr) {
		// TODO Auto-generated method stub
		int min = 0;
		HashSet<Integer> set = new HashSet<>();
		for (int i = arr.length-1; i>= 0 ;i--)
		{
			if(set.contains(arr[i]))
			{
				min = i;
			}
			else
			{
				set.add(arr[i]);
			}
		}
		if (min != 0)
		{
			System.out.println( "The first repeating element in an array index is: " + min);
		}
		else
			System.out.println("There are no repeating elements.");
	}

}
