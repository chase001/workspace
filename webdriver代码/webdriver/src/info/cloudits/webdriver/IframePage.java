package info.cloudits.webdriver;

import org.openqa.selenium.By;

public class IframePage {
	public static By input = By.id("user");	
	public static By link = By.xpath("//div[@id='link']/a");
	public static By select = By.cssSelector("select[name='select']");
	public static By radio = By.name("identity");
	public static By check = By.xpath("//div[@id='checkbox']/input");
	public static By button = By.className("button");
	public static By alert = By.className("alert");
	public static By action = By.className("over");
	public static By upload = By.id("load");
}
