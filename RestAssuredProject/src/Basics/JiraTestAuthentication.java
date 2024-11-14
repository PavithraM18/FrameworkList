package Basics;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

public class JiraTestAuthentication {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			RestAssured.baseURI="https://rahulshettyacademy-team.atlassian.net/";	
	String createIssueResponse 	= given().header("Content-Type","application/json").
			header("Authorization","Basic bXBhdml0aHJhMThAZ21haWwuY29tOiBBVEFUVDN4RmZHRjBDc0dFU2JOZ1d3QkFXY1BOelhDVXVQWmw4ZHFWc1JnYi1PTVk1eHVSM1c5R1Q4dHNsUzhVWUJSb0NfbGQ3NW5LakZtb05VT081NzFvdkY4MkZ5QlFxMnBnVjlzMUZfTld2ekNyajBreTJGLWFKVGJrcEZ4TTlVU3QwMHZYbGxISDltcXI0ZGY3NGlTak82dGUyLUJYeUx0cGszdWFoMWNrR3Q4UXIzbFB4VUk9Q0FBOTI4OEI=")
.body("{\r\n"
		+ "\"fields\": {\r\n"
		+ "\"project\":\r\n"
		+ "{\r\n"
		+ "\"key\": \"SCRUM\"\r\n"
		+ "},\r\n"
		+ "\"summary\": \"Dropdowns are not working\",\r\n"
		+ "\"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
		+ "\"issuetype\": {\r\n"
		+ "\"name\": \"Bug\"\r\n"
		+ "}\r\n"
		+ "}").log().all().post("rest/api/3/issue")
.then().log().all().assertThat().statusCode(201).contentType("application/json").extract().response().asString();

	JsonPath js = new JsonPath(createIssueResponse);	
	String issueId = js.getString("id");		
	System.out.println(issueId);		 	
	given().pathParam("key", issueId).header("X-Atlassian-Token","no-check").
	header("Authorization","Basic bXBhdml0aHJhMThAZ21haWwuY29tOiBBVEFUVDN4RmZHRjBDc0dFU2JOZ1d3QkFXY1BOelhDVXVQWmw4ZHFWc1JnYi1PTVk1eHVSM1c5R1Q4dHNsUzhVWUJSb0NfbGQ3NW5LakZtb05VT081NzFvdkY4MkZ5QlFxMnBnVjlzMUZfTld2ekNyajBreTJGLWFKVGJrcEZ4TTlVU3QwMHZYbGxISDltcXI0ZGY3NGlTak82dGUyLUJYeUx0cGszdWFoMWNrR3Q4UXIzbFB4VUk9Q0FBOTI4OEI=")		
	.multiPart("file",new File("C:/Users/pavithra.mathivanan/OneDrive - InnovaSolutions/Pictures/Screenshots/test.png")).log().all()
	.post("rest/api/3/issue/{key}/attachments").then().log().all().assertThat().statusCode(200); //Add attachment		 		 		 		
	 
	}
}
