class Q
{
int n;
boolean valueset=false;
synchronized int get()
{
while(!valueset)
{
try
{
wait();
}
}
catch(InterruptedException e)
{
System.out.println("Got"+n);
value set=false;
notify();
return n;
}
}
Synchronized void put(int n)
{
while(valueset)
{
try
{
wait();
}

}
catch(InterruptedException e)
{
System.out.println("Interrupted");
}
this.n=n;
valueset=true;
notify();
System.out.println("put"+n);
}
}
class Producer implements Runnable
{
Q q;
Producer(Q q)
{
this.q=q;
new thread(this,"producer").start();
}
public void run()
{
int i;
while(true)
q.put(i++);
}
}
}
class Consumer implements Runnable
{
Q q;
Consumer (Q q)
{
this.q=q;
new Thread(this,"Consumer");
}
public void run()
{
while(true)
{
q.get();
}
}
}
class PC
{
public static void main()
{
Q q=new Q();
new producer();
new consumer();
}
}






















































