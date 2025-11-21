package workshop3;
import java.util.Scanner;


/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main (String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    int a=sc.nextInt();
    System.out.println("Enter the second number");
    int b=sc.nextInt();
    
    System.out.println("a>b"+(a>b)+"\n"+"a<b"+(a<b)+"\n"+"a>=b"+(a>=b)+"\n"+"a<=b"+(a<=b)+"\n"+"a!=b"+(a!=b)+"\n"+"a==b"+(a==b)+"\n");
    
    }

}