package leetCode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt("III"));    // Output: 3
        System.out.println(romanToInt("IV"));     // Output: 4
        System.out.println(romanToInt("IX"));     // Output: 9
        System.out.println(romanToInt("LVIII"));  // Output: 58
        System.out.println(romanToInt("MCMXCIV"));// Output: 1994

	}

	private static int romanToInt(String str) {
		
		Map<Character, Integer> romanValues = new HashMap<>();
		romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        
        int result = 0;        
     // Iterate over the Roman numeral string from left to right
		for (int i = 0; i< str.length();i++)
		{
			char c = str.charAt(i);
			
			if (i + 1 < str.length() && romanValues.get(c) < romanValues.get(str.charAt(i + 1))) {
                result -= romanValues.get(c);
            } else {
                result += romanValues.get(c);
            }
		}
		
		return result;
	}

}
