class student 
{
int r;
long ph;
String name;
	void r()
	{
	System.out.println(r);
	}
	void ph()
	{
	System.out.println(ph);
	}
	void name()
	{
	System.out.println(name);
	}
}
class details
{
public static void main(String[] args)
{
student s1=new student();
s1.r=30;
s1.ph=9052518228l;
s1.name="devi";
s1.r();
s1.ph();
s1.name();
student s2=new student();
s2.r=31;
s2.ph=9052518338l;
s2.name="jagadish";
s2.r();
s2.ph();
s2.name();
}
}


