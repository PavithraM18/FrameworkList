package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class StringAnagramsGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = {"act", "god", "not", "is", "cat", "dog", "tac", "ton"};
		
		List<List<String>> result = groupAnagrams(input);
        
        System.out.println("Anagram groups:");
     
        for (List<String> group : result) {
            System.out.println(group);
	}
	}
	 public static List<List<String>> groupAnagrams(String[] strs) {
	      Map<String, List<String>> anagramMap = new LinkedHashMap<>();
	        
	        for (String str : strs) {
	            // Convert the string to a character array and sort it
	            char[] chars = str.toCharArray();
	            Arrays.sort(chars);
	            String sortedStr = new String(chars);
	           // System.out.println("sorted string value: " + sortedStr);
	            
	            // If the sorted string is not already a key in the map, add it with a new list
	            if (!anagramMap.containsKey(sortedStr)) {
	                anagramMap.put(sortedStr, new ArrayList<>());
	            }
	            
	            // Add the original string to the list corresponding to the sorted key
	            anagramMap.get(sortedStr).add(str);
	        }
	        
	        // Collect all values from the map into a list of lists
	        return new ArrayList<>(anagramMap.values());
	        
}
}