class obj
{
int a,b,c;
obj(obj x)
{
a=x.a;
b=x.b;
c=x.c;
}
obj(int x,int y,int z)
{
a=x;
b=y;
c=z;
}
int product()
{
return (a*b*c);
}
}
class passmain
{
	public static void main(String[] args)
	{
	obj s=new obj(10,20,30);
	obj r=new obj(s);
	int pro;
	pro=s.product();
	System.out.println(pro);
	pro=r.product();
	System.out.print(pro);
	}
}
