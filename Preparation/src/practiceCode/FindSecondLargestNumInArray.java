package practiceCode;

import java.util.Arrays;

public class FindSecondLargestNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {25, 11, 77, 75, 56,5,27};
		usingLoopMethod(a);
		usingSortMethod(a);

	}

	private static void usingSortMethod(int[] a) {
		Arrays.sort(a);
		int elem = a.length-2;
		System.out.println("Seconf Largest Element in Array: " +a[elem]);
		
	}

	private static void usingLoopMethod(int[] a) {
		// TODO Auto-generated method stub
		int temp;
		for (int i =0 ;i<a.length; i++)
		{
			  for (int j = i + 1; j < a.length; j++)   
	            {  
	                if (a[i] > a[j])   
	                {  
	                    temp = a[i];  
	                    a[i] = a[j];  
	                    a[j] = temp;  
	                }  
	            }  
	        }  
		System.out.println("Largest Element: " + a[a.length-2]);
		}
		
}

	


