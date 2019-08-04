//Static method
import java.util.*;
class student2
{
 int rollno;
 String name;
 static String collage="IIITS";//static method to change variable
 static void change()
 {
 collage="IITS";
 }
 student2(int r,String n)
 {
  rollno=r;
  name=n;
  }
  void display()
  {
  System.out.println(rollno+" "+name+" "+collage);
 }
}
class test1
{
 public static void main(String args[])
 {
  student2.change();
  student2 s1=new student2(161,"leela");
   student2 s2=new student2(151,"le");
   student2 s3=new student2(181,"jhan");
 s1.display();
 s2.display();
 s3.display();
}
}