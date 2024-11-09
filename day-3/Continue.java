import java.util.Scanner;
class Continue
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number :");
int n=sc.nextInt();
for(int i=1;i<=10;i++)
{
if(i==n)
{
continue;
}
System.out.println(i);
}
}
}