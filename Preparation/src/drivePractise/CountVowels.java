package drivePractise;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Print the number vowels persent in the text";
		int vowel = 0;
		s.toLowerCase();
		for(int i = 0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u')
			{
				vowel++;
			}
		}
		System.out.println("No of vowels present: " + vowel);
	}

}
