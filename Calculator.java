import java.util.Scanner;

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    int a=sc.nextInt();
    System.out.println("Enter the second number");
    int b=sc.nextInt();
    
    int sum=a+b;
    int sub=a-b;
    int mul=a*b;
    int div=a/b;
    int rem=a%b;
    
    System.out.println("The sum is "+sum);
    System.out.println("The difference is "+sub);
    System.out.println("The multiplication is "+mul);
    System.out.println("The division is "+div);
    System.out.println("The remainder is "+rem);
    
    
    }
}