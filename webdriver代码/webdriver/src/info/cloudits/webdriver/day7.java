package info.cloudits.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day7 {
@Test
public void test1()
	{
		int actual;
		int expected;
		actual=1;
		expected=1;
		System.out.println("测试用例一");
		Assert.assertEquals(actual, expected);
	}
@Test(dataProvider="datainfo")
public void test2(String info)
{
	WebDriver Driver=new FirefoxDriver();
	String actual;
	String expected;
	actual=info;
	int i;
	expected="2";
	assertion.flag=true;
	ScreenShot ss=new ScreenShot(Driver);
	ss.takeScreenshot();
	for (i=0;i<3;i++)
	{
		System.out.println("断言开始"+i);
		assertion.verifyassert(i, expected, "----测试两个字符串是否相同----");
		Log.logError("数据对比错误在--"+i+"轮循环内，期望值为["+expected+"]实际值为["+i+"]");
		//Assert.assertEquals(i, expected,"----测试两个字符串是否相同----");
		System.out.println("断言结束"+i);
	}
	Assert.assertTrue(assertion.flag);
	//通过获取UI上的某个对象的某种属性值和我的期望值作比较来验证是否正确，或者验证某个对象是否存在
	Driver.close();
	Driver.quit();
}
@DataProvider(name="datainfo")
public Object[][] datainfo()
	{
		return new Object[][]{{"1"},{"2"},{"3"}};
	}
}
