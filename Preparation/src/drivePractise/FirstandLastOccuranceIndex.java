package drivePractise;

public class FirstandLastOccuranceIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 2, 2, 2, 1, 4, 7 ,8 ,8 }; 
        int target = 1; 
        findFirstAndLastIndex(arr, target); 
	}

	private static void findFirstAndLastIndex(int[] arr, int target) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int first = -1; int last = -1;
		for (int i = 0 ; i<n;i++)
		{
			if (arr[i] == target && first == -1)
			{
				first = i;
			}
			else if (arr[i] == target && first != -1)
			{
				last = i;
			}
			
			
		}
		System.out.println("first index is : " + first);
		System.out.println("last index is : " +last );
	}

}
