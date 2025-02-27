package Basics;

import static io.restassured.RestAssured.given;
import java.util.ArrayList;

import PojoClassfile.AddPlacePost;
import PojoClassfile.Location;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddPlacePost a = new AddPlacePost();
		a.setAccuracy(50);
		a.setAddress("29, side layout, cohen 09");
		a.setLanguage("French-IN");
		Location l = new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		a.setLocation(l);
		a.setName("Backline house");
		a.setPhone_number("(+91) 983 893 3937");
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");
		a.setTypes(myList);
		a.setWebsite("http://google.com");
		
		RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key", "qaclick123")
		.setContentType(ContentType.JSON).build();
		
		ResponseSpecification responspec = new ResponseSpecBuilder().expectContentType(ContentType.JSON).expectStatusCode(200).build();
		
		RequestSpecification res = given().spec(req).body(a);
		Response response = res.when().post("/maps/api/place/add/json").then().spec(responspec).extract().response();
		String responseString = response.asString();
		System.out.println(responseString);
	}

}
