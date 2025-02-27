package Basics;

import java.util.List;

import Files.PayLoad;
import io.restassured.path.json.JsonPath;

public class ComplexJsonparse {

	public static void main(String[] args) {
		
		JsonPath js = new JsonPath(PayLoad.coursePrice());
		
		//1. Print No of courses returned by API
		int count = js.getInt("courses.size()");
		System.out.println(count);
		
		//2. Print Purchase Amount
		int totalAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmount);
		
		//3. Print Title of the first course
		String titleFirstCourse = js.get("courses[0].title");
		System.out.println(titleFirstCourse);
		
		//4. Print All course titles and their respective Prices
		List<Object> courseTitle = js.getList("courses.title");
		System.out.println(courseTitle);
		
		for(int i = 0;i<count; i++)
		{
			System.out.println(js.get("courses["+i+"].price").toString());
			// sys out excepts string, instead of create new variable , can convert into string like this
			
			String courseTitles = js.get("courses["+i+"].title");
			int coursePrices = js.get("courses["+i+"].price");
			System.out.println(courseTitles + "--" + coursePrices);
			
		}
		
		//5. Print no of copies sold by RPA Course
		System.out.println("Print no of copies sold by RPA Course : ");
		for(int i = 0;i<count; i++)
		{
			String courseTitles = js.get("courses["+i+"].title");
			if(courseTitles.equalsIgnoreCase("RPA"))
			{
				int copiesCount = js.getInt("courses["+i+"].copies");
				System.out.println(copiesCount);
				break;
			}
		}
		
		//Verify if Sum of all Course prices matches with Purchase Amount
		
	
	
	}

}
