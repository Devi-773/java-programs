import java.util.*;
class tokenscount
{
	public static void main(String[] args)
	{
	StringTokenizer ob=new StringTokenizer("hello are you");
	StringTokenizer ob1=new StringTokenizer("hello,world",",");
	int a=ob.countTokens();
	System.out.println(a);
	int d=ob1.countTokens();
	System.out.print(d);
	}
}