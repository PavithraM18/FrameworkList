package practiceCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class FindLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {25, 11, 77, 75, 56,5,27};
		usingLoopMethod(arr);
		usingSortMethod(arr);
		
	}

	private static void usingSortMethod(int[] arr) {
		Arrays.sort(arr);
		int a = arr.length-1;
		System.out.println("Largest Element: " + arr[a]);
	}

	private static void usingLoopMethod(int[] arr) {
		// TODO Auto-generated method stub
	int max = arr[0];
			for (int i =0 ;i<arr.length; i++)
			{
				if (arr[i]>max)
					{
						max = arr[i];
					}
			}
			System.out.println("Largest Element: " +max);
	}

}
