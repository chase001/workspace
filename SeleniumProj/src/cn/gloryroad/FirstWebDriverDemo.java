package cn.gloryroad;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriverService;


public class FirstWebDriverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String baseUrl;
		
//		driver = new ChromeDriver();
//		baseUrl = "Http://www.sogou.com";

		System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Mozilla Firefox\\firefox.exe");
		driver = new FirefoxDriver();
		baseUrl = "Http://www.sogou.com";		
		
		
		//���ѹ���ҳ
		driver.get(baseUrl + "/");
		//�������������롰����֮·�Զ������ԡ�
		driver.findElement(By.id("query")).sendKeys("����֮·�Զ�������");
		//��������������ť
		driver.findElement(By.id("stb")).click();
	}

}