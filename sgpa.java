import java.util.*;
class Student
{
string usn,name;
int sem;
void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter USN, name , sem,");
usn=sc.next();
name=sc.nextLine();
sem=sc.nextInt();
}
void display()
{
System.out.println("USN="+usn);
System.out.println("Name="+name);
System.out.println("sem="+sem);
}
}
class Test extends Student
{

int cmarks=new int[5];
int credits=new int[5];
void getdata()
{
super.getdata();
for(int i=0;i<5;i++)
{
System.out.println("Enter cie marks and credits for subject"+i);
Scanner sc=new Scanner(System.in);
cmarks[i]=sc.nextInt();
credits[i]=sc.nextInt();
}}
void display()
{
super.display();
for(int i=0;i<5;i++)
{
System.out.println("cie marks in subject"+i+"is"+cmarks[i]);
}
}
}
class Exam extends Test
{
void getdata()
{

int smarks=new int[5];
super.getdata();
for(int i=0;i<5;i++)
{
System.out.println("Enter see marks for subject"+i);
Scanner sc=new Scanner(System.in);
smarks[i]=sc.nextInt();
}}
void display()
{
super.display();
for(int i=0;i<5;i++)
{
System.out.println("see marks in subject"+i+"is"+smarks[i]);
}
}
}
class Result extends Exam
{

float sgpa;
int sum=0;
int tcredits=0;
char grade=new char[5];
int points=new int[5];
int tmarks=new int[5];
void getdata()
{
super.getdata();

for(int i=0;i<5;i++)
{
tmarks[i]=cmarks[i]+smarks[i];
if(tmarks[i]>=90)
{
grade[i]='S';
points[i]=10;
}
else if(tmarks[i]>=75)
{
grade[i]='A';
points[i]=9;
}
else if(tmarks[i]>=65)
{
grade[i]='B';
points[i]=8;
}
else if(tmarks[i]>=55)
{
grade[i]='C';
points[i]=7;
}
else if(tmarks[i]>=45)
{
grade[i]='D';
points[i]=6;
}
else if(tmarks[i]>=40)
{
grade[i]='E';
points[i]=5;
}
else 
{
grade[i]='F';
points[i]=0;
} 
for(int i=0;i<5;i++)
{
sum=sum+(points[i]*credits[i]);
tcredits=tcredis+(credits[i]*10);
}
sgpa=(sum/tcredits)*10;
}}
void display()
{
super.display();

for(int i=0;i<5;i++)
{
System.out.println("Grade in subject"+i+"is "+grade[i]);
}
System.out.println("SGPA IS "+sgpa);
}
} 
class Sgpa
{
public static void main(String args[])
{
Result ob=new Result();
ob.getdata();
ob.display();
}
}












































