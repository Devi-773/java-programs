class geo
{
	int l,b;
	float r;
	double s,h;
	void area(int x,int y)
	{
	int a;
	l=x;
	b=y;
	a=l*b;
	System.out.print("area: "+a);
	}
	void area(float z);
	{
	r=z;
	System.out.print("area:"+Math.PI*r*r);
	}
	void area(double a,double b)
	{
	s=a;
	h=b;
	System.out.print("area:"+0.5*s*h);
	}
}
	class geometrys
	{
		public static void main(String[] args)
		{
		geo ob=new geo();
		ob.area(10,5);
		ob.area(10.5f);
		ob.area(5,6);
		}
	}
	