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
		System.out.println("��������һ");
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
		System.out.println("���Կ�ʼ"+i);
		assertion.verifyassert(i, expected, "----���������ַ����Ƿ���ͬ----");
		Log.logError("���ݶԱȴ�����--"+i+"��ѭ���ڣ�����ֵΪ["+expected+"]ʵ��ֵΪ["+i+"]");
		//Assert.assertEquals(i, expected,"----���������ַ����Ƿ���ͬ----");
		System.out.println("���Խ���"+i);
	}
	Assert.assertTrue(assertion.flag);
	//ͨ����ȡUI�ϵ�ĳ�������ĳ������ֵ���ҵ�����ֵ���Ƚ�����֤�Ƿ���ȷ��������֤ĳ�������Ƿ����
	Driver.close();
	Driver.quit();
}
@DataProvider(name="datainfo")
public Object[][] datainfo()
	{
		return new Object[][]{{"1"},{"2"},{"3"}};
	}
}
