package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by lenovo on 2016/10/26.
 */
public class Gridhub {
	//注解，并发配置，同时运行在多个浏览器
    @DataProvider(name = "browser1")
    public  Object[][] data(){
        //记得return返回的后面要加引号，必须是Object类
        return new Object[][]{
                {"http://192.168.1.3:4444","chrome"},
                {"http://192.168.1.3:4444","firefox"}
        };
    }
    @Test(dataProvider = "browser1")
    public void testData(String url,String browser) throws MalformedURLException, InterruptedException {
       DesiredCapabilities desiredCapabilities;
        if (browser=="chrome"){
            desiredCapabilities=DesiredCapabilities.chrome();
        }else if(browser=="firefox"){
            desiredCapabilities=DesiredCapabilities.firefox();
        }else {
            desiredCapabilities=DesiredCapabilities.internetExplorer();
        }
        WebDriver driver=new RemoteWebDriver(new URL(url+"/wd/hub"),desiredCapabilities);
        driver.get("http://www.baidu.com");
        Thread.sleep(5000);
        driver.quit();
    }


}
