package Files;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class DynamicJson {
	
	@Test(dataProvider = "BooksData")
	public void addBook(String isbn, String aisle) 
	{
		RestAssured.baseURI = "http://216.10.245.166";
		String response = given().log().all().header("Content-Type", "application/json")
		.body(PayLoad.addBookApi(isbn,aisle))
		.when().post("/Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200).extract().asString();
		JsonPath js = ReusableMethods.rawToJson(response);
		String bookId = js.get("ID");
		System.out.println(bookId);
	}
	
	@DataProvider(name = "BooksData")
	public Object[][] getData()
	{
		Object[][] dataList = new Object[][]{{"abc","456"},{"def","789"},{"ghi","012"}};
		return dataList;
	}
	
}
