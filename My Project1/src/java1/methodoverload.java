package java1;
import java.util.*;
public class methodoverload
{
public static int sum(int ar[])
{
int tot=0;
for(int i=0;i<=2;i++)
{
tot=tot+ar[i];
}
return (tot/3);
}
public static float sum(float ar1[])
{
float tot1=0;
for(int i=0;i<=2;i++)
{
tot1=tot1+ar1[i];
}
return (tot1/3);
}
public static void main(String args[])
{
float x,y;
int arr[]=new int[3];
float arr1[]=new float[3];
int c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter option 1) Integers 2)Float :");
c=sc.nextInt();
switch(c)
{
case 1:
{
System.out.println("Enter the Integers :");
for(int i=0;i<=2;i++)
{
arr[i]=sc.nextInt();
}
x=methodoverload.sum(arr);
System.out.println("Integer average is :"+x);
break;
}
case 2:
{
System.out.println("Enter the Float numbers :");
for(int i=0;i<=2;i++)
{
arr1[i]=sc.nextFloat();
}
y=methodoverload.sum(arr1);
System.out.println("Float average is :"+y);
break;
}
default:
{
System.out.println("Invalid option");
}
}
}
}

