package practiceCode;

import java.util.Arrays;
import java.util.HashMap;

public class FindFrequencyOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hm = new HashMap<>();
		int[] a = {9,7,2,3,3,5,5,6,8,9,5};
		int [] frequncy = new int [a.length];  
		int visited = -1;  
		Arrays.sort(a);
		
		
		for(int i = 0;i<a.length;i++)
		{
			int count = 1;
			for (int j = i+1; j<a.length;j++)
			{
				if (a[i] == a[j])
				{
					count++;
					frequncy[j] = visited;
				}
				  if(frequncy[i] != visited)  
					  frequncy[i] = count;  
			}
			
		}

        System.out.println(" Element | Frequency");  
        for(int i = 0; i < frequncy.length; i++){  
            if(frequncy[i] != visited)  
                System.out.println("    " + a[i] + "    |    " + frequncy[i]);  
        }  
	}

}
