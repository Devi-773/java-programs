public class elseiflargest
{
	public static void main(String[] args)
	{
	int a=10,b=20,c=15,MAX;
	if((a>b)&&(a>c))
	MAX=a;
	else if(b>c)
	MAX=b;
	else
	MAX=c;
	System.out.print("largest number is"+ MAX);
	}
}