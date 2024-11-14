package practiceCode;

import java.util.Arrays;

public class FindSecondSmallestNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {25, 11, 77, 75, 56,5,27};
		usingLoopMethod(a);
		usingSortMethod(a);
		
	}

	private static void usingSortMethod(int[] a) {
		Arrays.sort(a);
		System.out.println("Second smallest number in array: " + a[1]);
		
	}

	private static void usingLoopMethod(int[] a) {
		int temp;
		for (int i = 0;i<a.length; i++)
		{
			for (int j = i+1; j<a.length;j++)
			{
				if (a[i]> a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("2nd smallest number: " + a[1] );
	}

}
