package Programs;

import java.util.Scanner;

public class FactorialGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // 3! means 1 *2* 3 = 6
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range number for Factorial: ");
		int num = sc.nextInt();
		for (int i = 1; i<=num;i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorical number is : " +fact);
	}

}
