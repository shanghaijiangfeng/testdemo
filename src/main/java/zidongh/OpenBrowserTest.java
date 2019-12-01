package zidongh;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenBrowserTest{
	WebDriver driver;
	@BeforeMethod
	public void jf() {
		System.out.println("测试方法");
	}
	@Test
	public void openChrome() {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		
		 
	}

}
