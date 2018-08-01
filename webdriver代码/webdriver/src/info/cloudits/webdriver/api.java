package info.cloudits.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class api {
	public WebDriver driver;
	
	public void start(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	public void close(){
		driver.close();
		driver.quit();
	}
	
	public void goTo(){
		//driver.get("www.baidu.com");
		driver.navigate().to("file:///D:/work/svnclient/trunk/%E4%B8%AA%E4%BA%BA%E6%96%87%E6%A1%A3/%E5%8E%9F%E5%88%9B%E8%B5%84%E6%96%99/dataguru%E8%AF%BE%E7%A8%8B/webdriver/%E5%87%86%E5%A4%87%E6%96%87%E6%A1%A3/demo.html");
	}
	public void testInput(){
//		driver.findElement(By.id("user")).sendKeys("test");
		WebElement element = driver.findElement(By.id("user"));
		element.sendKeys(new String[]{"test"});
	}

	public void testSelect() {
        WebElement element = driver.findElement(By.cssSelector("select[name='select']"));
        Select select = new Select(element);
         List options = select.getOptions();
        int selectcount=options.size();
        System.out.println(selectcount);
        select.selectByValue("opel");
        String text = select.getFirstSelectedOption().getText();
        System.out.println(text);
    }

	public void testCheckBox() {
        List elements = driver.findElements(By.xpath("//div[@id='checkbox']/input"));
        int checkcount=elements.size();
        System.out.print(checkcount);
        WebElement element = (WebElement) elements.get(2);
        element.click();
        boolean check = element.isSelected();
        System.out.println(check);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		api t=new api();
		t.start();
		t.goTo();
		t.testCheckBox();
	//	t.close();

	}
}
