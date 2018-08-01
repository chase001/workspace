package info.cloudits.webdriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty(arg0, arg1)
		//myfirefoxplug();
		myfirefox();
	
	}
	public static void myfirefox()
	{
		WebDriver driver = new FirefoxDriver();
		Navigation navigation=driver.navigate();
		navigation.to("http://127.0.0.1/defect/mainpage.php");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("cloud");
		
		//driver.close();
		//driver=null;
	}
	public static void myfirefoxplug()
	{
		File file=new File("files/firebug-2.0.7.xpi");
		FirefoxProfile firefoxProfile=new FirefoxProfile();
		try{
			firefoxProfile.addExtension(file);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		firefoxProfile.setPreference("extensions.firebug.currentVersion", "2.0.7");
		WebDriver driver = new FirefoxDriver(firefoxProfile);
		Navigation navigation=driver.navigate();
		navigation.to("http://www.baidu.com");
		//driver.close();
		//driver=null;
	}
	public static void myfirefoxdefault()
	{
		ProfilesIni allProfiles=new ProfilesIni();
		FirefoxProfile profile=allProfiles.getProfile("default");
		WebDriver driver = new FirefoxDriver(profile);
		Navigation navigation=driver.navigate();
		navigation.to("http://www.baidu.com");
		navigation.refresh();
		//driver.close();
		//driver=null;
	}
	public static void mychrome()
	{
		System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
	//	options.addArguments("--test-type");
		options.addArguments(new String[]{"--test-type"});
		WebDriver driver=new ChromeDriver();
		Navigation navigation=driver.navigate();
		navigation.to("http://www.baidu.com");		
	}
	public static void myie64()
	{
		System.setProperty("webdriver.ie.driver", "files/iedriver.exe");
		WebDriver driver=new InternetExplorerDriver();
		Navigation navigation=driver.navigate();
		navigation.to("http://www.baidu.com");		
	}

}
