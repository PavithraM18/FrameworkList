package Programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prime number : 2,3,5,7,11
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");	
		int number = sc.nextInt();
		if (isPrimeNumber(number))
		{
			System.out.println(number + " is a prime number.");
		} 
		else 
		{
			System.out.println(number + " is not a prime number.");
		}
	}

	private static boolean isPrimeNumber(int num) {
		// TODO Auto-generated method stub
		if(num==0||num==1)
		{  			  
			return false;
		}
		else{  
		for (int i =2 ;i<=num/2 ; i++)
		{
			if (num%2 == 0)
			{
				return false;
			}
		}
		}
		return true;
	}
	
}
