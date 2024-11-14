package Programs;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		Dimension d = new Dimension(500,500);
		driver.manage().window().setSize(d);
		Point p = new Point(250, 250);
		driver.manage().window().setPosition(p);
		driver.manage().window().maximize();

	}

}
