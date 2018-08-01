package info.cloudits.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class day4 {
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
	public void testInput(String x)
	{
		//对于文本框的输入我们都使用sendkeys来实现的
	//	Driver.findElement(By.xpath("//input[@id='user']")).sendKeys(new String[]{"abc"});
		Driver.findElement(By.xpath("//input[@id='user']")).sendKeys(new String[]{x});
		Driver.findElement(By.xpath("//input[@id='user']")).clear();
	}
	public void testLink()
	{
		Driver.findElement(By.xpath("//a[@class='baidu']")).click();
	}
	public void testOption()
	{
		WebElement element=Driver.findElement(By.cssSelector("select[name='select']"));
		Select select = new Select(element);
		select.selectByValue("audi");
		select.selectByIndex(0);
		select.selectByVisibleText("Audi");
		//获取当前option的选中项
		String text=select.getFirstSelectedOption().getText();
		System.out.print(text);
		List options=select.getOptions();
		int optionsize=options.size();
		System.out.print(optionsize);
		int i;
		for (i=0;i<optionsize;i++)
		{
			select.selectByIndex(i);
		}
	}
	public void testRadio()
	{
		List elements=Driver.findElements(By.name("identity"));
		WebElement element=(WebElement) elements.get(2);
		element.click();
		element=(WebElement) elements.get(3);
		boolean select=element.isSelected();
		System.out.print(select);

	}
	public void testCheckBox()
	{
		List elements=Driver.findElements(By.xpath("//div[@id='checkbox']/input"));
		int checkboxsize=elements.size();
		int i;
		for(i=0;i<checkboxsize;i++)
		{
		WebElement element=(WebElement) elements.get(i);
		if(element.isSelected())
			{
			}
		else
			{
			element.click();
			}	
		}
	}
	public void testButton()
	{
		WebElement element=Driver.findElement(By.xpath(".//*[@id='button']/input"));
		boolean button=element.isEnabled();
		System.out.print(button);
		element.click();
		String attribute=element.getAttribute("class");
	//	String cssvalue=element.getCssValue("table");
		System.out.print(attribute);
		//System.out.print(cssvalue);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day4 t=new day4();
		t.startFirefox();
		t.goTo();
		//t.testButton();
		t.testCheckBox();
		//t.testRadio();
	//	t.testLink();
		//t.testInput("abc");
	//	t.closeFirefox();
	}
}
