import java.util.*;
class Rectangle
{int length;
 int width;
 void input(int a,int b)
{
 Scanner sc=new Scanner(System.in);
 system.out.print("enter length and breadth of rectangle");
 length=sc.nextInt();
 breadth=sc.nextInt();
}
void Output()
{
int area=length*breadth;
system.out.println("Area="+area);
}
}

 class Member
{
public static void main(String args[])
{
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();
r1.input();
r1.output();
r2.input();
r2.output();
}
}