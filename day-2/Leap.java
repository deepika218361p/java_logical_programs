import java.util.Scanner;
class Leap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int a=sc.nextInt();
if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0))
{
System.out.println(a + " is a Leap Year");
}
else
{
System.out.println(a+" is not Leap Year");
}
}
}