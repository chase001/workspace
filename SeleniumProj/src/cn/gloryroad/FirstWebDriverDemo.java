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
		
		
		//打开搜狗首页
		driver.get(baseUrl + "/");
		//在搜索框中输入“光荣之路自动化测试”
		driver.findElement(By.id("query")).sendKeys("光荣之路自动化测试");
		//单击“搜索”按钮
		driver.findElement(By.id("stb")).click();
	}

}
