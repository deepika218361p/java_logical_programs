import java.util.Scanner;
class NegativeCount
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter array size: ");
int n = sc.nextInt();
int arr[] = new int[n];
System.out.println("Enter array elements:");
for (int i = 0; i < n; i++)
{
arr[i] = sc.nextInt();
}
int negativeCount = countNegatives(arr);
System.out.println("Total negative elements: " + negativeCount);
}
public static int countNegatives(int[] array)
{
int count = 0;
for (int element : array)
{
if (element < 0)
{
count++;
}
}
return count;
}
}