package drivePractise;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String1 value: ");
		String str1 = sc.next();
		System.out.println("Enter the String2 value: ");
		String str2 = sc.next();
		
		System.out.println(areAnagramsCheck(str1,str2));
		sc.close();
	}

	public static boolean areAnagramsCheck(String str1, String str2) {
		// TODO Auto-generated method stub
		boolean status = false; 
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		// if length is not equal then it wont be anagram string , return false value
		if(c1.length != c2.length)
		{
			status =  false;
		}
		//if length is equal , sort the order and verify the char
		else 
		{
			Arrays.sort(c1);
			Arrays.sort(c2);
			//Arrays.equals(c1, c2);
			for (int i = 0;i<c1.length;i++)
			{
				if (c1[i]!= c2[i])
				{
					status =  false;
				}
				status = true;
			}
		}
		return status ;
		
	}

}
