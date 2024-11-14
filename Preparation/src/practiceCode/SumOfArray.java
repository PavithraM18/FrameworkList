package practiceCode;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {9,7,2,3,3,5,5,6,8,9,5};
		int sum = 0;
		for(int i = 0;i<a.length;i++)
		{
			sum = sum + a[i];
		}
		System.out.println(sum);
	}

}
