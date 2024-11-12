class NegativeNumber 
{
public static void main(String[] args)
 {
int[] numbers = {1, 5, 3, -4, 6, -6, 7, -9, 9, -10};
System.out.println("Negative Numbers in the Array are: ");
for (int number : numbers)
{
if (number < 0) 
{
System.out.print(number + " ");
}
}
}
}