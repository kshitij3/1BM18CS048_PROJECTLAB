import java.util.*;
class Array
{
public static void main(string args[])
{
int i ,j,max=0;
Scanner sc=new Scanner(System.in)
system.out.print("Enter no of rows");
int rsize=nextInt();
system.out.print("Enter no of coloumns");
int csize=nextInt();
int arr[][]=new int[rsize][csize];
system.out.print("Enter Array Elements");
for(i=0;i<rsize;i++)
{
for(j=0;j<csize;j++)
{
arr[i][j]=sc.nextInt();
}
system.out.print(\n);
}
for(int a[]:arr)
{
for(int x:a)
{
if(x>max)
max=x;
}}
system.out.print("\nMaximum array is"+max);
}
}
}
