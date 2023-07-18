package basepg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass {

	public WebDriver driver;
	 @BeforeClass
	 public void setUp()
	 {
		 driver =new ChromeDriver();
		 driver.get("https://funkforhire.co.in/");
		 driver.manage().window().maximize();
		 
		 
	 }
	
}
