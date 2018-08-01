package info.cloudits.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class findelement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		Navigation navigation=driver.navigate();
		navigation.to("file:///D:/work/svnclient/trunk/%E4%B8%AA%E4%BA%BA%E6%96%87%E6%A1%A3/%E5%8E%9F%E5%88%9B%E8%B5%84%E6%96%99/dataguru%E8%AF%BE%E7%A8%8B/webdriver/%E5%87%86%E5%A4%87%E6%96%87%E6%A1%A3/demo.html");
		driver.findElement(By.xpath(".//*[@id='link']/a")).click();
	}
}
