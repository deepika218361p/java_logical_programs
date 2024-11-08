import java.util.Scanner;
class Student
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Student name :");
String sname=sc.next();
System.out.println("Enter the Student number :");
int sno=sc.nextInt();
System.out.println("Enter the Subject1 marks :");
int s1=sc.nextInt();
System.out.println("Enter the Subject2 marks :");
int s2=sc.nextInt();
System.out.println("Enter the Subject3 marks :");
int s3=sc.nextInt();
int Total=s1+s2+s3;
int Avg=(Total)/3;
System.out.println("Student Name:"+sname);
System.out.println("Student Number:"+sno);
System.out.println("Subject1 Marks:"+s1);
System.out.println("Subject2 Marks:"+s2);
System.out.println("Subject3 Marks:"+s3);
System.out.println("Total marks obtained by Student "+sname+"is"+Total);
System.out.println("Average Marks:"+Avg);
}
}