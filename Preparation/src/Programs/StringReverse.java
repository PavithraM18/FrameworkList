package Programs;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stringReverse();
		stringReverseArray();
		subStringReverseEachWords();
	}

	public static void stringReverse()
	{
		String data = "Automation Practise String";
		String rvr ="";
		for (int i = 0; i<data.length() ; i++)
		{
			rvr = data.charAt(i) + rvr;
			
		}
		System.out.println (rvr);
	}
	

	public static void stringReverseArray()
	{
		String w = "Automation Practise String";
		char[] w1 = w.toCharArray();

		for (int i= w1.length -1;i>=0 ; i--)
		{
			System.out.println (w1[i]);
		}
		
	}
	
	public static void subStringReverseEachWords()
	{
		String word = "Automation Practise String";
		String[] datas = word.split(" ");
		String rvrstring ="";
		
		for (int i =0 ; i <datas.length ; i++ )
		{
			String data = datas[i];
			String rvrword ="";
			
			for (int j = data.length()-1; j >= 0 ; j--)
			{
				
				rvrword = rvrword + data.charAt(j);
			}
			rvrstring = rvrstring+rvrword+" ";
		}
		System.out.println (rvrstring);
	}
}
