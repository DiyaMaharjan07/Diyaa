package Week4;
import java.util.Scanner;


/**
 * Write a description of class NestedIfExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NestedIfExample
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    
    if(num%3==0)
    {
        if(num%5==0)
        {
            System.out.println("Divisible both by 3 and 5");
        }
        else
        {
        System.out.println("Divisible by 3 and not 5");
        }
    }
    else 
    {
    if(num%5==0)
    {
    System.out.println("Divisible by 5 and not by 3");
    }
    else
    {
    System.out.println("Not divisible by both 3 and 5");
    }
    
    }
}
}