package Programs;

import java.util.Scanner;

public class isPalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input:");
		String enteredData = sc.nextLine();
		isStringPalindrome(enteredData);
		sc.close();
	}

	
		private static void isStringPalindrome(String enteredName) {
		String rvr = "";
		for(int i = enteredName.length()-1;i>=0;i--)
		//for(int i = 0;i<enteredName.length();i++)
		{
			//rvr = enteredName.charAt(i) + rvr;
			rvr = rvr+enteredName.charAt(i);
		}
		String exceptedName = rvr;
		System.out.println("Reversed string:" + exceptedName);
		if (enteredName.equalsIgnoreCase(exceptedName))
		{
			System.out.println("Entered string is palindrome: " + exceptedName);
		}
		else
		{
			System.out.println("Entered string is not palindrome: " + exceptedName);
		}
			
	}
	

}
