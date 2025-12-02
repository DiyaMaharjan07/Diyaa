package Week4;
import java.util.Scanner;


/**
 * Write a description of class PositiveNegative here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PositiveNegative
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    if(num>0)
    {
    System.out.println("The number is positive");
    }
    else
    {
    System.out.println("The number is negative");

}
    
    
    }
}