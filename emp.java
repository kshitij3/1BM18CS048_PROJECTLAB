class Newthread1 implements Runnable
{
Thread t1;
Newthread1()
{
t1=new Thread(this,"T1");
t1.start();

}}
public void run()
{
try
{
while(true)
{
System.out.println("BMSCE");
Thread.sleep(10000);
}
}
catch(InterruptedException e)
{
System.out.println("Caught Eception 1");
}
}
class Newthread2 implements Runnable
{
Thread t2;
Newthread2()
{
t2=new Thread(this,"T2");
t2.start();
}
public void run()
{
while(true)
{
try
{
System.out.println("CSE");
Thread.sleep(2000);
}
catch(InterrupteExceotion e2)
{
System.out.println("Interrupted Exception 2");
}}}}
class Emp
{
public static void main(String args[])
{
Newthread1 a=new Newthread1();
Newthread2 b=new Newthread2();
try
{
a.t1.join();
b.t2.join();
}catch(InterruptedException e)
{
System.out.println("Wrong");
}
}
}


