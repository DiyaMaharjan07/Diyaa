package workshop3;
import java.util.Scanner;


/**
 * Write a description of class GradeEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaluator
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numeric grade");
    int grade=sc.nextInt();
    
    
    String result=(grade>=40)?"PASS":"FAIL";
    System.out.println(result);
    }
}