package drivePractise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class CommonInTwoArray {
	// Function for finding elements which   
    // are there in a[] but not in b[].  
    static void findMissing(int a[], int b[],int n, int m)  
    {  
        // Store all elements of second array in a hash table  
        HashSet<Integer> s = new HashSet<>();  
        for (int i = 0; i < m; i++)  
            s.add(b[i]);  
        
        // Print all elements of first array that are not present in hash table  
        for (int i = 0; i < n; i++)  
            if (!s.contains(a[i])) 
                System.out.print(a[i] + " ");  
    }  
  
     public static void main(String []args){ 
          
        int a[] = { 1, 2, 6, 3, 4, 5 };  
        int b[] = { 2, 4, 3, 1, 0 };  
        int n = a.length;  
        int m = b.length;  
      // findMissing(a, b, n, m); 
       commonElements(a, b, n, m);
     }

	 static void commonElements(int[] a, int[] b, int n, int m) {
		
		HashSet<Integer> s = new HashSet<>();
		for(int i = 0;i<n ;i++)
		{
			s.add(a[i]);
		}
		for(int j = 0; j<m;j++)
		{
			if (s.contains(b[j]))
			{
				System.out.println(b[j] + "");
			}
			else
			{
				s.remove(b[j]);
			}
		}
		
} 
}
