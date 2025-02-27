package leetCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = " the sky is blue ";
		String RevStr = reverseWords(s);
		System.out.println("Input String : " + s +"\n" + "Reversed String: " + RevStr);
		
	}


	private static String reverseWords(String s) {
		// Trim leading and trailing spaces
		s.trim();
		// Split the string into words, preserving empty spaces
		String[] words = s.split("\\s+");
		// Reverse the order of words
		List<String> list = Arrays.asList(words);
		Collections.reverse(list);
		// Join the reversed words with a single space
		return String.join( " ", words);
		
	}

}
