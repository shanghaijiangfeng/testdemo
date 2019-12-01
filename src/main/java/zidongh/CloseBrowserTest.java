package zidongh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseBrowserTest {
	@Test
	public void CloseBrowser() throws InterruptedException{
		//设置chrome驱动路径
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//实例化chrome浏览器（启动浏览器）
		WebDriver driver=new ChromeDriver();
		//等待5s
		Thread.sleep(5000);
		//关闭浏览器
		driver.close();
	}
	
}
