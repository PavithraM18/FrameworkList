package practiceCode;

import java.util.Arrays;

public class FindSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {25, 11, 77, 75, 56,3,27};
		usingLoopMethod(arr);
		usingSortMethod(arr);		
	}

	private static void usingLoopMethod(int[] arr) {
	
		int min = arr[0];
		for (int i = 0;i<arr.length ; i++)
		{
			if (arr[i]< min)
				min = arr[i];
		}
		System.out.println("Smallest Element:" + min);
	}

	private static void usingSortMethod(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Smallest Element:" +arr[0]);
	}

}
