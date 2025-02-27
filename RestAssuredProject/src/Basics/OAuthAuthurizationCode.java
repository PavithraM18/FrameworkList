package Basics;
import static io.restassured.RestAssured.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.restassured.path.json.JsonPath;

public class OAuthAuthurizationCode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/* WebDriver driver = new ChromeDriver();
		//driver.get("https://accounts.google.com/o/oauth2/v2/auth/oauthchooseaccount?scope=https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email&auth_url=https%3A%2F%2Faccounts.google.com%2Fo%2Foauth2%2Fv2%2Fauth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https%3A%2F%2Frahulshettyacademy.com%2FgetCourse.php&service=lso&o2v=2&ddm=0&flowName=GeneralOAuthFlow");
		driver.get("https://accounts.google.com/v3/signin/identifier?scope=https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email&auth_url=https%3A%2F%2Faccounts.google.com%2Fo%2Foauth2%2Fv2%2Fauth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https%3A%2F%2Frahulshettyacademy.com%2FgetCourse.php&service=lso&o2v=2&ddm=0&flowName=GeneralOAuthFlow&continue=https%3A%2F%2Faccounts.google.com%2Fsignin%2Foauth%2Fconsent%3Fauthuser%3Dunknown%26part%3DAJi8hAPCsKRIpypi5WNSWvgvCMUn68o2C6t2uiO3sv6OpYZFz8oBhUVWwLdp83Cz9lcRaNanbr6DhMYx_5f87bpZyT5P75gshtVxlcEVzilbL5WGNSJguaxs9uEHBAay1dE9Ku3Gqa4ZE8BPJ6Wtbe-8WvtSi9lPR5HkGpjtPNPkrm9Qm9qThR3-JOQN4etib6pooYXuSvMNpvZL9KF8E_V7TXYXM4dumrfwqG-kQnZQ0RuZCKR-AoJDqJ2cyOoYkQESKCfBog44Le5hXKHZ8O8xCqqErIQ4frr-9D3LszVDACxy82qVSFLvZQ7cPqEMCiB2zcj55EfiCUOmbQudaOmvWBUqZu5zQqCs2lSTL_eEirDgC3JlU3-u3x5zcHNk-haelRI2R_Umel4-N2bpK5ZT9oQXgIjwQF8A2Eetl3nS1nxLpaB46EFD_fBtelH0aO71ytArTqkM5YttED9jv1KwRhux6YrHuQ%26flowName%3DGeneralOAuthFlow%26as%3DS1325443571%253A1724417609959549%26client_id%3D692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com%23");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pavithra.ashwin9@gmail.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sairam@12");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		*/
		String url = "https://rahulshettyacademy.com/getCourse.php?code=4%2F0AQlEd8zzLumw_Wbx9SbcP8B1B29KxX4GQ3hAhgwmvyBjRxwHQ-PP99Kh5jEZqu_3TRzdcQ&scope=email+openid+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email&authuser=1&prompt=consent";
		String partialCode = url.split("code=")[1];
		String code = partialCode.split("&")[0];
		System.out.println(code);
		
		
		String accessTokenResponse = given().urlEncodingEnabled(false)
		.queryParams("code",code)
		.queryParams("cliend_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com" )
		.queryParams("client_secret","erZOWM9g3UtwNRj340YYaK_W" )
		.queryParams("redirect_uri","https://rahulshettyacademy.com/getCourse.php" )
		.queryParams("grant_type","authorization_code" ).
		when().log().all().post("https://www.googleapis.com/oauth2/v4/token").asString();
		
		JsonPath js = new JsonPath(accessTokenResponse);
		String accessToken = js.getString("access_token");
	
		String response= given().queryParam("access_token", accessToken).when().log().all().get("https://rahulshettyacademy.com/getCourse.php").asString();
		System.out.println(response);
		

	}

}
