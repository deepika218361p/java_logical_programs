import java.util.Scanner;
class Array1
{
public static void main(String args[])
{
int i,n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter elements in array:");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.println("The elements in array:");
for(i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}
