package info.cloudits.webdriver;

public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello webdriver");
		int i,mysum=0;
		for(i=1;i<=100;i++)
		{
			mysum=mysum+i;
		}
		System.out.println(mysum);
		System.out.println(sumx(5));
	}
	public static int sumx(int i)
	{
		return(i+1);
	}
	public int mysum(int x,int y)
	{
		return (x+y);
	}
}
