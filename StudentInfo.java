import java.util.Scanner;

/**
 * Write a description of class StudentInfo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentInfo
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Student name");
    String name=sc.nextLine();
    System.out.println("Enter age");
    int age=sc.nextInt();
    System.out.println("Enter GPA");
    float GPA=sc.nextFloat();

    System.out.println("The name of the Student is "+name);
    System.out.println("The age is"+age);
    System.out.println("GPA="+GPA);
    
    }
}