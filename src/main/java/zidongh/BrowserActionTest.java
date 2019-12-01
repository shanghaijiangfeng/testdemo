package zidongh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserActionTest {
	@Test
	public void getTest() throws InterruptedException {
		
		//设置chrome驱动路径
				System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				//实例化chrome浏览器（启动浏览器）
				WebDriver driver=new ChromeDriver();
				//打开网址
				driver.get("https://www.baidu.com/");
				//等待5s
				Thread.sleep(3000);
				//浏览器后退
				driver.navigate().back();
				//等待5s
				Thread.sleep(3000); 
				//关闭浏览器
				driver.close();
		}
	 

}
