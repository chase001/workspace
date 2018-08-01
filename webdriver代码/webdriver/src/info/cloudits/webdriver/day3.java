package info.cloudits.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;


public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		Navigation navigation=driver.navigate();
		navigation.to("http://www.baidu.com");
		driver.findElement(By.xpath(".//*[@id='kw']")).sendKeys("webdriver");
		driver.findElement(By.xpath(".//*[@id='su']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String getx=driver.findElement(By.xpath(".//*[@id='1']/h3/a")).getText();
		System.out.println(getx);
		
		
	//	driver.findElement(By.xpath(".//*[@id='u1']/a[2]")).click();
	//	driver.findElement(By.cssSelector("")).click();
	}

}
