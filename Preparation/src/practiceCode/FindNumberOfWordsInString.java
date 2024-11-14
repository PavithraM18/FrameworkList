package practiceCode;

public class FindNumberOfWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "Beauty lies in the eyes of beholder!!";
		usingSplitMethod(msg);
		usingLoopMethod(msg);

	}

	private static void usingLoopMethod(String msg) {
	System.out.println("Orginal msg:" + msg);
	int wordCount = 1;
	for (int i = 0 ;i<msg.length();i++)
	{
		if(msg.charAt(i) == ' ' && msg.charAt(i+1) != ' ')
		{
			wordCount++;
		}
	}
	System.out.println("Words Count :" + wordCount);
	}

	private static void usingSplitMethod(String msg) {
	   /* String[] words = msg.split(" ");  // single space split
		int wordCount = 0;
		for (int i = 0;i<words.length;i++)
		{
			wordCount++;
		}
		System.out.println("Words Count in the given string:" + wordCount); */
		
		String[] words = msg.split("\\s+"); 
		int count = words.length;
		System.out.println("count:" + count);
		//  regex pattern, \\s matches any whitespace character, including spaces, tabs, newlines
		// + is a quantifier meaning "one or more" of the preceding element.
	}

}
