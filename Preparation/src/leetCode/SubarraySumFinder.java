package leetCode;
import java.util.ArrayList;
import java.util.List;

public class SubarraySumFinder {

    public static List<List<Integer>> findSubarrays(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int start = 0;
        int currentSum = 0;
        
        for (int end = 0; end < arr.length; end++) {
            // Add the current element to the current sum
            currentSum = currentSum + arr[end];
            
            // While currentSum exceeds the target, shrink the window from the left
            while (currentSum > target && start <= end) {
                currentSum = currentSum - arr[start];
                start++;
            }
            
            // If currentSum equals the target, store the subarray
            if (currentSum == target) {
                List<Integer> subarray = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    subarray.add(arr[i]);
                }
                result.add(subarray);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 3, 1, 1, 2};
        int target = 5;
        List<List<Integer>> subarrays = findSubarrays(array, target);
        
        System.out.println("Subarrays with sum " + target + ":");
        for (List<Integer> subarray : subarrays) {
            System.out.println(subarray);
        }
    }
}
