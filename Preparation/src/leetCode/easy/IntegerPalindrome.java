package leetCode.easy;

import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input:");
		int enteredData1 = sc.nextInt();
		System.out.println(isIntegerPalindrome(enteredData1));
		sc.close();
	}

	private static boolean isIntegerPalindrome(int x) {
		if (x<0)
		{
			return false;
		}
		if (x<10)
		{
			return true;
		}
		
		int original = x;
		int reversed = 0;
		while (x>0)
		{
			int d = x%10;
			reversed = reversed*10 + d;
			x/=10;
		}
		
		return original == reversed;
	}

}
