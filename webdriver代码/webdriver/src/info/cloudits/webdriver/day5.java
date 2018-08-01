package info.cloudits.webdriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class day5 {
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
		Driver.navigate().to("file:///D:/work/svnclient/trunk/%E4%B8%AA%E4%BA%BA%E6%96%87%E6%A1%A3/%E5%8E%9F%E5%88%9B%E8%B5%84%E6%96%99/dataguru%E8%AF%BE%E7%A8%8B/webdriver/准备文档/demo.html");
	}
	public void testalert()
	{
	//	Driver.findElement(By.className("alert")).click();
		WebElement element=Driver.findElement(By.className("alert"));
		Actions action=new Actions(Driver);
		action.click(element).perform();
		Alert alert = Driver.switchTo().alert();
		String alertmessage=alert.getText();
		System.out.println(alertmessage);
		alert.accept();
		//alert.dismiss();
	}
	public void testaction()
	{
		WebElement element=Driver.findElement(By.className("over"));
		Actions action=new Actions(Driver);
		String actionmessage=Driver.findElement(By.id("over")).getText();
		System.out.println(actionmessage);
		action.moveToElement(element).perform();
		actionmessage=Driver.findElement(By.id("over")).getText();
		System.out.println(actionmessage);
	}
	public void testupload()
	{
		//autoit
		WebElement element=Driver.findElement(By.id("load"));
		element.sendKeys("d:\\GT_2.1.apk");//注意这里写d://GT_2.1.apk是不对的
		System.out.print("overupload");
	}
	public void testjs()
	{
		Driver.get("http://www.haosou.com/");
		String ret = (String) ((JavascriptExecutor)Driver).executeScript("return document.getElementById('search-button').value;");
		System.out.println(ret);
		
		JavascriptExecutor j = (JavascriptExecutor)Driver;
		j.executeScript("alert('hellow world!')");//jre1.8下面要写一个obj不知道问题为什么，暂时换成1.6来实现
		System.out.print("overjs");
	}
	public void testIframe()
	{
		Driver.findElement(By.id("user")).sendKeys("test");
		WebElement element=Driver.findElement(By.xpath("//iframe[@name='aa']"));
		Driver.switchTo().frame(element);
	//	Driver.switchTo().frame("aa");
		//Driver.switchTo().frame(0);
		Driver.findElement(By.id("user")).sendKeys("iframe test");
		Driver.switchTo().defaultContent();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Driver.findElement(By.id("user")).sendKeys("new test");
	}
	public void testMultiWindow(){
		WebElement element=Driver.findElement(By.className("open"));
		element.click();
		Set<String> handles=Driver.getWindowHandles();
		String handle=Driver.getWindowHandle();//默认最初窗体的句柄
		handles.remove(handle);
		String newhandle=handles.iterator().next();
		System.out.print(handle);
		System.out.print(newhandle);
		Driver.switchTo().window(newhandle);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Driver.findElement(By.xpath("//*[@id='kw']")).sendKeys("mystring");
		Driver.close();
		Driver.switchTo().window(handle);
		Driver.findElement(By.id("user")).sendKeys("new test");
	}
	public List<String> multiWindow(){
		 Iterator<String> it = Driver.getWindowHandles().iterator();
		 List<String> list = new ArrayList<String>();
		 while(it.hasNext()){
			 list.add(it.next());
		 }
		 return list;
	 }

	public void testWait()
	{
		WebElement element=Driver.findElement(By.className("wait"));
		element.click();
/*		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
		Driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
		boolean wait = new WebDriverWait(Driver, 10).until
				(
						new ExpectedCondition<Boolean>()
						{
				        public Boolean apply(WebDriver Driver) {
				                return Driver.findElement(By.className("red")).isDisplayed();
				        		} 
				        }
				);
		System.out.print(wait);
		element=Driver.findElement(By.className("red"));
		System.out.print(element.getText());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day5 myfirefox=new day5();
		myfirefox.startFirefox();
		myfirefox.goTo();
	//	myfirefox.testWait();
		myfirefox.testMultiWindow();
	//	myfirefox.testIframe();
	//	myfirefox.testjs();
	//	myfirefox.testupload();
		//myfirefox.testaction();
		//myfirefox.testalert();

	}

}
