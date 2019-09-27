import java.util.*;
abstract class Shape
{
int a;
abstract void area1();
}
class Triangle extends Shape
{
Scanner sc=new Scanner(System.in);
int b;
double areas;


void area1()
{
System.out.print("Enter base and height of triangle");

a=sc.nextInt();
b=sc.nextInt();
areas=0.5*a*b;
System.out.print("Area of triangle is "+areas);
}
}
class Rectangle extends Shape
{
int b;
double areas;
Scanner sc=new Scanner(System.in);

void area1()
{System.out.print("Enter lenghth and breadth of rectangle");
a=sc.nextInt();
b=sc.nextInt();
areas=a*b;
System.out.print("Area of triangle is "+areas);
}
}
class Circle extends Shape
{
int b;
double areas;
Scanner sc=new Scanner(System.in);

void area1()
{System.out.print("Enter radius of circle");
a=sc.nextInt();
areas=3.14*a*a;
System.out.print("Area of triangle is "+areas);
}
}
class Area
{
public static void main(String args[])
{
Triangle t=new Triangle();
t.area1();
Rectangle r=new Rectangle();
r.area1();
Circle c=new Circle();
c.area1();
}
}
