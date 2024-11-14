package practiceCode;

import java.util.Arrays;

public class SortTheArrayDescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {25, 11, 77, 75, 56,5,27};
		Arrays.sort(arr);
		for (int i = arr.length-1; i >= 0 ; i--)
		{
			System.out.println(arr[i]);
		}

	}

}
