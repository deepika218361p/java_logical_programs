import java.util.Scanner;
class EvenOdd
{
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in); 
System.out.println("Enter Array size:");
int n=sc.nextInt();
int arr[ ]=new int[n];
System.out.println("Enter array elements:");
for(int i=0; i<n; i++)
{
arr[i]=sc.nextInt();
}
int countEven = 0;
int countOdd = 0;
for(int i=0; i<n; i++)
{
if((arr[i] % 2 )== 0)
{
countEven += 1;
}else{
countOdd += 1;
}
}
System.out.println("Even Elements count : "+ countEven);
System.out.println("Odd Elements count : "+ countOdd);
}
}

