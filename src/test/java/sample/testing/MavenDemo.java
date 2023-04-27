package sample.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenDemo {
	
	
	@Test
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
	}

}
