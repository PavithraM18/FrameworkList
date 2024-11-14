package Programs;

import java.util.Scanner;

public class IntegerReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");	
		int num = sc.nextInt();
		integerReverseLoop(num); 
		integerReverseStrBuilder(num);
		sc.close();
	}

	private static void integerReverseStrBuilder(int num) {
		String temp = "" + num; 
		StringBuilder sb = new StringBuilder(temp);
		StringBuilder str = sb.reverse();
		System.out.println("Reversed Number : " + str.toString());
	}

	private static void integerReverseLoop(int num) {
		int rev = 0;
		int reminder;
		while (num>0)
		{
			reminder = num%10;
			rev = (rev*10)+reminder;
			num = num /10;
		}
		System.out.println("Reversed Number is: " + rev);
	}

}
