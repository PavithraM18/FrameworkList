package geeksForGeeks;

public class MissingInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,5,6,7};
		int n = 7;
		int ele = findMissingElement(arr,n);
		System.out.println("Missing Element in array : " +ele );
	}

	private static int findMissingElement(int[] arr, int n) {
		// TODO Auto-generated method stub
		int exceptedSum = n * (n+1)/2;
		int actualSum = 0;
		
		for(int a : arr)
		{
			actualSum = actualSum+a;
		}
		return exceptedSum -actualSum;
		 
	}

}
