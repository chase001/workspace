package info.cloudits.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class day8 {
	//po vs QTP
	//1.像对象库的概念
	//2.像描述性编程
	public static By input=By.id("user");
	public WebDriver Driver;
	public void test1()
	{
		WebElement element=Driver.findElement(day8.input);
	//	Driver.findElement(day8.input).sendKeys("abc");
		element.sendKeys("abcd");
		element=Driver.findElement(DemoPage.link);
	}
}
