package Programs;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0,1,1,2,3,5,8 ...etc
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the nummber range: ");
		int number = sc.nextInt();
		int a = 0 , b = 1 , c;
		System.out.println("Fibonacci series is ");
		for (int i = 0;i<number;i++)
		{
			System.out.println(a +" ,");
			c = b +a;
			a = b;
			b = c;
	
		}
		sc.close();
	}

}
