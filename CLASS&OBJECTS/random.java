import java.util.*;
class random
{
	public static void main(String[] args)
	{
	Random ob=new Random(100);
	System.out.println(ob.nextInt());
	Random ob1=new Random(100);
	System.out.println(ob1.nextFloat());
	Random ob2=new Random(100);
	System.out.println(ob2.nextDouble());
	}
}