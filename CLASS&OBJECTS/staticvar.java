//Static variable
import java.util.*;
class student1
{
 int rollno;
 String name;
 static String collage="IIITS";//static variable
 student1(int r,String n)
 {
  rollno=r;
  name=n;
 }
 void display()
 {
 System.out.println(rollno+" "+name+" "+collage+" ");
 }
}
class test
{
  public static void main(String[] args)
 {
  student1 s1=new student1(161,"leela");
  student1 s2=new student1(171,"jhanu");
  s1.display();
  s2.display();
 }
}