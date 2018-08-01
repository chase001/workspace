package info.cloudits.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day6 {
//suit,case单元测试里面，我存在多个case可以作为一个簇
public WebDriver Driver;
@BeforeClass
public void Bclass()
	{
		System.out.println("Bclass");
		//做浏览器初始化
	}

@DataProvider
public Object[][] logindata()
	{
		return new Object[][]{{"a"},{"b"}};
	}
@DataProvider(name="logoutdata")
public Object[][] logoutinfo()
	{
		return new Object[][]{{"1"},{"2"},{"3"}};
	}
@BeforeMethod
public void setup()
	{
		System.out.println("setup");
		Driver= new FirefoxDriver();
		Driver.manage().window().maximize();
		Driver.navigate().to("http://www.baidu.com");

	}
@Test
public void test1(String info)
	{
		System.out.println(info);
	}
@Test
public void test2(String info)
	{
		System.out.println(info);
	}
@Test(dataProvider="logindata")
public void baidu(String info)
	{
		Driver.findElement(By.xpath("//*[@id='kw']")).sendKeys(info);
		ScreenShot ss = new ScreenShot(Driver);
		ss.takeScreenshot();
	}
@AfterMethod
public void teardown()
	{
		System.out.println("teardown");
		Driver.close();
	}
@AfterClass
public void Aclass()
	{
		System.out.println("Aclass");
		//浏览器关闭
		Driver.quit();
	}
}
