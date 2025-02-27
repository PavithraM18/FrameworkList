package Basics;
import static io.restassured.RestAssured.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import PojoClassfile.Api;
import PojoClassfile.GetCourseObject;
import PojoClassfile.WebAutomation;
import io.restassured.path.json.JsonPath;
public class OAuthTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] courseTitles = {"Selenium Webdriver Java","Cypress", "Protractor"}; 
		String response = given().log().all().formParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.formParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
		.formParams("grant_type", "client_credentials")
		.formParams("scope", "trust")
		.when().post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token").asString();
		System.out.println(response);
		JsonPath js = new JsonPath(response);
		String token = js.getString("access_token");
		
		GetCourseObject courseDetails = given().log().all().
		queryParam("access_token", token)
		.when().get("https://rahulshettyacademy.com/oauthapi/getCourseDetails").as(GetCourseObject.class);
		
		//System.out.println(courseDetails);
		System.out.println(courseDetails.getLinkedIn());
		System.out.println(courseDetails.getInstructor());
		System.out.println(courseDetails.getCourses().getApi().get(1).getCourseTitle());
		
		List<Api> apiCourses = courseDetails.getCourses().getApi();
		for (int i =0;i<apiCourses.size(); i++)
		{
			if(apiCourses.get(i).getCourseTitle().equalsIgnoreCase("SoapUI Webservices testing"))
			{
				System.out.println(apiCourses.get(i).getPrice());
			}
		}
		
		ArrayList<String> a = new ArrayList<String>();
		List<WebAutomation> webAutoCourses = courseDetails.getCourses().getWebAutomation();
		for(int i =0;i<webAutoCourses.size();i++)
		{
			a.add(webAutoCourses.get(i).getCourseTitle());
			//System.out.println(webAutoCourses.get(i).getCourseTitle());
		}
		
		List<String> exceptedTitle = Arrays.asList(courseTitles);
		Assert.assertTrue(a.equals(exceptedTitle));
	}

}
