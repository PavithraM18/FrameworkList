package practiceCode;

public class RemoveWhiteSpaceFromString {

	public static void main(String[] args) {
		
		String text = "		Hello   World \n This 	is \t Java!		";
		String text1 = "		Hello   World  This 	is  Java!		";
		System.out.println(text1.trim());
		System.out.println(text1.strip());
		System.out.println(text.replace("\\s", ""));
		System.out.println(text.replaceAll("\\s", ""));
	}

}
