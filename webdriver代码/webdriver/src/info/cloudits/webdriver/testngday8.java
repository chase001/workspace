package info.cloudits.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class testngday8 {
	private WebDriver Driver;
  @Test
  public void f() {
	  DemoPage dp=new DemoPage(Driver);
	  dp.input(Driver, "i love kathy");
	  dp.input_clear(Driver);
  }
  @BeforeClass
  public void setup() {
		Driver= new FirefoxDriver();
		Driver.manage().window().maximize();
		Driver.navigate().to("file:///D:/work/svnclient/trunk/%E4%B8%AA%E4%BA%BA%E6%96%87%E6%A1%A3/%E5%8E%9F%E5%88%9B%E8%B5%84%E6%96%99/dataguru%E8%AF%BE%E7%A8%8B/webdriver/×¼±¸ÎÄµµ/demo.html");
  }

  @AfterClass
  public void teardown() {
	  Driver.close();
	  Driver.quit();
  }

}
