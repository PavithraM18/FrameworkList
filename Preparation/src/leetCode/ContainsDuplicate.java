package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
	
	public static void main (String[] args)
	{
		int[] nums = {1,2,3,1} ;
	//	System.out.println(containsDuplicate(nums));
		System.out.println(containsDuplicateHashSet(nums));
	}
	
	public static boolean containsDuplicate(int[] num) {
		
		Arrays.sort(num);
		for (int i = 1; i < num.length; i++) {
	        if (num[i] == num[i - 1]) {
	            return true;
	        }
	    }
		return false;
	    
	}
	
public static boolean containsDuplicateHashSet(int[] nums) {
	HashSet<Integer> set = new HashSet<>();
    for (int n : nums) {
        if (!set.add(n)) {
            return true; // Duplicate found
        }
    }
    return false;
}
}


