import java.util.*;
class AgeException extends Exception
{
String details;
AgeException(String s)
{
details=s;
}
public String toString()
{
return details;
}
}
class Fatherage
{
int fage;
Fatherage (int a) throws AgeException
{
if(a<0)

throw new AgeException("Wrong_age");
fage=a;
}
}
class Son
{
int sage;
Son(int a,int b) throws AgeException
{
if(a<b||b<0)
{
throw new AgeException("Wrong_age");
}
else 
{
sage=b;
}}
}
class Father
{
public static void main(String args[])
{
int d,f;
Scanner sc=new Scanner(System.in);
System.out.println("Enter age of father and son");
d=sc.nextInt();
f=sc.nextInt();
try
{
Son c=new Son(d,f);
}
catch (AgeException e)
{System.out.println(e);
}
}

}


