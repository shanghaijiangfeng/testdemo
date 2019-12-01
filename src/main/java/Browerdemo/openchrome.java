package Browerdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

/**
 * Created by lenovo on 2016/10/11.
 */
public class openchrome {
    WebDriver driver;
    @Test
    public void openchrome(){

        System.setProperty("webdriver.chrome.driver","E:\\work\\seleniumdemo1701\\drivers\\chromedriver.exe");
        
        driver=new ChromeDriver();
        driver.get("http://www.sina.com.cn/");
        String title=driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,"新浪首页");
    }

    @Test
    public void openEdge(){
        System.setProperty("webdriver.edge.driver","/seleniumdemo1701/drivers/chromedriver.exe");
        driver=new EdgeDriver();
    }

    @AfterTest
    public void closedchrome()throws InterruptedException{
        Thread.sleep(5000);
        driver.close();
    }
}
