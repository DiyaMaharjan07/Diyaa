package workshop3;
import java.util.Scanner;


/**
 * Write a description of class Days here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Days
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter days");
    int d=sc.nextInt();
    
    int year=d/365;
    int a=(d%365);
    int month=a/30;
    int days=a%30;
    
    System.out.println("Year"+year);
    System.out.println("Month"+month);
    System.out.println("Days"+days);
    
    
}
}