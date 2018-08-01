package info.cloudits.webdriver;



import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testng {
	@BeforeClass
	public void Bclass()
	{
		System.out.println("bclass");
	}
	@BeforeMethod
	public void setup()
	{
		System.out.println("setup");
	}
	@DataProvider
	public Object[][] logindata()
	{
		return new Object[][]{{"1"},{"2"}};
	}
	@DataProvider(name="logout")
	public Object[][] logoutdata()
	{
		return new Object[][]{{"a"},{"b"}};
	}
	@Test(dataProvider="logindata")
	public void test1(String a)
	{
		System.out.println(a);
	}
	@Test(dataProvider="logout")
	public void test2(String a)
	{
		System.out.println(a);
	}
	@Test
	public void testassert1()
	{
		System.out.println("开始断言");
		Assert.assertEquals(1, 1);
		System.out.println("结束断言");
	}
	@Test
	public void testassert2()
	{
		System.out.println("开始断言");
		Assert.assertEquals("1","2","----比较两个数是否相同");
		System.out.println("结束断言");
	}
	@Test
	public void testassert3()
	{
		assertion.flag=true;
		System.out.println("开始断言");
		assertion.verifyassert(1,2,"----比较两个数是否相同");
		System.out.println("结束断言");
		Log.logInfo("输出log");
	}
	@AfterMethod()
	public void teardown()
	{
		System.out.println("teardown");
	}
	@AfterClass()
	public void Aclass()
	{
		System.out.println("aClass");
	}
}
