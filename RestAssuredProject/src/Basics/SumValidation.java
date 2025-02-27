package Basics;

import org.testng.Assert;
import org.testng.annotations.Test;

import Files.PayLoad;
import io.restassured.path.json.JsonPath;

public class SumValidation {

	@Test
	public void sumOfCourses()
	{
		int sum = 0;
		
		JsonPath js = new JsonPath(PayLoad.coursePrice());
		int count = js.getInt("courses.size()");
		for(int i = 0;i<count; i++)
		{
			int coursePrices = js.get("courses["+i+"].price");
			int courseCopies = js.get("courses["+i+"].copies");
			int amount = courseCopies * coursePrices;
			System.out.println(amount);
			sum = sum+amount;
		}
		System.out.println(sum);
		int totalAmount = js.getInt("dashboard.purchaseAmount");
		Assert.assertEquals(totalAmount, sum);
	}
}
