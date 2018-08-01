package info.cloudits.webdriver;
import org.testng.Assert;

public class assertion {
	public static boolean flag;
	public static void verifyassert(Object actual,Object expected)
	{
		try
		{
			Assert.assertEquals(actual, expected);
		}
		catch(Error e)
		{
			flag=false;
			Log.logError("数据对比错误在--循环内，期望值为");
			
		}
		
	}
	public static void verifyassert(Object actual,Object expected,String message)
	{
		try
		{
			Assert.assertEquals(actual, expected,message);
		}
		catch(Error e)
		{
			flag=false;
			Log.logError("数据对比错误在--轮循环内");
			
		}
	}
}
