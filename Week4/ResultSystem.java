package Week4;
import java.util.Scanner;


/**
 * Write a description of class ResultSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ResultSystem
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int percentage=sc.nextInt();
    if((percentage<=100) && (percentage>=90))
    {
     System.out.println("Distinction");
    }
    else if((percentage>=70) && (percentage<90))
    {
    System.out.println("First Division");
    }
    else if((percentage>=60) && (percentage<70))
    {
    System.out.println("Second Division");
    }
    else if((percentage>=50) && (percentage<60))
    {
    System.out.println("Third Division");
    }
    else if(percentage<40)
    {
    System.out.println("FAIL");
}
else
{
    System.out.println("Invalid");
}

    }
}