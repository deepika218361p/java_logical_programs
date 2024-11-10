import java.util.Scanner;
class Check2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int a=sc.nextInt();
if(a>0)
{
System.out.println(a+" is positive");
}
else if(a<0)
{
System.out.println(a+" is Negative");
}
else
{
System.out.println("Zero");
}
}
}