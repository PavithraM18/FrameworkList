package Programs;

import java.util.Scanner;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = sc.nextInt();
		if (number%2 == 0) 
		{
			System.out.println(number + " is Even Number");
		}
		else
		{
			System.out.println(number + " is Odd Number");
		}
	}

}
