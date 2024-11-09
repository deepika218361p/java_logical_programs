import java.util.Scanner;
class Sum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int n=sc.nextInt();
int sum=0,i=1;
while(i<=n)
{
sum=sum+i;
i++;
}
System.out.println("The sum of the digits is :"+sum);
}
}