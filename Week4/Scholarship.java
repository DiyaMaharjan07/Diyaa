package Week4;
import java.util.Scanner;


/**
 * Write a description of class Scholarship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scholarship
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the GPA");
    float GPA=sc.nextFloat();
    System.out.println("Enter the attendance %");
    int attendance=sc.nextInt();
    System.out.println("Enter the attitude score(1-10) ");
    int attitude=sc.nextInt();
    
    if(GPA>=3.2)
    {
    if(attendance>=80)
    {
        if(attitude<5)
        {
            System.out.println("The student is eligible for a scholarship");
        }
     }
    }
}
}