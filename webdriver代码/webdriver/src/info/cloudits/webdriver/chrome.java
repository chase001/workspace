package info.cloudits.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mychrome();
	}
	public static void mychrome()
	{
		System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
//		�������������Ҳ���Խ�chromedriver.exe���ڡ� C:\Windows\System32��·���¼���
		ChromeOptions options=new ChromeOptions();
		options.addArguments(new String[]{"--test-type","start"});
		WebDriver driver = new ChromeDriver(options);
		Navigation navigation=driver.navigate();
		navigation.to("http://www.baidu.com");
//		driver.close();
//		driver=null;
	}
	public static void ie32()
	{
		System.setProperty("webdriver.ie.driver", "files/iedriver.exe");
//		�������������Ҳ���Խ�chromedriver.exe���ڡ� C:\Windows\System32��·���¼���
		WebDriver driver = new InternetExplorerDriver();
		Navigation navigation=driver.navigate();
		navigation.to("http://www.baidu.com");
	}
	public static void ie64()
	{
		System.setProperty("webdriver.ie.driver", "files/IEDriver64.exe");
//		�������������Ҳ���Խ�chromedriver.exe���ڡ� C:\Windows\System32��·���¼���
		WebDriver driver = new InternetExplorerDriver();
		Navigation navigation=driver.navigate();
		navigation.to("http://www.baidu.com");
	}

}
