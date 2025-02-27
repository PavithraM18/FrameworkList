package Programs;

import java.util.ArrayList;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Count the number of vowels present in the string";
		
		ifCondition(s);
		usingListCondition(s);
		System.out.println (regularExpression(s)); // boolean answer
		
	}

	private static void usingListCondition(String s) {
		s = s.toLowerCase(); 
		int count = 0;
		int notvowel = 0;
		String vow = "aeiou";
		ArrayList<Character> vowels = new ArrayList<Character>();
		for (int i = 0 ; i<vow.length();i++)
		{
			vowels.add(vow.charAt(i));
		}
		for (int j = 0 ;j<s.length();j++)
		{
			if (vowels.contains(s.charAt(j)))
				{
				count++;
				}
			else 
			{
				notvowel++;
			}
		}
		 System.out.println("Total no of vowels in list are: " + count);
		 System.out.println("Total no of Non- vowels in list are: " + notvowel);
	}

	private static boolean regularExpression(String s) {
		s = s.toLowerCase();  
		return s.matches(".*[aeiou].*");
		
	}

	private static void ifCondition(String s) {
		s = s.toLowerCase();    
		int count = 0;
		int notvowel = 0;
		for (int i =0 ; i<s.length();i++)
		{
			if (s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u')
			{
				count++;
			}
			else 
			{
				notvowel++;
			}

	}
		System.out.println("Vowel count" + count);
		System.out.println("Non Vowel count" + notvowel);
	}
	
}
