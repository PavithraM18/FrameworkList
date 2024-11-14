package leetCode;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Find the length of the longest substring without repeating characters: ");
		String str = sc.next();
		//String str = "pwwkew";
		System.out.println(lengthOfLongestSubstring(str));
		sc.close();
	}

	private static int lengthOfLongestSubstring(String s) {
		// TODO Auto-generated method stub
	    HashSet<Character> set = new HashSet<>();
		int maxLength = 0; int start = 0;
		
		for (int end = 0; end<s.length();end++)
		{
			char curChar = s.charAt(end);
			while(set.contains(curChar))
			{
				set.remove( s.charAt(start));
				start++;
			}
			set.add(curChar);
			maxLength = Math.max(maxLength, end-start+1);
					
		}
		return maxLength;
	}

}
