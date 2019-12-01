package zidongh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class Demo2 {
	WebDriver driver;
	@BeforeTest
	public void qianzhi() {
		System.setProperty("webdriver.chrome.driver", "E:\\work\\seleniumdemo1701\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void shangchuan() {
		Demo.openchrome(driver,"jiangfeng199488", "jf199488");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		driver.findElement(By.xpath(".//*[@id='dvNavTop']/ul/li[2]/span[2]")).click();
	
	
		
		
		
		
	}
	

}
