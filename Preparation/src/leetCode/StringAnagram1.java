package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class StringAnagram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] input = {"act", "god", "not", "is", "cat", "dog", "tac", "ton"};
		List<List<String>> result = groupAnagrams(input);
		for( List<String> i : result)
		{
			System.out.println(i);
		}
	}
	public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new LinkedHashMap<>(); 

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            if (map.containsKey(sortedStr))
             {
                map.get(sortedStr).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sortedStr, list);
            }
        }
        return new ArrayList<>(map.values());

    }

}
