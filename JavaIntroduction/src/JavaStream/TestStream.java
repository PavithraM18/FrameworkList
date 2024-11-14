package JavaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Test
	public void test()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abijth");
		names.add("Dan");
		names.add("Akash");
		names.add("Balu");
		names.add("Arjun");
		names.add("Ram");
		int count = 0;
		for(int i = 0;i<names.size();i++)
		{
			if (names.get(i).contains("A"))
			{
				count = count+1;
			}
		}
		System.out.println(count);
		System.out.println("**************");
	}

	@Test
	public void streamFilter()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abijth");
		names.add("Dan");
		names.add("Akash");
		names.add("Arjun");
		names.add("Ram");
		long total = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println("total:"+ total);
		long value = Stream.of("Abijth","Dan","Akash","Arun","Ram","Arjun").filter(s->
		{
			return s.startsWith("A");		
			
		}).count();
		System.out.println("value:"+value);
		//print all the name in the arraylist
		names.stream().forEach(s-> System.out.println(s));
		System.out.println("**************");
		//print specific names in the list which is greater than 4char
		//limit will print only entered value
		names.stream().filter(s-> s.length()>4).limit(1).forEach(d-> System.out.println(d));
			System.out.println("**************");
	}
	
	@Test
	public void streamMap()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Anna");
		names.add("Dana");
		names.add("Arul");
		names.add("Ben");
		names.add("Steph");
		
		//print the names which has last letter as 'a' with upper case
		Stream.of("Abijth","Dan","Akash","Arun","Ram","Arjun").filter(s->s.endsWith("n")).map(s-> s.toUpperCase()).
		forEach(s->System.out.println(s) );
		System.out.println("-----------");
		//print the names which has 1st letter as 'a' with upper case and sorted
		List<String> names1 = Arrays.asList("Abijth","Dan","Akash","Arun","Ram","Arjun");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s-> s.toUpperCase()).
		forEach(s->System.out.println(s));
		System.out.println("%%%%%%%%%%%%%");
		
		//Merging 2 different list
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		newStream.sorted().forEach(s->System.out.println(s));
		System.out.println("$$$$$$$$$$$$$$");
		Stream<String> newStream1 = Stream.concat(names.stream(), names1.stream());
		boolean flag = newStream1.anyMatch(s->s.equalsIgnoreCase("anna"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	
	@Test
	public void streamCollect()
	{
		List<String> ls = Stream.of("Abijth","Dan","Akash","Arun","Ram","Arjun").filter(s->s.endsWith("n")).map(s-> s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(1));
		System.out.println("___________________");
		
		List<Integer> values = Arrays.asList(3,2,2,9,7,1,5);
		values.stream().distinct().forEach(s->System.out.println(s));
		System.out.println("_______^^^^^^____");
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(3));
		System.out.println("_______^^^^^^____");
	}
}
