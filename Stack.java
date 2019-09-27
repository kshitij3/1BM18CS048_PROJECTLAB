import java.util.*;
Interface Intstack
{
void push(int);
int pop();
void display();
}
class Dynamics implements Intstack
{
int s[],top,size,int i=0,j;
Dynamics(int n)
{
size=n;
top=-1;
s=new int[size];
}
public void push(int item)
{a=new int[100];

if(top==size-1)
{
size*=2;
a[i]=new int[size];
for(j=0;j<size;j++)
if(i==0)
a[i][j]=s[j];
else
a[i][j]=a[i-1][j];
top=j;
}
else
s[++top]=item;
}
public int pop()
{
if(top==-1)
{
return -9999;
}
else
{
ele=s[top--];
return ele;
}
}
void check()
{
if(top==-1)
System.out.println("Stack is empty");
else 
System.out.println("Stack is not empty");
}




