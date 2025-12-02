package Week4;
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
    int num1=sc.nextInt();
    System.out.println("Enter the Second number");
    int num2=sc.nextInt();
    System.out.println("Enter the operator as + - * / %");
    char operator=sc.next().charAt(0);
    
    switch(operator)
    {
    case'+':System.out.println("Sum is "+(num1+num2));
    break;
    case'-':System.out.println("Difference is "+(num1-num2));
    break;
    case'*':System.out.println("Multiplication is "+(num1*num2));
    break;
    case'/':System.out.println("Division is "+(num1/num2));
    break;
    case'%':System.out.println("Remainder is "+(num1%num2));
    break;
    default:
        System.out.println("Invalid Operator");
        
    }
    
    
    }
}