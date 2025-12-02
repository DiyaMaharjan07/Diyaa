package Week4;
import java.util.Scanner;


/**
 * Write a description of class GradeConversion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeConversion
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the GPA");
    float GPA=sc.nextFloat();
    
    if(GPA>3.6)
    {System.out.println("The Grade is A+");}
    else if(GPA>3.2)
    {System.out.println("The Grade is A");}
    else if(GPA>2.8)
    {System.out.println("The Grade is B+");}
    else if(GPA>2.4)
    {System.out.println("The Grade is B");}
    else if(GPA>2)
    {System.out.println("The Grade is C+");}
    else if(GPA>1.6)
    {System.out.println("The Grade is C");}
    else if(GPA<1.6)
    {System.out.println("Grade = NG");}
    else
    {System.out.println("Invalid GPA");}
    
    
    }
}