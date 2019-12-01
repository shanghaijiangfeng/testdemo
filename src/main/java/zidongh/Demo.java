package zidongh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	static WebDriver driver;
	 long time=System.currentTimeMillis();
	@BeforeTest
	public void qianzhi() {
		System.setProperty("webdriver.chrome.driver", "E:\\work\\seleniumdemo1701\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	public static void openchrome(WebDriver driver,String user,String passwad) {
		driver.get("https://mail.163.com/");
		
		WebElement zc=driver.findElement(By.id("switchAccountLogin"));
		zc.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		WebElement iframe=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.name("email")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(passwad);
		driver.findElement(By.id("dologin")).click();
		
	}

}
