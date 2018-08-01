package info.cloudits.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class action {
	public WebDriver Driver;
	public void startFirefox()
	{
		Driver= new FirefoxDriver();
		Driver.manage().window().maximize();
	}
	public void closeFirefox()
	{
		Driver.close();
		Driver.quit();
	}
	public void goTo()
	{
		//Driver.get("www.baidu.com");
		Driver.navigate().to("file:///D:/work/svnclient/trunk/%E4%B8%AA%E4%BA%BA%E6%96%87%E6%A1%A3/%E5%8E%9F%E5%88%9B%E8%B5%84%E6%96%99/dataguru%E8%AF%BE%E7%A8%8B/webdriver/%E5%87%86%E5%A4%87%E6%96%87%E6%A1%A3/demo.html");
	}
	public void testAlert() {
        WebElement element = Driver.findElement(By.className("alert"));
        Actions action = new Actions(Driver);
        action.click(element).perform();
  //    Driver.findElement(By.className("alert")).click();
        Alert alert = Driver.switchTo().alert();
        String text = alert.getText();
        System.out.println(text);
        alert.accept();
        //alert.dismiss();
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		action my=new action();
		my.startFirefox();
		my.goTo();
		my.testAlert();
	}

}
