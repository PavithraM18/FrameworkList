package practiceCode;

public class PrintOddAndEvenNum {

	public static void main(String[] args) {
		int a[] = {4, 11, 50, 16, 56,5,21};
		for (int i = 0;i<a.length;i++)
		{
			if(a[i]%2 == 0)
			{
				System.out.println("Even Numbers in Array:" + a[i]);
			}
			else
			{
				System.out.println("Odd Numbers in Array:" + a[i]);
			}
		}

	}

}
