package workshop3;
import java.util.Scanner;


/**
 * Write a description of class Time here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Time
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter seconds");
    int s=sc.nextInt();
    
    int hour=s/3600;
    int a=(s%3600);
    int min=a/60;
    int sec=a%60;
    System.out.println("In hour"+hour);
    System.out.println("In minutes"+min);
    System.out.println("In second"+sec);
     
   
    
    
    }
}