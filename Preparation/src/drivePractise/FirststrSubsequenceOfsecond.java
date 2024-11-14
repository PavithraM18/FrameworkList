package drivePractise;

public class FirststrSubsequenceOfsecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1 = "gksrek";
	     String s2 = "geeksforgeeks";
	     if(isSubSequence(s1,s2))
	     {
	    	 System.out.println(s1 +" is sub sequence of " + s2);
	     }
	     else
	    	 System.out.println(s1 +" is not sub sequence of " + s2);
	}

	private static boolean isSubSequence(String s1, String s2) {
		int i = 0 ; int j = 0;
		while(i<s1.length() && j <s2.length())
		{
			if(s1.charAt(i) == s2.charAt(j))
			{
				i++;
			}
			j++;
		}
		return i ==s1.length();
	}



}
