package leetCode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main (String[] args)
	{
		int[] nums = {1,2,3,4,2,5} ;
		int target = 9;
		System.out.println(twoSum(nums,target));
		System.out.println(Arrays.toString(twoSumHaspMap(nums,target)));
		
	}
	
	 public static ArrayList<Integer> twoSum(int[] nums, int target) {

	       ArrayList<Integer> a = new ArrayList<Integer>();
	        int n = nums.length;
	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (nums[j] +nums[i] == target ) {
	                    a.add(i);
	                    a.add(j);
	                              
	                }
	            }
	        }
	        return a;
	    }
	 
	 public static int[] twoSumHaspMap(int[] nums, int target) {
				        HashMap<Integer, Integer> map = new HashMap<>();
		        for (int i = 0; i < nums.length; i++) {
		            int x = nums[i];
		            if (map.containsKey(target - x)) {
		                return new int[]{map.get(target - x), i};
		            }
		            map.put(x, i);
		        }
		        System.out.println(new int[]{});
		        return new int[]{};
		    }
	}
