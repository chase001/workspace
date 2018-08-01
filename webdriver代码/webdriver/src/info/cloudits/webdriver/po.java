package info.cloudits.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class po {
	public static By input = By.id("user");	
	public static By link = By.xpath("//div[@id='link']/a");
	static WebDriver Driver=new FirefoxDriver();
	public void test1()
	{
		WebElement element = Driver.findElement(po.input);
		element.sendKeys("abc");
	}
	public boolean waitToDisplayed(WebDriver Driver, final By key){
		boolean waitDisplayed = new WebDriverWait(Driver, 10).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.findElement(key).isDisplayed();
            }
        });
		return waitDisplayed;
	}
	public WebElement getElement(WebDriver driver, By key){
		WebElement element = null;
		if(this.waitToDisplayed(driver, key)){
			element = driver.findElement(key);
		}
		return element;
	}
	public void input(WebDriver driver){
		Driver.navigate().to("file:///D:/work/svnclient/trunk/%E4%B8%AA%E4%BA%BA%E6%96%87%E6%A1%A3/%E5%8E%9F%E5%88%9B%E8%B5%84%E6%96%99/dataguru%E8%AF%BE%E7%A8%8B/webdriver/%E5%87%86%E5%A4%87%E6%96%87%E6%A1%A3/demo.html");
		WebElement element = this.getElement(driver, input);
		element.sendKeys("test");
		element.clear();
		element.sendKeys("test");
		String text = element.getAttribute("value");
        System.out.println(text);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		po t=new po();
		t.input(Driver);
	}



}
