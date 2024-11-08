import java.util.Scanner;
class Check
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in); 
System.out.println("Enter the number you want to check :");
int a=sc.nextInt();
if(a>=0)
{
System.out.println("Positive Number");
}
else
{
System.out.println("Negative number"); 
}
}
}