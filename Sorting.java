import java.util.*;
class Sorting
{
public static void main(String args[])
{
int i,j,temp;
Scanner sc=new Scanner(System.in);
system.out.print("Enter size of array");
int n=sc.nextInt();
int a[]=new int[n];
system.out.print("\nEnter array element");
for(i=0;i=n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
for(j=0;j<n-1-i;j++)
{
if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
system.out.println("Sorted array is");
for(i=0;i<n;i++)
{
system.out.println(a[i]+" ");
}
}
