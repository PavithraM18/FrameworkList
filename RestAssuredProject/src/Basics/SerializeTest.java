package Basics;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.ArrayList;

import PojoClassfile.AddPlacePost;
import PojoClassfile.Location;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SerializeTest {

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
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		Response res = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body(a)
		.when().post("/maps/api/place/add/json").
		then().assertThat().statusCode(200).body("scope", equalTo("APP")).header("Server", "Apache/2.4.52 (Ubuntu)")
		.extract().response();
		String response = res.asString();
		System.out.println(response);
	}

}
