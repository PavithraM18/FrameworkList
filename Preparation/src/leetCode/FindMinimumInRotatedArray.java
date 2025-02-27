package leetCode;

public class FindMinimumInRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
	     int[] nums2 = {5, 10, 12, 15, 27};
	     int[] nums3 = {27, 30, 32, 4,10,12,15,17};
	     System.out.println("Minimum element in array" + findMin(nums1));
	     System.out.println("Minimum element in array" + findMin(nums2));
	     System.out.println("Minimum element in array" + findMin(nums3));
	}

	private static int findMin(int[] nums) {
		int left = 0;
		int right = nums.length-1;
		
		// If the array is not rotated, return the first element
		if(nums[left]<nums[right])
		{
			return nums[left];
		}
		while (left<right)
		{
			int mid = left + (right-left)/2; 
			if (nums[mid] > nums[right])
			{
				 // The minimum element is in the right part
				left = mid + 1;
			}
			else
			{
				// The minimum element is in the left part or at mid
				right = mid;
			}
			
		}
		
		return nums[left];		
	}

}
