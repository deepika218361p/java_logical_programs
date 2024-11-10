import java.util.Scanner;
class Max
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter First number:");
int n=sc.nextInt();
System.out.println("Enter Second number:");
int x=sc.nextInt();
if(n>x)
{
System.out.println(n+"is big");
}
else
{
System.out.println(x+"is big");
}
}
}