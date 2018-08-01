package info.cloudits.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
	protected WebDriver Driver;
	public Page(WebDriver Driver)
	{
		this.Driver=Driver;
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
}
